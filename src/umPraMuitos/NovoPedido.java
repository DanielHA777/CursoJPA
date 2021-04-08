package umPraMuitos;

import Infra.DAO;
import Modelo.Produto;
import umPraUm.ItemPedido;
import umPraUm.Pedido;

public class NovoPedido {
	public static void main(String[] args) {
     DAO<Object>  dao = new DAO<>();
     Pedido pedido = new Pedido();
     Produto produto = new Produto(1, "Geladeira", 2769.99);
     ItemPedido item = new ItemPedido(pedido, produto, 10);
	dao.AbrirT()
	.incluir(produto)
	.incluir(pedido)
	.incluir(item)
	.FecharT()
	.fechar();
	}
}
