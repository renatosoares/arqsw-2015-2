package cliente.fabrica_abstrata.arqsw.tads.ifrn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import fabrica_abstrata.arqsw.tads.ifrn.FabricaAbstrata;
import fabrica_abstrata.arqsw.tads.ifrn.FabricaConcretaA;
import fabrica_abstrata.arqsw.tads.ifrn.FabricaConcretaB;
import produtos.fabrica_abstrata.arqsw.tads.ifrn.CalculadoraAbstrata;
import produtos.fabrica_abstrata.arqsw.tads.ifrn.EscritorAbstrato;

public class Cliente {
	
	public static void main(String args[]) throws IOException {
		FabricaAbstrata fabrica = getFabrica();
		EscritorAbstrato escritor = fabrica.createEscritor();
		CalculadoraAbstrata calculadora = fabrica.createCalculadora();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		double valorA = in.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double valorB = in.nextDouble();
		
		escritor.escreve("O resultado da soma é = "+ calculadora.soma(valorA, valorB));
		
		in.close();
	}

	private static FabricaAbstrata getFabrica() throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("./properties/fabrica.properties");
		prop.load(file);
		String nomeFabrica = prop.getProperty("fabrica");
		if (nomeFabrica.equals("A")) {
			return new FabricaConcretaA();
		} else if (nomeFabrica.equals("B")) {
			return new FabricaConcretaB();
		}
		return null;
	}
}
