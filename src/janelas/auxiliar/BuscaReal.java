/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas.auxiliar;

import entidades.Amostra;
import entidades.Livro;
import entidades.Real;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import persistencia.Banco;

/**
 *
 * @author brunn_000
 */
public class BuscaReal extends Thread{
    
    private JTable tabela;
    private List<Real> lista;
    private List<Real> temp;
    private JComboBox combo;
    private int tipo;
    private JLabel mensagem;
    
    public BuscaReal(JLabel mensagem,JTable tabela, List<Real> lista){
        this.tabela = tabela;
        this.lista = lista;
        tipo = 1;
        this.mensagem = mensagem;
        this.mensagem.setVisible(true);
    }
    
//    public BuscaAmostra(JComboBox combo, List<Fabricante> lista){
//        this.combo = combo;
//        this.lista = lista;
//        tipo = 2;
//    }
    
    @Override
    public void run(){
        this.temp = Banco.getBanco().consultaReal();
        adicionarTabela();
        this.mensagem.setVisible(false);
    }
    
//    private void adicionarCombo(){
//        for (Amostra fabricante : lista) {
//            combo.addItem(fabricante);
//        }
//    }
    
    private void adicionarTabela(){
        
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            //Limpa a tabela antes de adicionar os novos dados
            int tam = modelo.getRowCount();
            for(int i=0;i<tam;i++){
                modelo.removeRow(0);
            }
            //java.text.SimpleDateFormat formatodata = new java.text.SimpleDateFormat("dd/MM/yyyy"); 
            for(Real real : temp){
                this.lista.add(real);
                String[] linha = new String[6];
                   linha[0] = real.getCaixa()+"";
                   linha[1] = real.getCodigoR()+"";
                   linha[2] = real.getNome();
                   linha[3] = real.getDataCongelamento();
                   if(real.getRepetida() != null){
                        linha[4] = real.getRepetida()+"";
                   }
                   linha[5] = real.getLocal();
                   modelo.addRow(linha);
            }
    }
    
}
