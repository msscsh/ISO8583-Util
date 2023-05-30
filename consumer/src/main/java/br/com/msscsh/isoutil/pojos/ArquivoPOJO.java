package br.com.msscsh.isoutil.pojos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public abstract class ArquivoPOJO {

	public String nomeDoEstabelecimento;
	public String nomeDaCidade;
	public String codigoDoPaisOuEstado;
	
}