//Metodo: Varios métodos de tabla CONTRATO
package administracion;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Larissa López
 */
public class me_transaccioncontrato {
    
Connection db = null;
Statement st = null;
ResultSet rs = null;
PreparedStatement pst=null;

Integer idcontrat;
Date fechac;
String duracionc; 
Float sueldoc, seguroc, totalsueld;
String sql;
Boolean a;

//Conexion base datos    
public void conecciondb() {
  try {
      db=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Administracion de Talento Humano","postgres","Larissa3001"); 
          //Acualize ruta .../basedatos,usuario,contraseña
      } catch (SQLException e) {System.out.println("Ocurrio un error : "+e.getMessage());} }


//Consulta datos de la tabla CONTRATO
public void consulta_contrato() throws SQLException {
 conecciondb(); 
 st = db.createStatement();
 idcontrat=Integer.valueOf(transaccion_contrato.a5.getText());
 rs = st.executeQuery("select * from contrato where id_contrato='"+idcontrat+"'");
 if (rs.next()) {a=true;
  transaccion_contrato.a6.setText(rs.getString(2));
  transaccion_contrato.a7.setText(rs.getString(3));
  transaccion_contrato.a8.setText(rs.getString(4));
  transaccion_contrato.a9.setText(rs.getString(5));
  transaccion_contrato.a10.setText(rs.getString(6));
 }
 else {JOptionPane.showMessageDialog(null,"No Existe...");a=false;} }

//Limpiar datos entrada de la tabla CONTRATO
public void limpia() {
transaccion_contrato.a5.setText("");
transaccion_contrato.a6.setText("");
transaccion_contrato.a7.setText("");
transaccion_contrato.a8.setText("");
transaccion_contrato.a9.setText("");
transaccion_contrato.a10.setText("");
}

//Realiza la transacción de la tabla CONTRATO
public void transaccion() throws SQLException {
try {
if (a==false) {
conecciondb();
idcontrat=Integer.valueOf(transaccion_contrato.a5.getText());
 fechac=Date.valueOf(transaccion_contrato.a6.getText());
 duracionc=transaccion_contrato.a7.getText();
 sueldoc=Float.valueOf(transaccion_contrato.a8.getText());
 seguroc=Float.valueOf(transaccion_contrato.a9.getText());
 totalsueld=Float.valueOf(transaccion_contrato.a10.getText());
 sql = "insert into contrato (id_contrato,fecha_contrato,duracion_contrato, sueldo_contrato, seguro, total_sueldo) values (?,?,?,?,?,?)";
 pst = db.prepareStatement(sql);
 pst.setInt(1,idcontrat);
 pst.setDate(2,fechac);
 pst.setString(3,duracionc);
 pst.setFloat(4,sueldoc);
 pst.setFloat(5,seguroc);
 pst.setFloat(6,totalsueld);rs.next();
pst.executeUpdate();
//Llama al procedimiento alamcenado de la tabla CONTRATO
CallableStatement cst = db.prepareCall("totalsueldo()");
cst.execute();
PreparedStatement pstnt = db.prepareStatement("select max(id_contrato) from contrato where total_sueldo is null ");
rs=pstnt.executeQuery();
rs.close();
JOptionPane.showMessageDialog(null,"Su transacción se realizó con éxito, se efectuó el COMMIT");}
}catch (SQLException e) {JOptionPane.showMessageDialog(null,"Su transacción no se realizó, se efectuó el ROLLBACK");}}
}

