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
public class Paciente {
    
    private int id_paci;
    private String rg_paci;
    private String nome_paci;
    private String endereco_paci;
    private int telefone_paci;
    private String email_paci;
    private Medico med;

    public int getId_paci() {
        return id_paci;
    }

    public void setId_paci(int id_paci) {
        this.id_paci = id_paci;
    }

    public String getRg_paci() {
        return rg_paci;
    }

    public void setRg_paci(String rg_paci) {
        this.rg_paci = rg_paci;
    }

    public String getNome_paci() {
        return nome_paci;
    }

    public void setNome_paci(String nome_paci) {
        this.nome_paci = nome_paci;
    }

    public String getEndereco_paci() {
        return endereco_paci;
    }

    public void setEndereco_paci(String endereco_paci) {
        this.endereco_paci = endereco_paci;
    }

    public int getTelefone_paci() {
        return telefone_paci;
    }

    public void setTelefone_paci(int telefone_paci) {
        this.telefone_paci = telefone_paci;
    }

    public String getEmail_paci() {
        return email_paci;
    }

    public void setEmail_paci(String email_paci) {
        this.email_paci = email_paci;
    }


    public Medico getMed() {
        return med;
    }

    public void setMed(Medico med) {
        this.med = med;
    }
    
    
}
