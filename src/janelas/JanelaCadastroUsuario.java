/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import entidades.Usuario;
import sigea.Hashing;

/**
 *
 * @author Bruno
 */
public class JanelaCadastroUsuario extends javax.swing.JDialog {
    private Usuario usuario;
    
    /**
     * Creates new form JanelaCadastroUsuario
     */
    public JanelaCadastroUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        jbutaonovo.setEnabled(false);
        this.usuario = null;
        
    }
    
    public JanelaCadastroUsuario(java.awt.Frame parent, boolean modal, Usuario usuario) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

        jbutaonovo.setEnabled(false);
       
        this.usuario = usuario;
        jnome.setText(usuario.getNome());
        jlogin.setText(usuario.getLogin());
        jemail.setText(usuario.getEmail());
        
        jlogin.setEnabled(false);
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jnome = new javax.swing.JTextField();
        jlogin = new javax.swing.JTextField();
        jemail = new javax.swing.JTextField();
        jsenha = new javax.swing.JPasswordField();
        jconfirma = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jbutaonovo = new javax.swing.JButton();
        jbutaosalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE USUÁRIO");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Usuário"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("NOME:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("LOGIN:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("EMAIL:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("SENHA:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CONFIRME A SENHA:");

        jnome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jnomeKeyPressed(evt);
            }
        });

        jlogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jloginKeyPressed(evt);
            }
        });

        jemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jemailKeyPressed(evt);
            }
        });

        jsenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jsenhaKeyPressed(evt);
            }
        });

        jconfirma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jconfirma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jconfirmaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnome, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(jlogin)
                    .addComponent(jemail)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jsenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jconfirma, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jButton1.setText("SAIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jbutaonovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Novo.png"))); // NOI18N
        jbutaonovo.setText("NOVO");
        jbutaonovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutaonovoActionPerformed(evt);
            }
        });

        jbutaosalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Salvar.png"))); // NOI18N
        jbutaosalvar.setText("SALVAR");
        jbutaosalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutaosalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbutaosalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbutaonovo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jbutaonovo))
                    .addComponent(jbutaosalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbutaosalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutaosalvarActionPerformed
        if(this.usuario == null){
            this.cadastrar();
        }else{
            String senha = String.valueOf(jsenha.getPassword());
            String confirma = String.valueOf(jconfirma.getPassword());
            if(senha.equals(confirma)){
                if(!senha.isEmpty() && !confirma.isEmpty()){
                    this.editar();
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Digite uma senha nova ou a mesma!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Repita a senha corretamente!");
            }
            
        }
                
    }//GEN-LAST:event_jbutaosalvarActionPerformed

    private void jbutaonovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutaonovoActionPerformed
        jbutaonovo.setEnabled(false);
        jbutaosalvar.setEnabled(true);
        jnome.setText("");
        jlogin.setText("");
        jemail.setText("");
        jsenha.setText("");
        jconfirma.setText("");
        jnome.requestFocus();
        
    }//GEN-LAST:event_jbutaonovoActionPerformed

    private void jnomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jnomeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jlogin.requestFocus();
        }else{
            if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
                this.dispose();
            }
        }
    }//GEN-LAST:event_jnomeKeyPressed

    private void jloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jloginKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jemail.requestFocus();
        }else{
            if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
                this.dispose();
            }
        }
    }//GEN-LAST:event_jloginKeyPressed

    private void jemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jemailKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jsenha.requestFocus();
        }else{
            if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
                this.dispose();
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jemailKeyPressed

    private void jsenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jsenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jconfirma.requestFocus();
        }else{
            if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
                this.dispose();
            }
        }
    }//GEN-LAST:event_jsenhaKeyPressed

    private void jconfirmaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jconfirmaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.cadastrar();
            
        }else{
            if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
                this.dispose();
            }
        }
    }//GEN-LAST:event_jconfirmaKeyPressed

    private void editar(){
        
        //String senhaantiga = this.usuario.getSenha();
        
        try {
            Hashing hash = Hashing.getHashing();
            String senha = String.valueOf(jsenha.getPassword());
            usuario.setSenha(hash.HashSHA512(senha));
            usuario.setNome(jnome.getText());
            usuario.setEmail(jemail.getText());
            
            //FachadaControle.getFachadaControle().editarUsuario(usuario, senhaantiga);
            //this.sistema.editarUsuario(usuario);
            JOptionPane.showMessageDialog(null, "Usuário editado com sucesso!");
        } catch (Exception ex) {
                Logger.getLogger(JanelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void cadastrar(){
        String senha = String.valueOf(jsenha.getPassword());
        String confirma = String.valueOf(jconfirma.getPassword());
        
        Hashing hash = Hashing.getHashing();
        
        try{
            if(senha.equals(confirma)){
                
                Usuario usuario = new Usuario();
                usuario.setLogin(jlogin.getText());
                usuario.setEmail(jemail.getText());
                usuario.setNome(jnome.getText());
                usuario.setSenha(hash.HashSHA512(senha));
                
                //this.sistema.cadastrarUsuario(usuario);
                JOptionPane.showMessageDialog(null, "Usuário cadastro com sucesso!");
                jbutaonovo.setEnabled(true);
                jbutaosalvar.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null, "A confirmação da senha não confere!");
            }
        }catch (Exception ex) {
             JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /*
//         * Set the Nimbus look and feel
//         */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /*
//         * If Nimbus (introduced in Java SE 6) is not available, stay with the
//         * default look and feel. For details see
//         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JanelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /*
//         * Create and display the dialog
//         */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                JanelaCadastroUsuario dialog = new JanelaCadastroUsuario(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbutaonovo;
    private javax.swing.JButton jbutaosalvar;
    private javax.swing.JPasswordField jconfirma;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jlogin;
    private javax.swing.JTextField jnome;
    private javax.swing.JPasswordField jsenha;
    // End of variables declaration//GEN-END:variables
}
