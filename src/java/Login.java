//Se importan los paquetes
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

//Se abre la clase extendiendo las necesidades de Html
public class Login extends HttpServlet{
        
        //Se crea el metodo para ingresar usuario y correo
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String correo = request.getParameter("correo");
        String contraseña = request.getParameter("contraseña");
        
        if(Validate.checkUser(correo, contraseña))
        {
            RequestDispatcher rs = request.getRequestDispatcher("Welcome");
            rs.forward(request, response);
        }
        else
        {
           out.println("Username or Password incorrect");
           RequestDispatcher rs = request.getRequestDispatcher("index.html");
           rs.include(request, response);
        } //Se termina el método
    }  
}//Se cierra la clase

