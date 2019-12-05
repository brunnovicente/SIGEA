/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Amostra;
import entidades.Livro;
import entidades.Paciente;
import entidades.Real;
import entidades.Tipo;
import entidades.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import sigea.Hashing;

/**
 * Classe de conexão com o Banco de Dados usando Hibernate
 * @author Bruno Vicente
 */
public class Banco {
    
    private static Banco banco;
    //private Hashing hash = new Hashing();
    public static Usuario usuario;
    
    EntityManagerFactory factory;// = Persistence.createEntityManagerFactory("bancopecas");
    EntityManager em;// = factory.createEntityManager();
    
//    public Banco(){
//        this.abrirInstancia();
//        this.fecharInstancia();
//    }
    
    public static Banco getBanco() {
        if (banco == null) {
            banco = new Banco();
        }
        return banco;
    }
    
    /**
     * Retorna o usuário logado no sistema
     * @return Objeto usuário
     */
    public static Usuario getUsuarioLogado(){
        return usuario;
    }
    
    /**
     * Conecta a classe ao banco de dados
     */
    public void abrirInstancia(){
       factory = Persistence.createEntityManagerFactory("sigea");
       em = factory.createEntityManager();
   }
   
    /**
     * Fecha a conexão com o Banco de Dados
     */
    public void fecharInstancia(){
        this.factory.close();
    }
    
    /**
     * Cadastra um objeto no banco de dados
     * @param objeto: Qualquer objeto representado no sistema
     */
    public void cadastrar(Object objeto){
        this.abrirInstancia();
        this.em.getTransaction().begin();
        this.em.persist(objeto);
        this.em.getTransaction().commit();
        this.fecharInstancia();
    }
    
    /**
     * Modifica dados de uma amostra existente
     * @param amostra: objeto com os dados da amostra
     */
    public void editar(Amostra amostra){
        this.abrirInstancia();
        this.em.getTransaction().begin();
        this.em.merge(amostra);
        this.em.getTransaction().commit();
        this.fecharInstancia();
    }
    
    /**
     * Modifica os dados de um Paciente
     * @param paciente: objeto com os dados do paciente
     */
    public void editarPaciente(Paciente paciente){
        this.abrirInstancia();
        this.em.getTransaction().begin();
        this.em.merge(paciente);
        this.em.getTransaction().commit();
        this.fecharInstancia();
    }
    
    /**
     * Modifica os dados de um Tipo
     * @param tipo: objeto com os dados do Tipo
     */
    public void editarTipo(Tipo tipo){
        this.abrirInstancia();
        this.em.getTransaction().begin();
        this.em.merge(tipo);
        this.em.getTransaction().commit();
        this.fecharInstancia();
    }
    
    /**
     * Realiza uma consulta pelo nome do paciente
     * @param nome: nome completo ou parte dele para realizar a consulta
     * @return lista de objetos do tipo Paciente
     */
    public List<Paciente> consultaPaciente(String nome){
        this.abrirInstancia();
        em = factory.createEntityManager();
        List<Paciente> lista = null;

        Query res = em.createQuery("SELECT "
                + "p "
                + "FROM Paciente as p "
                + "WHERE p.nome LIKE '%"+nome+"%' ORDER BY p.nome");
        lista = res.getResultList();
        
        em.clear();
        em.close();
        this.fecharInstancia();
        return lista;
    }
    
    /**
     * Consulta de Tipos pelo nome
     * @param nome: nome completo do tipo ou parte dele 
     * @return lista de objetos Tipo
     */
    public List<Tipo> consultaTipo(String nome){
        this.abrirInstancia();
        em = factory.createEntityManager();
        List<Tipo> lista = null;

        Query res = em.createQuery("SELECT "
                + "t "
                + "FROM Tipo as t "
                + "WHERE t.nome LIKE '%"+nome+"%' ORDER BY t.nome");
        lista = res.getResultList();
        
        em.clear();
        em.close();
        this.fecharInstancia();
        return lista;
    }
    
    /**
     * Retorna todas as amostras cadastradas
     * @return lista de objetos Amostra
     */
    public List<Amostra> consultaAmostras(){
        this.abrirInstancia();
        em = factory.createEntityManager();
        List<Amostra> lista = null;

        Query res = em.createQuery("SELECT "
                + "a "
                + "FROM Amostra as a ORDER BY a.registro");

        lista = res.getResultList();
        
        em.clear();
        em.close();
        this.fecharInstancia();
        return lista;
    }
    
     public List<Livro> consultaLivro(){
        this.abrirInstancia();
        em = factory.createEntityManager();
        List<Livro> lista = null;

        Query res = em.createQuery("SELECT "
                + "l "
                + "FROM Livro as l ORDER BY l.codigoL");

        lista = res.getResultList();
        
        em.clear();
        em.close();
        this.fecharInstancia();
        return lista;
    }
     
      public List<Livro> consultaLivro(String codigo){
        this.abrirInstancia();
        em = factory.createEntityManager();
        List<Livro> lista = null;

        Query res = em.createQuery("SELECT "
                + "livro "
                + "FROM Livro as livro "
                + "WHERE livro.codigoL = "+codigo);

        lista = res.getResultList();
        
        em.clear();
        em.close();
        this.fecharInstancia();
        return lista;
    }
    
      public List<Real> consultaReal(){
        this.abrirInstancia();
        em = factory.createEntityManager();
        List<Real> lista = null;
          
        Query res = em.createQuery("SELECT "
                + "r "
                + "FROM Real as r ORDER BY r.codigoR");

        lista = res.getResultList();
        
        em.clear();
        em.close();
        this.fecharInstancia();
        return lista;
    }
      
      public List<Real> consultaReal(String codigo){
        this.abrirInstancia();
        em = factory.createEntityManager();
        List<Real> lista = null;

        Query res = em.createQuery("SELECT "
                + "r "
                + "FROM Real as r "
                + "WHERE r.codigoR = "+codigo);

        lista = res.getResultList();
        
        em.clear();
        em.close();
        this.fecharInstancia();
        return lista;
    }
    
    /**
     * Consulta de Amostras pelo registro
     * @param registro: valor do registro da amostra buscada
     * @return lista de objetos Amostra
     */
    public List<Amostra> consultaAmostras(String registro){
        this.abrirInstancia();
        em = factory.createEntityManager();
        List<Amostra> lista = null;

        Query res = em.createQuery("SELECT "
                + "a "
                + "FROM Amostra as a "
                + "WHERE a.registro = "+registro);

        lista = res.getResultList();
        
        em.clear();
        em.close();
        this.fecharInstancia();
        return lista;
    }
    
    /**
     * Consulta de Amostras pelo tipo
     * @param tipo: tipo da amostra buscada
     * @return lista de objetos Amostra
     */
    public List<Amostra> consultaAmostrasTipo(String tipo){
        this.abrirInstancia();
        em = factory.createEntityManager();
        List<Amostra> lista = null;

        Query res = em.createQuery("SELECT "
                + "a "
                + "FROM Amostra as a "
                + "WHERE a.tipo = '"+tipo+"'");

        lista = res.getResultList();
        
        em.clear();
        em.close();
        this.fecharInstancia();
        return lista;
    }
    
    /**
     * Consulta de Amostra pelo código
     * @param codigo: código da amostra buscada
     * @return Lista de objetos amostra
     */
    public List<Amostra> consultaAmostras(int codigo){
        this.abrirInstancia();
        List<Amostra> lista;
//        Paciente paciente = (Paciente) em.createQuery("SELECT p FROM Paciente as p WHERE p.id = "+codigo).getSingleResult();
//        Query query = em.createQuery("SELECT a FROM Amostra as a WHERE :paciente MEMBER OF a.paciente");
//        query.setParameter("paciente", paciente);

        lista = em.createQuery("SELECT a FROM Amostra AS a "
                + "LEFT JOIN a.paciente AS p "
                + "WHERE p.id = " + codigo).getResultList();


        em.clear();
        em.close();
        this.fecharInstancia();
        return lista;
    }
    
    /**
     * Retorna todos os tipos cadastrados
     * @return Lista de objetos Tipo
     */
    public List<Tipo> getTipos(){
        this.abrirInstancia();
        
        List<Tipo> lista = null;
        
        Query query = em.createQuery("SELECT t FROM Tipo as t");
        
        lista = query.getResultList();
        
        em.clear();
        em.close();
        this.fecharInstancia();
        
        return lista;
    }
    
    /**
     * Remove uma amostra pelo código
     * @param amostra: código da amostra a ser excluída
     */
    public void excluirAmostra(int amostra){
        this.abrirInstancia();
        em.getTransaction().begin();
        
        Query query = em.createNativeQuery("DELETE FROM amostras WHERE id = "+amostra);
        query.executeUpdate();
        
        em.getTransaction().commit();        
        this.fecharInstancia();
    }
    
    /**
     * Modifica os dados de um usuário
     * @param usuario: objeto com os dados do usuário a ser modificado
     */
    public void editarUsuario(Usuario usuario){
        this.abrirInstancia();
        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();
        this.fecharInstancia();
    }
    
    /**
     * Localiza um usuário pelo login
     * @param login: Login do usuário a ser localizado
     * @return Objeto do Tipo Usuário
     */
    public Usuario getUsuario(String login){
        this.abrirInstancia();
        em = factory.createEntityManager();
        
        List<Usuario> lista = null;

        Query res = em.createQuery("SELECT "
                + "u "
                + "FROM Usuario as u "
                + "WHERE u.login = '"+login+"'");

        lista = res.getResultList();
        
        em.clear();
        em.close();
        this.fecharInstancia();
        
        if(lista.isEmpty()){
            return null;
        }
        
        return lista.get(0);
    }
    
    /**
     * Retorna todos os usuários
     * @return Lista de Objetos Usuário
     */
    public List<Usuario> consultaUsuarios(){
        this.abrirInstancia();
        
        List<Usuario> lista = null;
        
        Query query = em.createQuery("SELECT u FROM Usuario as u");
        
        lista = query.getResultList();
        
        em.clear();
        em.close();
        this.fecharInstancia();
        
        return lista;
    }
    
    /**
     * Verifica se o Login e Senha testado existem no sistema
     * @param login: nome de Login a ser testado
     * @param senha: senha do usuário testado
     * @return: True se encontrado
     * @throws Exception: Retorna mensagem caso não seja encontrado
     */
    public boolean fazerLogin(String login, String senha) throws Exception{
       
        Usuario user = this.getUsuario(login);
        
        if(user != null){
            if(user.getSenha().equals(Hashing.getHashing().HashSHA512(senha))){
                usuario = user;
                return true;
            }else{
                throw new Exception("Senha Inválida!");
            }
        }else{
            throw new Exception("Usuário inválido!");
        }

    }
    
}//FIm da Classe Banco
