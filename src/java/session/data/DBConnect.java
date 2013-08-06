/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Renann
 */
public abstract class DBConnect {
    
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/qualysys", "root", "root");
        
    }
            
    
}
