package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos", schema = "javajpa") // amarrando ao schema
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	
@Column(name = "prod_nome", length = 200, nullable = false) 
private String nome;
// precision 11 numeros, scale 2 após a virgula
@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
private double preco;

public Produto() {
	
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

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public Produto(long id, String nome, double preco) {
	super();
	this.id = id;
	this.nome = nome;
	this.preco = preco;
}

}
