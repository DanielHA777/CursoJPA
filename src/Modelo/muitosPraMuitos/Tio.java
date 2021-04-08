package Modelo.muitosPraMuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Tio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nome;

@ManyToMany(mappedBy = "tios")
private List<Sobrinho> sobrinhos = new ArrayList<>();

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public List<Sobrinho> getSobrinhos() {
	return sobrinhos;
}

public void setSobrinhos(List<Sobrinho> sobrinhos) {
	this.sobrinhos = sobrinhos;
}

public Tio() {
	
}

public Tio(String nome, List<Sobrinho> sobrinhos) {
	super();
	this.nome = nome;
	this.sobrinhos = sobrinhos;
}

}
