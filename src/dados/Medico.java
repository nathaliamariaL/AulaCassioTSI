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
public class Medico {
    
    private String crm_medico;
    private String nome_medico;
    private String endereco_medico;
    private int telefone_medico;
    private String email_medico;
     private Paciente paci;

    public Paciente getPaci() {
        return paci;
    }

    public void setPaci(Paciente paci) {
        this.paci = paci;
    }


 public String getCrm_medico() {
        return crm_medico;
    }

    public void setCrm_medico(String crm_medico) {
        this.crm_medico = crm_medico;
    }

    public String getNome_medico() {
        return nome_medico;
    }

    public void setNome_medico(String nome_medico) {
        this.nome_medico = nome_medico;
    }

    public String getEndereco_medico() {
        return endereco_medico;
    }

    public void setEndereco_medico(String endereco_medico) {
        this.endereco_medico = endereco_medico;
    }

    public int getTelefone_medico() {
        return telefone_medico;
    }

    public void setTelefone_medico(int telefone_medico) {
        this.telefone_medico = telefone_medico;
    }

    public String getEmail_medico() {
        return email_medico;
    }

    public void setEmail_medico(String email_medico) {
        this.email_medico = email_medico;
    }


    
    
}
