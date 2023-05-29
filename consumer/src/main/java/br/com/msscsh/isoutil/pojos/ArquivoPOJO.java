package br.com.msscsh.isoutil.pojos;

public class ArquivoPOJO {

	String campoA;
	String campoB;
	String campoC;
	
	public String getCampoA() {
		return campoA;
	}
	public void setCampoA(String campoA) {
		this.campoA = campoA;
	}
	
	public String getCampoB() {
		return campoB;
	}
	public void setCampoB(String campoB) {
		this.campoB = campoB;
	}
	
	public String getCampoC() {
		return campoC;
	}
	public void setCampoC(String campoC) {
		this.campoC = campoC;
	}
	
	@Override
	public String toString() {
		return "ArquivoPOJO [campoA=" + campoA + ", campoB=" + campoB + ", campoC=" + campoC + "]";
	}
	
}