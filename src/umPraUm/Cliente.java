package umPraUm;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	//automatização com jpa       //operação em cascata na persistencia
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})    // relacionamento 1 pra 1 um cliente tem apenas um assento
	@JoinColumn(name = "Assento_id", unique = true) //sempre terá umvalor unico
	private Assento assento;
	
	public Cliente() {
		
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

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}

	public Cliente( String nome, Assento assento) {
		super();
		this.nome = nome;
		this.assento = assento;
	}
	
}
