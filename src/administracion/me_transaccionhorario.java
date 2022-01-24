//Metodo: Varios métodos de tabla HORARIO
package administracion;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Larissa López
 */
public class me_transaccionhorario {
    
Connection db = null;
Statement st = null;
ResultSet rs = null;
PreparedStatement pst=null;

Integer idhorario, iddepa;
String duracionc; 
Time horaen, horasa;
Float horaex, pagoex, totalex;
String sql;
Boolean a;

//Conexion base datos    
public void conecciondb() {
  try {
      db=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Administracion de Talento Humano","postgres","Larissa3001"); 
          //Acualize ruta .../basedatos,usuario,contraseña
      } catch (SQLException e) {System.out.println("Ocurrio un error : "+e.getMessage());} }


//Consulta datos de la tabla HORARIO
public void consultar_horario() throws SQLException {
 conecciondb(); 
 st = db.createStatement();
 idhorario=Integer.valueOf(transaccion_horario.a5.getText());
 rs = st.executeQuery("select * from horario where id_horario='"+idhorario+"'");
 if (rs.next()) {a=true;
  transaccion_horario.a6.setText(rs.getString(2));
  transaccion_horario.a7.setText(rs.getString(3));
  transaccion_horario.a8.setText(rs.getString(4));
  transaccion_horario.a9.setText(rs.getString(5));
  transaccion_horario.a10.setText(rs.getString(6));
  transaccion_horario.a11.setText(rs.getString(7));
 }
 else {JOptionPane.showMessageDialog(null,"No Existe...");a=false;} }

//Limpiar datos entrada de la tabla HORARIO
public void limpiar() {
transaccion_horario.a5.setText("");
transaccion_horario.a6.setText("");
transaccion_horario.a7.setText("");
transaccion_horario.a8.setText("");
transaccion_horario.a9.setText("");
transaccion_horario.a10.setText("");
transaccion_horario.a11.setText("");
}
//Realiza la transacción de la tabla HORARIO
public void transaccion() throws SQLException {
try {
if (a==false) { conecciondb();
 idhorario=Integer.valueOf(transaccion_horario.a5.getText());
 iddepa=Integer.valueOf(transaccion_horario.a6.getText());
 horaen=Time.valueOf(transaccion_horario.a7.getText());
 horasa=Time.valueOf(transaccion_horario.a8.getText());
 horaex=Float.valueOf(transaccion_horario.a9.getText());
 pagoex=Float.valueOf(transaccion_horario.a10.getText());
 totalex=Float.valueOf(transaccion_horario.a11.getText());
 sql = "insert into horario (id_horario,id_departamento,hora_entrada, hora_salida, hora_extras, pago_horaextra, total_hora) values (?,?,?,?,?,?,?)";
 pst = db.prepareStatement(sql);
 pst.setInt(1,idhorario);
 pst.setInt(2,iddepa);
 pst.setTime(3,horaen);
 pst.setTime(4,horasa);
 pst.setFloat(5,horaex);
 pst.setFloat(6,pagoex);
 pst.setFloat(7,totalex);
 rs.next();
 pst.executeUpdate();
//Llama al procedimiento alamcenado de la tabla HORARIO
CallableStatement cst = db.prepareCall("call totalhoraextra()");
cst.execute();
PreparedStatement pstnt = db.prepareStatement("select max(id_horario) from horario where total_hora is null");
rs=pstnt.executeQuery();
JOptionPane.showMessageDialog(null,"Su transacción se realizó con éxito, se efectuó el COMMIT");}
}
catch (SQLException e) {JOptionPane.showMessageDialog(null,"Su transacción no se realizó, se efectuó el ROLLBACK");}}
}


