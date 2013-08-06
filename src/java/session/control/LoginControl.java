/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session.control;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import session.data.LoginDAO;

/**
 *
 * @author Renann
 */
public class LoginControl {
    private LoginDAO dao;

    public LoginControl() throws SQLException, ClassNotFoundException {
        dao = new LoginDAO();
    }
    
    public boolean  isAutentic(String usuario, String senha){
        try {
            return dao.isAutentic(usuario, senha);
        } catch (SQLException ex) {
            Logger.getLogger(LoginControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    
}
