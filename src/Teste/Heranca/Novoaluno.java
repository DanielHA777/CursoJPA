package Teste.Heranca;

import Infra.DAO;
import Modelo.Heran�a.Aluno;
import Modelo.Heran�a.AlunoBolsista;

public class Novoaluno {
	public static void main(String[] args) {
DAO<Aluno> alunoDAO = new DAO<>();
Aluno aluno1 = new Aluno(123l, "jo�o");
AlunoBolsista aluno2 = new AlunoBolsista(245l,"Maria", 1000);
alunoDAO.incluirAtomico(aluno1);
alunoDAO.incluirAtomico(aluno2);
alunoDAO.fechar();
	}
}
