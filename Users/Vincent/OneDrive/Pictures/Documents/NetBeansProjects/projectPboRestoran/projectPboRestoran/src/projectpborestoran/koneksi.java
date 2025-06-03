/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpborestoran;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vincent
 */
public class koneksi {
    private static Connection con;
    
    public static Connection getConnection() throws SQLException
    {
        if (con==null)
        {
            new Driver();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restoran", "root", "");
        }
        return con;
    }
}
