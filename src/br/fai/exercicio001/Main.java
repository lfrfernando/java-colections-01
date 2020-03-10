package br.fai.exercicio001;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();
	}
	
	private Scanner scanner = new Scanner(System.in);
    private final String VALOR_INVALIDO = "VALOR_INVALIDO";
	
    private void start() {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<String>();
		String valorRecebido = obterDados();
		System.out.println("o valor recebido foi:" + valorRecebido);
		
		while(lista.size() < 5) {
			String valorrecebido = obterDados();
			
			//System.out.println("O valor rebebido foi:" + valorRecebido);
			if(valorRecebido.isEmpty()) {
				valorRecebido.contentEquals(VALOR_INVALIDO);
				System.out.println("Este valor foi descartado");
			}else {
				lista.add(valorRecebido);
			}
		}
		
		
		for(String item: lista) {
			System.out.println("O item da lista é:" +item);	
		}
		lista.add("item adicionando automaticamente 01");
		lista.add("item adicionando automaticamente 02");
		
		lista.remove(1);
		lista.remove(2);
		for(String item : lista) {
			System.out.println("Novos valores:" + item);
		}
	}
	
	private String obterDados() {
		try {
			System.out.println("Digite o valor:");
			int valor = scanner.nextInt();
			
			return String.valueOf(valor);
		} catch (Exception e) {
			// TODO: handle exception
			scanner.next();
			System.out.println("Um valor invalido foi digitado:");
			return "VALOR_INVALIDO!";
			
		}
		
	}

}
