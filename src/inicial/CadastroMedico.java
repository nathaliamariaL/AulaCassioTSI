/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicial;

import dados.Medico;
import dao.Med_DAO;
import javax.swing.JOptionPane;

/**
 *
 * @author 276764
 */
public class CadastroMedico extends javax.swing.JFrame {

    private Medico med = null;
    private Med_DAO medDAO = new Med_DAO();
    
    int crm = 0;
    
    
    
    
    

    /**
     * Creates new form CadastroPaciete
     */
   
        
        
        
   
    /**
     * Creates new form CadastroMedico
     */
    public CadastroMedico() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CRM_MED = new javax.swing.JTextField();
        NOME_MED = new javax.swing.JTextField();
        END_MED = new javax.swing.JTextField();
        TEL_MED = new javax.swing.JTextField();
        EMAIL_MED = new javax.swing.JTextField();
        CADASTRO_MED = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CRM");

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("Telefone");

        jLabel5.setText("E-mail");

        CADASTRO_MED.setText("Cadastrar");
        CADASTRO_MED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTRO_MEDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EMAIL_MED, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(CRM_MED)
                            .addComponent(NOME_MED)
                            .addComponent(END_MED)
                            .addComponent(TEL_MED))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(CADASTRO_MED)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CRM_MED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NOME_MED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(END_MED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TEL_MED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(EMAIL_MED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CADASTRO_MED)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CADASTRO_MEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTRO_MEDActionPerformed
        
    if (validarFormulario()){
            med = new Medico();
            med.setCrm_medico(CRM_MED.getText().trim());
            med.setNome_medico(NOME_MED.getText().trim());
            med.setEndereco_medico(END_MED.getText().trim());
            med.setTelefone_medico(Integer.parseInt(TEL_MED.getText().trim()));
            med.setEmail_medico(EMAIL_MED.getText().trim());
            
            
            try {
                    medDAO.inserir(med);
                    //mensagem em caso de sucesso
                    
                    JOptionPane.showMessageDialog(this,"Dados Inseridos com sucesso");
                    
                                       
                        CRM_MED.setText("");
                        NOME_MED.setText("");
                        END_MED.setText("");
                        TEL_MED.setText("");
                        EMAIL_MED.setText("");
                     //limpando os campos após o cadastro
                  
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao cadastrar Médico.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    //mensagem informando qual erro ocorreu
                    return;
                }    
            
        }
        
    }//GEN-LAST:event_CADASTRO_MEDActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    
    
    public boolean validarFormulario(){
        
        if(CRM_MED.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o campo CRM.", "Alerta", JOptionPane.WARNING_MESSAGE);
            CRM_MED.requestFocus();
             return false;
        }
        
        if(NOME_MED.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o campo Nome.", "Alerta", JOptionPane.WARNING_MESSAGE);
             NOME_MED.requestFocus();
             return false;
        }
                if(END_MED.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o campo Endereço.", "Alerta", JOptionPane.WARNING_MESSAGE);
             END_MED.requestFocus();
             return false;
        }
                
            if(TEL_MED.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o campo Telefone.", "Alerta", JOptionPane.WARNING_MESSAGE);
             TEL_MED.requestFocus();
             return false;
                     }
                            
            if(EMAIL_MED.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha o campo E-mail.", "Alerta", JOptionPane.WARNING_MESSAGE);
             EMAIL_MED.requestFocus();
             return false;
            }
       
             if (CRM_MED.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "CRM do médico inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            CRM_MED.requestFocus();
            return false;
        }
            
           if (NOME_MED.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Nome do médico inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            NOME_MED.requestFocus();
            return false;
        }
           
                       
           if (END_MED.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Endereço do médico inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            END_MED.requestFocus();
            return false;
        }
                                  
           if (TEL_MED.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "Telefone do médico inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            TEL_MED.requestFocus();
            return false;
        }
            if (EMAIL_MED.getText().trim().length() < 2) {
            JOptionPane.showMessageDialog(this, "E-mail do médico inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            EMAIL_MED.requestFocus();
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
            java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CADASTRO_MED;
    private javax.swing.JTextField CRM_MED;
    private javax.swing.JTextField EMAIL_MED;
    private javax.swing.JTextField END_MED;
    private javax.swing.JTextField NOME_MED;
    private javax.swing.JTextField TEL_MED;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
