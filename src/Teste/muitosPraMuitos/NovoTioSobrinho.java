package Teste.muitosPraMuitos;

import Infra.DAO;
import Modelo.muitosPraMuitos.Sobrinho;
import Modelo.muitosPraMuitos.Tio;

public class NovoTioSobrinho {
public static void main(String[] args) {
	Tio tia1 = new Tio("maria", null);
	Tio tio2 = new Tio("joão", null);
	
	Sobrinho sobrinho1 = new Sobrinho("Ana");
	Sobrinho sobrinha2 = new Sobrinho("davi");
	
	tia1.getSobrinhos().add(sobrinho1);
	sobrinho1.getTios().add(tia1);
	
	tia1.getSobrinhos().add(sobrinha2);
	sobrinha2.getTios().add(tia1);
	
	tio2.getSobrinhos().add(sobrinho1);
	sobrinho1.getTios().add(tio2);
	
	tio2.getSobrinhos().add(sobrinha2);
	sobrinha2.getTios().add(tio2);
	DAO<Object> dao = new DAO<>();
	dao.AbrirT()
	.incluir(tia1).incluir(tio2).incluir(sobrinho1)
	.incluir(sobrinha2).FecharT().fechar();
}
}
