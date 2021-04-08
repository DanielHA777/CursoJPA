package Teste.umpraum;

import Infra.DAO;
import umPraUm.Assento;
import umPraUm.Cliente;

public class NovoClienteAssento2 {
public static void main(String[] args) {
	Assento assento = new Assento("4D");
	Cliente cliente = new Cliente("Maria", assento);
	
	DAO<Cliente> dao = new DAO<>(Cliente.class);
	dao.incluirAtomico(cliente);
}
}
