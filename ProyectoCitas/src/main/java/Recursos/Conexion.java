/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    private String driver, url, ip, bd, usr, pass;
    public Connection conexion;
    Statement statement;
    ResultSet rs;
    private String Conexion;

    public Conexion(String ip, String bd, String usr, String pass) {
        driver = "com.mysql.cj.jdbc.Driver";
        this.bd = bd;
        this.usr = usr;
        this.pass = pass;
        url = "jdbc:mysql://localhost:3306/bd_citas";
        try {
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(url, usr, pass);
            statement = conexion.createStatement();
            
           statement.executeUpdate("INSERT INTO PACIENTES (PacIdentificacion, PacNombre, PacApellidos, PacFechaNacimiento, PacSexo) VALUES ('1234', 'Eddy', 'Vampiro', '23/04/23', 'M')");
            rs= statementexecuteQuery("SELECT * FROM PACIENTES");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos");
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public Connection CerrarConexion() {
        try {
            conexion.close();
            conexion = null;
            return conexion;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión a la base de datos");
            return null;
        }
    }

    // Método para insertar datos en la tabla pacientes
    public void insertarPaciente(String identificacion, String nombre, String apellidos, String fechaNacimiento, String sexo) {
        try {
            // Consulta SQL parametrizada para prevenir inyección de SQL
            String query = "INSERT INTO pacientes (PacIdentificacion, PacNombre, PacApellidos, PacFechaNacimiento, PacSexo) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conexion.prepareStatement(query);
            pstmt.setString(1, identificacion);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellidos);
            pstmt.setString(4, fechaNacimiento);
            pstmt.setString(5, sexo);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar datos en la base de datos");
        }
    }

    private ResultSet statementexecuteQuery(String select__from_pacientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
