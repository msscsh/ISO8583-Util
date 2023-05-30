package br.com.msscsh.isoutil.pojos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper=true)
public class ArquivoPOJOVISA extends ArquivoPOJO {

	private String atributoEspecificoDaVisa;
	
}
