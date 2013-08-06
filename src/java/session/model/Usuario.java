/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session.model;

/**
 *
 * @author Renann
 */
public class Usuario implements java.io.Serializable {
            private String nome;
            private String data_n ;
            private String prat_f;
            private String tipo_atv;
            private String tel;
            private String ender;
            private String bairro;
            private String cidade;
            private String estado;
            private String pais;
            private String sexo;
            private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_n() {
        return data_n;
    }

    public void setData_n(String data_n) {
        this.data_n = data_n;
    }

    public String getPrat_f() {
        return prat_f;
    }

    public void setPrat_f(String prat_f) {
        this.prat_f = prat_f;
    }

    public String getTipo_atv() {
        return tipo_atv;
    }

    public void setTipo_atv(String tipo_atv) {
        this.tipo_atv = tipo_atv;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
   
    }
}
   