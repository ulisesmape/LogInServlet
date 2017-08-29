//Se importa el paquetes
import java.sql.*;

//Se inicia la clase
public class Validate
 {
     //Se inicia el metodo para checar el correo y la contraseña
    public static boolean checkUser(String correo,String contraseña) 
     {
      boolean st =false;
      try{

	 //Drivers de MySql
         Class.forName("com.mysql.jdbc.Driver");

 	
         //Se busca en la base de datos
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql:/ /localhost/login","root","n0m3l0");
         PreparedStatement ps =con.prepareStatement
                             ("select * from registros where correo=? and contraseña=?");
         ps.setString(1, correo);
         ps.setString(2, contraseña);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   //Se cierra el método
}//Se cierra la clase