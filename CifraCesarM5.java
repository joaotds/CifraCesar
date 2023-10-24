package modelo;

public class CifraCesarM5 extends CifraCesar {
	
	private Integer chave = -5;
	
	//Métodos
	public String descriptografar(String texto) {
		String retorno = "" ;
		
		for(int i=0; i<texto.length(); i++) {
			String letra = String.valueOf(texto.charAt(i));
			Integer Indice = this.alfabeto.indexOf(letra.toUpperCase());
			
			if(Indice > -1) {
				
				if(Indice >= this.alfabeto.length() - this.chave)
					Indice = Indice - this.alfabeto.length();
				
				String letraCripto = String.valueOf(this.alfabeto.charAt(Indice + this.chave)); 
				retorno += letraCripto;
			} else 
				retorno += letra;
		}
		
		return retorno;
	}
	
	public String criptografar(String texto) {
		String retorno = "";
		
		for(int i=0; i<texto.length(); i++) {
			String letra = String.valueOf(texto.charAt(i));
			Integer Indice = this.alfabeto.indexOf(letra.toUpperCase());
			
			if(Indice > -1) {
				if(Indice < this.chave)
					Indice = Indice + this.alfabeto.length();
				
				String letraCripto = String.valueOf(this.alfabeto.charAt(Indice - this.chave)); 
				retorno += letraCripto;
			} else 
				retorno += letra;
		}
		
		return retorno;
	}
}
