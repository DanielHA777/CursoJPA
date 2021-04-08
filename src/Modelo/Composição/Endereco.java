package Modelo.Composição;

import javax.persistence.Embeddable;

@Embeddable // compartilha dados de uma tabela em colunas iguais
public class Endereco {
private String logradouro;
private String complemento;
public String getLogradouro() {
	return logradouro;
}
public void setLogradouro(String logradouro) {
	this.logradouro = logradouro;
}
public String getComplemento() {
	return complemento;
}
public void setComplemento(String complemento) {
	this.complemento = complemento;
}

}
