package Teste.umpraum;

import Infra.DAO;
import umPraUm.Assento;
import umPraUm.Cliente;

public class ObterClienteAssento {
	public static void main(String[] args) {
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		Cliente cliente = daoCliente.obterPorId(1l);
		System.out.println(cliente.getAssento().getCliente());
		daoCliente.fechar();
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorId(1l);
		System.out.println(assento.getCliente().getNome());
		daoAssento.fechar();
	}
}
