/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicial;

import dados.PostoDeSaude;

/**
 *
 * @author 276764
 */
import dao.Posto_DAO;
import javax.swing.JOptionPane;
public class CadastoPosto extends javax.swing.JFrame {
 private PostoDeSaude post = null;
    private Posto_DAO postDAO = new Posto_DAO();
    
    int cnpj = 0;
    /**
     * Creates new form CadastoPosto
     */
    public CadastoPosto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TEL_POSTO = new javax.swing.JTextField();
        EMAIL_POSTO = new javax.swing.JTextField();
        CADASTRO_POSTO = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel411 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NOME_POSTO = new javax.swing.JTextField();
        CNPJ_POSTO = new javax.swing.JTextField();
        END_POSTO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CADASTRO_POSTO.setText("Cadastrar");
        CADASTRO_POSTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTRO_POSTOActionPerformed(evt);
            }
        });

        jLabel9.setText("Nome");

        jLabel10.setText("Endereço");

        jLabel411.setText("Telefone");

        jLabel12.setText("E-mail");

        jLabel7.setText("CNPJ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(CADASTRO_POSTO)
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(EMAIL_POSTO, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel411)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CNPJ_POSTO)
                            .addComponent(NOME_POSTO, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(END_POSTO)
                            .addComponent(TEL_POSTO))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CNPJ_POSTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOME_POSTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(END_POSTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel411)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TEL_POSTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EMAIL_POSTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CADASTRO_POSTO)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CADASTRO_POSTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTRO_POSTOActionPerformed

            //parseDouble() converte o texto para double
if (validarFormulario()){
            post = new PostoDeSaude();
            post.setCnpj_posto(Integer.parseInt(CNPJ_POSTO.getText().trim()));
            post.setNome_posto(NOME_POSTO.getText().trim());
            post.setEndereco_posto(END_POSTO.getText().trim());
            post.setTelefone_posto(Integer.parseInt(TEL_POSTO.getText().trim()));
            post.setEmail_posto(EMAIL_POSTO.getText().trim());
            
            
            try {
                    postDAO.inserir(post);
                    //mensagem em caso de sucesso
                    
                    JOptionPane.showMessageDialog(this,"Dados Inseridos com sucesso");
                    
                                       
                        CNPJ_POSTO.setText("");
                        NOME_POSTO.setText("");
                        END_POSTO.setText("");
                        TEL_POSTO.setText("");
                        EMAIL_POSTO.setText("");
                     //limpando os campos após o cadastro
                  
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao cadastrar Posto.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    //mensagem informando qual erro ocorreu
                    return;
                }    
}
    }//GEN-LAST:event_CADASTRO_POSTOActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public boolean validarFormulario(){
        
        if(CNPJ_POSTO.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o campo CNPJ.", "Alerta", JOptionPane.WARNING_MESSAGE);
            CNPJ_POSTO.requestFocus();
             return false;
        }
        
        if(NOME_POSTO.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o campo Nome.", "Alerta", JOptionPane.WARNING_MESSAGE);
             NOME_POSTO.requestFocus();
             return false;
        }
                if(END_POSTO.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o campo Endereço.", "Alerta", JOptionPane.WARNING_MESSAGE);
             END_POSTO.requestFocus();
             return false;
        }
                
            if(TEL_POSTO.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o campo Telefone.", "Alerta", JOptionPane.WARNING_MESSAGE);
             TEL_POSTO.requestFocus();
             return false;
                     }
                            
            if(EMAIL_POSTO.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o campo E-mail.", "Alerta", JOptionPane.WARNING_MESSAGE);
             EMAIL_POSTO.requestFocus();
             return false;
            }
       
                         
           if (NOME_POSTO.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Nome do Posto inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            NOME_POSTO.requestFocus();
            return false;
        }
           
                       
           if (END_POSTO.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Endereço do Posto inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            END_POSTO.requestFocus();
            return false;
        }
                                  
           if (TEL_POSTO.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Telefone do Posto inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            TEL_POSTO.requestFocus();
            return false;
        }
            if (EMAIL_POSTO.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "E-mail do Posto inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            EMAIL_POSTO.requestFocus();
            return false;
        }
        // campo JFormattedTextField
         return true;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastoPosto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastoPosto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastoPosto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastoPosto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastoPosto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CADASTRO_POSTO;
    private javax.swing.JTextField CNPJ_POSTO;
    private javax.swing.JTextField EMAIL_POSTO;
    private javax.swing.JTextField END_POSTO;
    private javax.swing.JTextField NOME_POSTO;
    private javax.swing.JTextField TEL_POSTO;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel411;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
