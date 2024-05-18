/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TestBD;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String usr ="root";
       String pw ="";
       String url = "jdbc:mysql://localhost:3306/bd_citas";
       Connection conexion;
       Statement statement;
       ResultSet rs;
       
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexion = DriverManager.getConnection(url, usr, pw);
            statement = conexion.createStatement();
            
            statement.executeUpdate("INSERT INTO PACIENTES (PacIdentificacion, PacNombre, PacApellidos, PacFechaNacimiento, PacSexo) VALUES ('1234', 'Eddy', 'Vampiro', '23/04/23', 'M')");
            rs= statement.executeQuery("SELECT * FROM PACIENTES");
            
            
            rs.next();
                do {
                    System.out.println(rs.getInt("PacIdentificacion") + ":" + rs.getString("PacNombre") + ":" + rs.getString("PacApellidos")+ ":" + rs.getString("PacFechaNacimiento") + ":" + rs.getString("PacSexo"));
                } while (rs.next());

                } catch (ClassNotFoundException | SQLException ex) {
                 ex.printStackTrace();
                     }
       
       
        // TODO code application logic here
    }
    
}
