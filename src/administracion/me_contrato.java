//Metodo de la tabla CONTRATO
package administracion;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Larissa López
 */
public class me_contrato {
    
Connection db = null;
Statement st = null;
ResultSet rs = null;
PreparedStatement pst=null;

Integer idcontrato;
Date fecha;
String duracion; 
Float sueldo, seguroc, totalsueld;
String sql;
Boolean a;
//Conexion base datos    
public void conecciondb() {
  try {
      db=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Administracion de Talento Humano","postgres","Larissa3001"); 
          //Acualize ruta .../basedatos,usuario,contraseña
      } catch (SQLException e) {System.out.println("Ocurrio un error : "+e.getMessage());} }
//Ingreso  de datos de a tabla CONTRATO
public void insertar_contrato() throws SQLException {
if (a==false) { conecciondb();
 idcontrato=Integer.valueOf(contrato.a5.getText());
 fecha=Date.valueOf(contrato.a6.getText());
 duracion=contrato.a7.getText();
 sueldo=Float.valueOf(contrato.a8.getText());
 seguroc=Float.valueOf(contrato.a9.getText());
 totalsueld=Float.valueOf(contrato.a10.getText());
 sql ="insert into contrato (id_contrato,fecha_contrato,duracion_contrato, sueldo_contrato, seguro, total_sueldo) values (?,?,?,?,?,?)";
 pst = db.prepareStatement(sql);
 pst.setInt(1,idcontrato);
 pst.setDate(2,fecha);
 pst.setString(3,duracion);
 pst.setDouble(4,sueldo);
 pst.setDouble(5,seguroc);
 pst.setDouble(6,totalsueld);
 pst.executeUpdate();
 JOptionPane.showMessageDialog(null,"Sus datos fueron actualizados correctamente..."); } }

//Actualiza  de datos de a tabla CONTRATO
public void actuali_contrato() throws SQLException {
if (a==true) { conecciondb();
 fecha=Date.valueOf(contrato.a6.getText());
 duracion=contrato.a7.getText(); 
 sueldo=Float.valueOf(contrato.a8.getText());
 seguroc=Float.valueOf(contrato.a9.getText());
 totalsueld=Float.valueOf(contrato.a10.getText());
 sql = "update contrato set fecha_contrato=?, duracion_contrato=?,sueldo_contrato=?, seguro=?, total_sueldo=? where id_contrato='"+idcontrato+"'";
 pst = db.prepareStatement(sql);
 pst.setDate(1,fecha);
 pst.setString(2,duracion);
 pst.setDouble(3,sueldo);
 pst.setDouble(4,seguroc);
 pst.setDouble(5,totalsueld);
 pst.executeUpdate();
 JOptionPane.showMessageDialog(null,"Sus datos fueron actualizados correctamente..."); } }

//Consulta datos de a tabla CONTRATO
public void consulta_contrato() throws SQLException {
 conecciondb(); 
 st = db.createStatement();
 idcontrato=Integer.valueOf(contrato.a5.getText());
 rs = st.executeQuery("select * from contrato where id_contrato='"+idcontrato+"'");
 if (rs.next()) {a=true;
  contrato.a6.setText(rs.getString(2));
  contrato.a7.setText(rs.getString(3));
  contrato.a8.setText(rs.getString(4));
  contrato.a9.setText(rs.getString(5));
  contrato.a10.setText(rs.getString(6));
 }
 else {JOptionPane.showMessageDialog(null,"No Existe...");a=false;} }

//Elimina datos de la tabla CONTRATO si existe, caso contrario si  está en otra tabla no lo elimina
public void elimina_contrato() throws SQLException {
 try {
 if (a==true) { conecciondb();
 int resp = JOptionPane.showConfirmDialog(null, "Lo elimina","ALERTA",JOptionPane.YES_NO_OPTION);
 if (resp!=1) {st.execute("delete from contrato where id_contrato='"+idcontrato+"'");
   JOptionPane.showMessageDialog(null,"Se eliminaron los datos"); } } 
    }
 catch (SQLException e) {JOptionPane.showMessageDialog(null,"No se puede eliminar, tiene relación con otra tabla");} }

//Limpiar datos entrada de la tabla CONTRATO
public void limpia() {
contrato.a5.setText("");
contrato.a6.setText("");
contrato.a7.setText("");
contrato.a8.setText("");
contrato.a9.setText("");
contrato.a10.setText("");
}

}


