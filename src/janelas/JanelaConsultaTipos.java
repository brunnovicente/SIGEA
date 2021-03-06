/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import entidades.Paciente;
import entidades.Tipo;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import persistencia.Banco;

/**
 *
 * @author Bruno Vicente
 */
public class JanelaConsultaTipos extends javax.swing.JDialog {
    private java.awt.Frame parent;
    
    private Paciente paciente = null;
    
    /**
     * Creates new form JanelaConsultaPacientes
     */
    public JanelaConsultaTipos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        this.setLocationRelativeTo(null);
        this.buscar();
        jbusca.requestFocus();
    }
    
    public JanelaConsultaTipos(java.awt.Frame parent, boolean modal, Paciente paciente) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        this.setLocationRelativeTo(null);
        this.buscar();
        jbusca.requestFocus();
        this.paciente = paciente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jbusca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Tipos");

        jtabela.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtabela.setRowHeight(20);
        jtabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtabelaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtabela);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Digie parte ou o nome completo"));

        jbusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbuscaKeyPressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisa2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbusca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Novo.png"))); // NOI18N
        jButton3.setText("Novo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Editar2.png"))); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JanelaCadastroTipo janela = new JanelaCadastroTipo(parent, true);
        janela.setVisible(true);
        this.buscar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.buscar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbuscaKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.buscar();
        }else{
              if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
                        this.dispose();
              }else{
                  if(evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP){
                       jtabela.requestFocus();
                  }
              }
              
         }        // TODO add your handling code here:
    }//GEN-LAST:event_jbuscaKeyPressed

    private void jtabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtabelaKeyPressed
        if(paciente == null){
            System.out.println("Paciente é NULLO!");
        }else{
            if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                Paciente p = (Paciente) jtabela.getValueAt(jtabela.getSelectedRow(), 0);
                this.paciente.setId(p.getId());
                this.paciente.setNome(p.getNome());
                this.dispose();
            }
        }
    }//GEN-LAST:event_jtabelaKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Tipo tipo = (Tipo) jtabela.getValueAt(jtabela.getSelectedRow(), 0);
        JanelaCadastroTipo janela = new JanelaCadastroTipo(parent, tipo, true);
        janela.setVisible(true);
        this.buscar();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    
    private void buscar(){
        
        List<Tipo> lista = Banco.getBanco().consultaTipo(jbusca.getText());
        
        DefaultTableModel modelo = (DefaultTableModel) jtabela.getModel();
            //Limpa a tabela antes de adicionar os novos dados
            int tam = modelo.getRowCount();
            for(int i=0;i<tam;i++){
                modelo.removeRow(0);
            }
            
            //java.text.SimpleDateFormat formatodata = new java.text.SimpleDateFormat("dd/MM/yyyy");  
            
            for(Tipo tipo : lista){
                Object[] linha = new Object[1];
                linha[0] = (Object) tipo;
                modelo.addRow(linha);
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jbusca;
    private javax.swing.JTable jtabela;
    // End of variables declaration//GEN-END:variables
}
