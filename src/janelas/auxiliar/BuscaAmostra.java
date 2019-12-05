/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas.auxiliar;

import entidades.Amostra;
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
public class BuscaAmostra extends Thread{
    
    private JTable tabela;
    private List<Amostra> lista;
    private List<Amostra> temp;
    private JComboBox combo;
    private int tipo;
    private JLabel mensagem;
    
    public BuscaAmostra(JLabel mensagem,JTable tabela, List<Amostra> lista){
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
        this.temp = Banco.getBanco().consultaAmostras();
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
            java.text.SimpleDateFormat formatodata = new java.text.SimpleDateFormat("dd/MM/yyyy"); 
            for(Amostra amostra : temp){
                this.lista.add(amostra);
                String[] linha = new String[5];
                linha[0] = amostra.getRegistro()+"";
                linha[1] = formatodata.format(amostra.getData());
                linha[2] = amostra.getPaciente().getNome();
                if(amostra.getBloco() != null){
                    linha[3] = amostra.getBloco();
                    if(amostra.getEnfermaria() != null){
                        linha[3]+="/"+amostra.getEnfermaria();
                        if(amostra.getLeito() != null){
                            linha[4] += "/"+amostra.getLeito();
                        }
                    }
                }
                linha[4] = amostra.getMedico();
                modelo.addRow(linha);
            }
    }
    
}
