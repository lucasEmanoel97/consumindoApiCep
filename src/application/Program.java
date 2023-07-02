package application;

import java.util.Scanner;

import entities.Endereco;
import services.ServicoDeCep;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("─────░░▒▒▒─────░░▒▒░\n"
				+ "───░░░░░▒▓██▒░░░░░▒▓██▓\n"
				+ "──░░░░░▒▒▓▓▒▒░░░░▒▒▓████\n"
				+ "──▒░░▒▓▓▓▓▓▒▒▒▒▒▓▓██████▒\n"
				+ "─░▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓█▓▒░▒▒▓█▒─────░░▒▒▒\n"
				+ "──██▓▓▓▓▓▓▓▓▓▓▓▓█▒────░▒██▒░─────░▓██▒\n"
				+ "──▓██▓▓▓▓▓▓▓▓▓▓▓▒───░░▒▒▒▒░────░░▒▓███▓\n"
				+ "───▓██▓▓▓▓▓▓▓▓▓▓▒░░░▓▓▓▓▓▒▒░░░▒▓▓▓▓████░\n"
				+ "────▓██▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓█▓▓▓████░\n"
				+ "─────▒███▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████\n"
				+ "───────▓███▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▒\n"
				+ "────────░████████▒███▓▓▓▓▓▓▓▓▓▓▓█████▒\n"
				+ "──────────▒████▓░─░████▓▓▓▓▓▓▓▓█████▒\n"
				+ "────────────▓▓░─────▓████▓▓▓▓██████░\n"
				+ "─────────────────────▒████▓██████▒\n"
				+ "───────────────────────▓███████▓░\n"
				+ "────────────────────────░█████▒\n"
				+ "──────────────────────────░▓▒\n"
				+ "────────────────────────────");
		System.out.println();
		System.out.println("WELCOME TO ❤ LOVE CEP ❤");
		System.out.println();
		System.out.print("Informe seu CEP: ");
		String cep = new Scanner(System.in).nextLine();
		Endereco endereco = null;
		try {
			endereco = ServicoDeCep.buscaEndereco(cep);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("================== CEP: " + cep + " ================");
		System.out.println("Logradouro: " +endereco.getLogradouro());
		System.out.println("Bairro: " +endereco.getBairro());
		System.out.println("Cidade: " +endereco.getLocalidade());
		System.out.println("Estado: " +endereco.getUf());
		
	}
}
