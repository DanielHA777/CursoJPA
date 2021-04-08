package umPraMuitos;

import Infra.DAO;
import umPraUm.ItemPedido;
import umPraUm.Pedido;

public class ObterPedido {
	public static void main(String[] args) {
      DAO<Pedido> dao = new DAO<>(Pedido.class);
      Pedido pedido = dao.obterPorId(1l);
      for(ItemPedido item: pedido.getItens()) {
    	  System.out.println(item.getQtd());
    	  System.out.println(item.getProduto().getNome());
      }
      dao.fechar();
	}
}
