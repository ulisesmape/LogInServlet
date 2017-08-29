//Se importan los paquetes
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

//Se inicia la clase para inciar la sesión
public class Inicio {
        //Se inicia el método para dar validez al correo y contraseña
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Welcome user");
      }  
} //Se cierra la clase
