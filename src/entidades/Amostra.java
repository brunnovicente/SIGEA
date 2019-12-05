/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Bruno
 * Representa uma amostra no sistema
 */
@Entity
@Table(name="amostras")
public class Amostra {
    
    
    
    @Id
    @GeneratedValue
    private int id;
    private int registro;
    private Date data;
    private int idade;
    private String medico;
    private int quantidade;
    private String medular;
    private String mielocultura;
    private String obs;
    private String bloco;
    private String enfermaria;
    private String leito;
    
    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name = "paciente")
    private Paciente paciente;
    
    @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "amostra")
    private List<Local> locais;

    /**
     * Construtor da classe Amostra
     */
    public Amostra(){
        this.locais = new ArrayList<>();
    }
    
    /**
     * Retorna Todos os obeots Locais de uma amostra
     * @return Lista de Locais
     */
    public List<Local> getLocais() {
        return locais;
    }
    
    /**
     * Adiciona uma lista de locais para a amostra
     * @param locais: lista de locais
     */
    public void setLocais(List<Local> locais) {
        this.locais = locais;
    }
   
    
    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getMedular() {
        return medular;
    }

    public void setMedular(String medular) {
        this.medular = medular;
    }

    public String getMielocultura() {
        return mielocultura;
    }

    public void setMielocultura(String mielocultura) {
        this.mielocultura = mielocultura;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getEnfermaria() {
        return enfermaria;
    }

    public void setEnfermaria(String enfermaria) {
        this.enfermaria = enfermaria;
    }

    public String getLeito() {
        return leito;
    }

    public void setLeito(String leito) {
        this.leito = leito;
    }

    
    
}//Fim da Classe