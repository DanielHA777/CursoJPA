package umPraUm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import Modelo.Produto;

@Entity
public class ItemPedido {
	@ManyToOne  
	private Pedido pedido;
	            // eager pega todos os valores depedido e produto
	@ManyToOne(fetch= FetchType.EAGER) // esse éo valor default 
	private Produto produto;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private int qtd;
	@Column(nullable = false)
	private Double preco;
public ItemPedido() {
		
	}
	
public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
		if(produto != null && this.preco == null) {
			this.setPreco(produto.getPreco()); // seta o preco do produto no preco do itenmPedido
		}
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public ItemPedido(Pedido pedido, Produto produto, int qtd) {
		super();
		this.pedido = pedido;
		this.produto = produto;
		this.qtd = qtd;
		
	}
}
