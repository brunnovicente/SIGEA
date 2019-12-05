package entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Amostra.class)
public abstract class Amostra_ {

	public static volatile SingularAttribute<Amostra, String> obs;
	public static volatile SingularAttribute<Amostra, Date> data;
	public static volatile SingularAttribute<Amostra, String> bloco;
	public static volatile SingularAttribute<Amostra, String> enfermaria;
	public static volatile SingularAttribute<Amostra, String> leito;
	public static volatile SingularAttribute<Amostra, String> medular;
	public static volatile SingularAttribute<Amostra, Integer> registro;
	public static volatile SingularAttribute<Amostra, Integer> idade;
	public static volatile SingularAttribute<Amostra, Paciente> paciente;
	public static volatile SingularAttribute<Amostra, String> medico;
	public static volatile SingularAttribute<Amostra, Usuario> usuario;
	public static volatile SingularAttribute<Amostra, Integer> id;
	public static volatile SingularAttribute<Amostra, Integer> quantidade;
	public static volatile SingularAttribute<Amostra, String> mielocultura;
	public static volatile ListAttribute<Amostra, Local> locais;

}

