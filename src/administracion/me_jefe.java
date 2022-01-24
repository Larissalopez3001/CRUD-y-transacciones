//Metodo la de tabla JEFE
package administracion;

import java.sql.*;
import javax.swing.JOptionPane;

public class me_jefe {
    
Connection db = null;
Statement st = null;
ResultSet rs = null;
PreparedStatement pst=null;

Integer idjefe, numjefe;
String cedujefe, nomjefe; 
String sql;
Boolean a;

//Conexión base datos de POSTGRES
public void conecciondb() {
  try {
      db=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Administracion de Talento Humano","postgres","Larissa3001"); 
          //Acualize ruta .../basedatos,usuario,contraseña
      } catch (SQLException e) {System.out.println("Ocurrio un error : "+e.getMessage());} }

//Ingreso de datos de a tabla JEFE
public void inserta_jefe() throws SQLException {
if (a==false) { conecciondb();
 idjefe=Integer.valueOf(jefe.a5.getText());
 cedujefe=jefe.a6.getText();
 nomjefe=jefe.a7.getText();
 numjefe=Integer.valueOf(jefe.a8.getText());
 sql = "insert into jefe (id_jefe,cedula_jefe,nombre_jefe, num_jefe) values (?,?,?,?)";
 pst = db.prepareStatement(sql);
 pst.setInt(1,idjefe);
 pst.setString(2,cedujefe);
 pst.setString(3,nomjefe);
 pst.setInt(4,numjefe);
 pst.executeUpdate();
 JOptionPane.showMessageDialog(null,"Sus datos fueron guardados correctamente..."); } }

//Actualiza datos de la tabla JEFE
public void actuali_jefe() throws SQLException {
if (a==true) { conecciondb();
 cedujefe=jefe.a6.getText();
 nomjefe=jefe.a7.getText(); 
 numjefe=Integer.valueOf(jefe.a8.getText());
 sql = "update jefe set cedula_jefe=?, nombre_jefe=?, num_jefe=? where id_jefe='"+idjefe+"'";
 pst = db.prepareStatement(sql);
 pst.setString(1,cedujefe);
 pst.setString(2,nomjefe);
 pst.setInt(3,numjefe);
 pst.executeUpdate();
 JOptionPane.showMessageDialog(null,"Sus datos fueron actualizados correctamente..."); } }


//Consulta datos de la tabla JEFE
public void consulta_jefe() throws SQLException {
 conecciondb(); 
 st = db.createStatement();
 idjefe=Integer.valueOf(jefe.a5.getText());
 rs = st.executeQuery("select * from jefe where id_jefe='"+idjefe+"'");
 if (rs.next()) {a=true;
  jefe.a6.setText(rs.getString(2));
  jefe.a7.setText(rs.getString(3));
  jefe.a8.setText(rs.getString(4));
 }
 else {JOptionPane.showMessageDialog(null,"No existe...");a=false;} }

//Elimina datos de la tabla JEFE si existe, caso contrario si  está en otra tabla no lo elimina
public void elimina_jefe() throws SQLException {
 try {
 if (a==true) { conecciondb();
 int resp = JOptionPane.showConfirmDialog(null, "Lo elimina","ALERTA",JOptionPane.YES_NO_OPTION);
 if (resp!=1) {st.execute("delete from jefe where id_jefe='"+idjefe+"'");
   JOptionPane.showMessageDialog(null,"Se eliminaron los datos"); } } 
    }
 catch (SQLException e) {JOptionPane.showMessageDialog(null,"No se puede eliminar, tiene relación con otra tabla");} }

//Limpiar datos entrada de la tabla JEFE
public void limpia() {
jefe.a5.setText("");
jefe.a6.setText("");
jefe.a7.setText("");
jefe.a8.setText("");
}

}


