package umPraUm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/* relacionamentos
rela��o n pra n pk at� fk sendo unique, n�o pode colocar outro em cima

*o.o 
*classe A       classeB
*-> classeb      -? classea
*
*Cliente         Assento
*1-----------------1
*
*OneTomany um pra muitos
*ManyToMany muitos pra muitos
*/
@Entity
@Table(name = "Assentos")
public class Assento {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	@OneToOne(mappedBy = "assento") //rela��o bidirecional mapeada em outro atributo, assento � o atributo mapeado da rela��o
	private Cliente cliente; //atributo assento mapeia pela classe cliente. cria um acoluna no bd
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Assento(String nome) {
		super();
		this.nome = nome;
	}
	
	public Assento() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
