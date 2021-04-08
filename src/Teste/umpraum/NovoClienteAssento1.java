package Teste.umpraum;

import Infra.DAO;
import umPraUm.Assento;
import umPraUm.Cliente;

public class NovoClienteAssento1 {
	public static void main(String[] args) {
		Assento assento = new Assento("16C");
		Cliente cliente = new Cliente("Ana", assento);

		DAO<Object> dao = new DAO<>();
		dao.AbrirT().incluir(assento) // insere o assento
				.incluir(cliente) // insere o cliente
				.FecharT().fechar();
	}
}
