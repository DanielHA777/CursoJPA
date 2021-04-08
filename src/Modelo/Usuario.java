package Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

// @column(name = "...", nullable = false) n nulo
private String nome;

// @translent esse obj n seria mapeado ao bd
private String email;

public Usuario() {
	
}

public Usuario( String nome, String email) {
	super();
	
	this.nome = nome;
	this.email = email;
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

}
