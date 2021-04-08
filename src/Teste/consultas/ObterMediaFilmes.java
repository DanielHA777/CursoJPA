package Teste.consultas;

import Infra.DAO;
import Modelo.Consulta.NotaFilme;
import Modelo.muitosPraMuitos.Filme;

public class ObterMediaFilmes {
public static void main(String[] args) {
	DAO<Filme> dao = new DAO<>(Filme.class);
	NotaFilme nota = dao.consultarUm("obterMediaGeraldosFilmes");
System.out.println(nota.getMedia());
dao.fechar();
}
}
