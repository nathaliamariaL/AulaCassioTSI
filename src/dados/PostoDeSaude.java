/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author 276764
 */
public class PostoDeSaude {

 private int cnpj_posto;
 private String nome_posto;
 private String endereco_posto;
 private int telefone_posto;
 private String email_posto;

    public int getCnpj_posto() {
        return cnpj_posto;
    }

    public void setCnpj_posto(int cnpj_posto) {
        this.cnpj_posto = cnpj_posto;
    }

    public String getNome_posto() {
        return nome_posto;
    }

    public void setNome_posto(String nome_posto) {
        this.nome_posto = nome_posto;
    }

    public String getEndereco_posto() {
        return endereco_posto;
    }

    public void setEndereco_posto(String endereco_posto) {
        this.endereco_posto = endereco_posto;
    }

    public int getTelefone_posto() {
        return telefone_posto;
    }

    public void setTelefone_posto(int telefone_posto) {
        this.telefone_posto = telefone_posto;
    }

    public String getEmail_posto() {
        return email_posto;
    }

    public void setEmail_posto(String email_posto) {
        this.email_posto = email_posto;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}