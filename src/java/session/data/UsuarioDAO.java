/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import session.model.Usuario;

/**
 *
 * @author Renann
 */
public class UsuarioDAO extends DBConnect {
    private Connection cx;
    private PreparedStatement ptmt;
    private ResultSet rs;

    public UsuarioDAO() throws ClassNotFoundException, SQLException {
        this.cx = getConnection();
              
    }
    
    public void adiciona(Usuario usuario) throws SQLException{
             try {
        ptmt = this.cx.prepareStatement("INSERT INTO `qualysys`.`entrevistado` (`nome`, `data_n`,`prat_f`,`tipo_atv`,`tel`,`ender`,`bairro`,`cidade`,`estado`,`pais`,`sexo`,`e-mail`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);");
        ptmt.setString(1,usuario.getNome()); 
        ptmt.setString(2,usuario.getData_n());
        ptmt.setString(3,usuario.getPrat_f());
        ptmt.setString(4,usuario.getTipo_atv());
        ptmt.setString(5,usuario.getTel());
        ptmt.setString(6,usuario.getEnder());
        ptmt.setString(7,usuario.getBairro());
        ptmt.setString(8,usuario.getCidade());
        ptmt.setString(9,usuario.getEstado());
        ptmt.setString(10,usuario.getPais());
        ptmt.setString(11,usuario.getSexo());
        ptmt.setString(12,usuario.getEmail());
        
        ptmt.executeUpdate();
        ptmt.close();
            
        } catch (Exception e) {
            e.getMessage();
        }
              System.out.print("erro ao inserir o entrevistado");
             }
        
       
       
        
    }
    
    

