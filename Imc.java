package teste.imc;

import java.util.Scanner;

public class Imc {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = ler.next();
		
		System.out.println("Digite seu sexo");
		String sexo = ler.next();
		char sexo1 = sexo.charAt(0);
		
		System.out.println("Digite sua idade");
		int idade = ler.nextInt();
		
		System.out.println("Digite sua altura");
		double altura = ler.nextDouble();
		
		System.out.println("Digite seu peso");
		double peso = ler.nextDouble();
		
		double imc=0;			

		
		if (idade<18 && sexo1=='m') {
			imc = CalcImc(peso,altura);
			System.out.println("Nome: "+nome);
			System.out.println("Idade: "+idade);
			System.out.println("Sexo: "+ sexo);
			System.out.println("Menor de idade");
			
			if (imc < 11) {
				System.out.println("Baixo peso");
				
			}
			
			else if (imc >10 && imc < 86) {
				System.out.println("Peso normal ");
				
			}
			
			else if (imc >85 && imc < 96) {
				System.out.println("Sobrepeso");
				
			}
			
			else if (imc >95 ) {
				System.out.println("Obesidade");	
			}
		}
		
		if (idade<18 && sexo1=='f') {
			imc = CalcImc(peso,altura);
			System.out.println("Nome: "+nome);
			System.out.println("Idade: "+idade);
			System.out.println("Sexo: "+ sexo);
			System.out.println("Menor de idade");
			
			if (imc < 11) {
				System.out.println("Baixo peso");
				
			}
			
			else if (imc >10 && imc < 85) {
				System.out.println("Peso normal ");
				
			}
			
			else if (imc >85 && imc < 95) {
				System.out.println("Sobrepeso");
				
			}
			
			else if (imc >94 ) {
				System.out.println("Obesidade");	
			}
		}
			
		if (idade>17 && idade<65 ) {
						
			imc = CalcImc(peso,altura);
			System.out.println("Nome: "+nome);
			System.out.println("Idade: "+idade);
			System.out.println("Sexo: "+ sexo);
			System.out.println("Maior de idade");
					
			if (imc <16) {
					System.out.println("Baixo peso muito grave");
					
			}
			else if (imc >=16 && imc < 16.99) {
					System.out.println("Baixo peso grave");
					
			}
				
			else if (imc >17 && imc < 18.49) {
				System.out.println("Baixo peso");
					
			}
				
			else if (imc >18.50 && imc < 24.99) {
				System.out.println("Peso normal ");
					
			}
				
			else if (imc >25 && imc < 29.99) {
				System.out.println("Sobrepeso");
					
			}
				
			else if (imc >30 && imc < 34.99) {
				System.out.println("Obesidade grau I");
					
			}
			else if (imc >35 && imc < 39.99) {
				System.out.println("Obesidade grau II");
					
			}
				
			else if(imc >40) {
				System.out.println("Obesidade grau II");
					
			}
		}
		
		if (idade>64 && sexo1=='m' ) {
			imc = CalcImc(peso,altura);
			System.out.println("Nome: "+nome);
			System.out.println("Idade: "+idade);
			System.out.println("Sexo: "+ sexo);
			System.out.println("Idoso Masculino");
			
			
			if (imc < 21.9) {
				System.out.println("Baixo peso");
				
			}
			
			else if (imc >22 && imc < 27) {
				System.out.println("Peso normal ");
				
			}
			
			else if (imc >27.1 && imc < 30) {
				System.out.println("Sobrepeso");
				
			}
			else if (imc >30.1 && imc < 35) {
				System.out.println("Obesidade grau I");
				
			}
			else if (imc >35.1 && imc < 39.9) {
				System.out.println("Obesidade grau II");
				
			}
			else if (imc >40) {
				System.out.println("Obesidade grau III (obesidade mórbida)");
				
			}
		}
		
		if (idade>64 && sexo1=='f'){
			imc = CalcImc(peso,altura);
			System.out.println("Nome: "+nome);
			System.out.println("Idade: "+idade);
			System.out.println("Sexo: "+ sexo);
			System.out.println("Idoso Feminino");
			
			
			if (imc < 21.9) {
				System.out.println("Baixo peso");
				
			}
			
			else if (imc >22 && imc < 27) {
				System.out.println("Peso normal ");
				
			}
			
			else if (imc >27.1 && imc < 32) {
				System.out.println("Sobrepeso");
				
			}
			else if (imc >32.1 && imc < 37) {
				System.out.println("Obesidade grau I");
				
			}
			else if (imc >37.1 && imc < 41.9) {
				System.out.println("Obesidade grau II");
				
			}
			else if (imc >42) {
				System.out.println("Obesidade grau III (obesidade mórbida)");
				
			}
		}
				
		System.out.println("Seu IMC é: "+imc);			
		
	}		
	
	public static double CalcImc(double v1, double v2) {
		return v1 / (v2*v2);
		
	}
	
}