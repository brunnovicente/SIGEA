/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Bruno Vicente
 */
@Entity
@Table(name="reais")
public class Real{
    
    @Id
    @GeneratedValue
    private int id;
    
    private int caixa;
    private int codigoR;
    private String nome;
    private String dataCongelamento;
    private String repetida;
    private String local;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCaixa() {
        return caixa;
    }

    public void setCaixa(int caixa) {
        this.caixa = caixa;
    }

    public int getCodigoR() {
        return codigoR;
    }

    public void setCodigoR(int codigoR) {
        this.codigoR = codigoR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataCongelamento() {
        return dataCongelamento;
    }

    public void setDataCongelamento(String dataCongelamento) {
        this.dataCongelamento = dataCongelamento;
    }

    public String getRepetida() {
        return repetida;
    }

    public void setRepetida(String repetida) {
        this.repetida = repetida;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    
    
}//Fim da Classe
