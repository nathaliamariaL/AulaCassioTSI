/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dados.PostoDeSaude;
import java.sql.PreparedStatement;

/**
 *
 * @author 276764
 */
public class Posto_DAO {
    public void inserir(PostoDeSaude post) throws Exception{
        
        Conexao c = new Conexao();
        String sql = "INSERT INTO postodesaude(cnpj_posto, nome_posto,endereco_posto, telefone_posto,email_posto ) VALUES (?,?,?,?,?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1,post.getCnpj_posto());
        ps.setString(2,post.getNome_posto());
        ps.setString(3,post.getEndereco_posto());
        ps.setInt(4, post.getTelefone_posto());
        ps.setString(5,post.getEmail_posto());
        ps.execute();
        c.confirmar();
    }
    
}
