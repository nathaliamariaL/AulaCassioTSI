/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dados.Medico;
import dados.PostoDeSaude;
import java.sql.PreparedStatement;

/**
 *
 * @author 276764
 */
public class Med_DAO {
    
    public void inserir(Medico med) throws Exception{
        
        Conexao c = new Conexao();
        String sql = "INSERT INTO medico(crm_medico, nome_medico, endereco_medico, telefone_medico, email_medico) VALUES (?,?,?,?,?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        PostoDeSaude post = new PostoDeSaude();
        ps.setString(1,med.getCrm_medico());
        ps.setString(2,med.getNome_medico());
        ps.setString(3,med.getEndereco_medico());
        ps.setInt(4, med.getTelefone_medico());
        ps.setString(5,med.getEmail_medico());
        ps.execute();
        c.confirmar();
        
    }

    
}
