/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigea;

import entidades.Usuario;
import janelas.JanelaLogin;
import janelas.JanelaPrincipal;
import persistencia.Banco;

/**
 *
 * @author Bruno Vicente
 */
public class SIGEA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Banco banco = new Banco();
        JanelaLogin janela = new JanelaLogin();
        janela.setVisible(true);

               
    }
    
    
}
