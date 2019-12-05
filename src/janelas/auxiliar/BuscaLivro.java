/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas.auxiliar;

import entidades.Amostra;
import entidades.Livro;
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
public class BuscaLivro extends Thread{
    
    private JTable tabela;
    private List<Livro> lista;
    private List<Livro> temp;
    private JComboBox combo;
    private int tipo;
    private JLabel mensagem;
    
    public BuscaLivro(JLabel mensagem,JTable tabela, List<Livro> lista){
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
        this.temp = Banco.getBanco().consultaLivro();
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
            for(Livro livro : temp){
                this.lista.add(livro);
                String[] linha = new String[9];
                   linha[0] = livro.getOrdem()+"";
                   linha[1] = livro.getCodigoL()+"";
                   linha[2] = livro.getNome();
                   linha[3] = livro.getData();
                   linha[4] = livro.getIdade()+"";
                   linha[5] = livro.getCaixa()+"";
                   linha[6] = livro.getN();
                   linha[7] = livro.getSexo();
                   linha[8] = livro.getObs();
                   modelo.addRow(linha);
            }
    }
    
}
