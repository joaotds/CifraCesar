package execucao;

import java.util.Scanner;

import modelo.CifraCesar;
import modelo.CifraCesar4;
import modelo.CifraCesar8;
import modelo.CifraCesarM5;

public class CifraExec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println();
			System.out.println("----MENU-----");
			System.out.println("1- Critografar");
			System.out.println("2- Descritografar");
			System.out.println("0- Sair");
			
			System.out.print("Informe a opção desejada: ");
			opcao = Integer.parseInt(sc.nextLine());
			
			switch (opcao) {
				case 1: 
					criptografar(sc);
					break;
			
				case 2: 
					descriptografar(sc);
					break;
		
				case 0: 
					System.out.println("Programa encerrado!");
					break;
					
				default:
					System.out.println("Opção Inválida!");
			}
			
		} while(opcao != 0);
		
		sc.close();
	}
	
	private static void criptografar(Scanner sc) {
		String texto = lerTexto(sc);
		CifraCesar cifra = lerAlgoritmo(sc);		
		
		System.out.println("Texto criptografado: " + cifra.criptografar(texto));
	}
	
	private static void descriptografar(Scanner sc) {
		String texto = lerTexto(sc);
		CifraCesar cifra = lerAlgoritmo(sc);		
		
		System.out.println("Texto criptografado: " + cifra.descriptografar(texto));
	}
	
	private static String lerTexto(Scanner sc) {
		System.out.print("Informe o texto para criptografar: ");
		String texto = sc.nextLine();
		return texto;
	}
	
	private static CifraCesar lerAlgoritmo(Scanner sc) {
		System.out.println("Informe o algoritmo de criptografia: ");
		System.out.println("1- Crifra de Cesar (chave 4)");
		System.out.println("2- Crifra de Cesar (chave 8)");
		System.out.println("3- Crifra de Cesar (chave -5)");
		int alg = Integer.parseInt(sc.nextLine());
		
		CifraCesar cifra = null;
		
		switch (alg) {
			case 1: 
				cifra = new CifraCesar4();
				break;
				
			case 2: 
				cifra = new CifraCesar8();
				break;
				
			case 3: 
				cifra = new CifraCesarM5();
				break;
		}
		
		return cifra;
	}

}
