/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Renann
 */
public class LoginDAO extends DBConnect {
    private Connection cx;
    private PreparedStatement ptmt;
    private ResultSet rs;

    public LoginDAO() throws SQLException, ClassNotFoundException {
        this.cx = getConnection();
        
    }
    
    public boolean isAutentic(String usuario,String senha) throws SQLException{
        ptmt = cx.prepareStatement("SELECT * FROM USUARIO WHERE LOGIN = ? AND SENHA = ?");
        ptmt.setString(1, usuario);
        ptmt.setString(2, senha);
        rs = ptmt.executeQuery();
        return rs.next();
        
        }
        
        
    }
    
    

