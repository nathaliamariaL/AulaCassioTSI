/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import dados.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 276764
 */
public class Paci_DAO {
    
    public void inserir(Paciente paci) throws Exception{
        
        Conexao c = new Conexao();
        String sql = "INSERT INTO paciente(rg_paci, nome_paci,endereco_paci, telefone_paci,email_paci  ) VALUES (?,?,?,?,?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1,paci.getRg_paci());
        ps.setString(2,paci.getNome_paci());
        ps.setString(3,paci.getEndereco_paci());
        ps.setInt(4, paci.getTelefone_paci());
        ps.setString(5,paci.getEmail_paci());
        ps.execute();
        c.confirmar();
    }
    
    public Paciente IdIncrement() throws Exception{
        Conexao c = new Conexao();
        String sql = "SELECT max(id_paci) as id_paci FROM postodesaude.Paciente";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        Paciente paci = new Paciente();
         if(rs.next()){
             paci.setId_paci(rs.getInt("id_paci")+1);
         }else{
             paci = null;
         }
        
        return paci;
    }
    
    
}
