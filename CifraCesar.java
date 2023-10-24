package modelo;

public abstract class CifraCesar {
	
	protected String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	//Métodos
	public abstract String criptografar(String texto);
	
	public abstract String descriptografar(String texto);
	

}
