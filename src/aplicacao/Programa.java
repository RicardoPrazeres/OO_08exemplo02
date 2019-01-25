package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Empregado;
import entidade.EmpregadoTercerizado;



public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.println("Quantos funcionários?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Empregado #" + i +" data:");
			System.out.print("Ele é tercerizado (s/n) ");
			char ch = sc.nextLine().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Horas: ");
			double horas = sc.nextInt();
			System.out.print("Valor por hora:" );
			double valorHora = sc.nextDouble();
			if(ch == 's') {
				System.out.print("Adicionar valor: ");
				double ganhoAdicional = sc.nextDouble();
				Empregado emp = new EmpregadoTercerizado(nome, horas, valorHora, ganhoAdicional);
				
				
			}
						
			
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
