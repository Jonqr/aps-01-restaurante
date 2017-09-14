import java.util.Scanner;
public class Ingrediente {

	
	
	public String getCarne() {
		return Carne;
	}

	public void setCarne(String carne) {
		Carne = carne;
	}

	public String getLegume() {
		return Legume;
	}

	public void setLegume(String legume) {
		Legume = legume;
	}

	public String getVerdura() {
		return Verdura;
	}

	public void setVerdura(String verdura) {
		Verdura = verdura;
	}

	public String getTempero() {
		return Tempero;
	}

	public void setTempero(String tempero) {
		Tempero = tempero;
	}

	public String getAcompanhamento() {
		return Acompanhamento;
	}

	public void setAcompanhamento(String acompanhamento) {
		Acompanhamento = acompanhamento;
	}

	
	private String Carne, Legume, Verdura, Tempero, Acompanhamento;
	
	
	
	
}


/* Classe Ingrediente  
*Que pode ser um valor do conjunto
*	 ⟨carne,
*	legume
*	,verdura
*	,tempero,
*	acompanhamento⟩
*
*	REGRA: 
*Cada ingrediente deve ter também uma indicação se é opcional ou obrigatório.
*/