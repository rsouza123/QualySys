/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session.model;

/**
 *
 * @author Renann
 */
public class Login implements java.io.Serializable{
    
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
