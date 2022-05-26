

package utilerias;

import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {

public static Connection conexion;
public static Statement sentencia;

public static void conectar(String url, String nombre, String clave){
    try{
        Class.forName("com.mysql.jdbc.Driver");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error del Driver");
    }
     try{
        conexion=DriverManager.getConnection(url, nombre, clave);
        sentencia=conexion.createStatement();
    }
    catch(SQLException sqle){
        JOptionPane.showMessageDialog(null, "Fallo de Conexion");
    }
}
}