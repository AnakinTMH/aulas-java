package calculadoraproj.src.main.java.com.trabalho;

import java.util.Scanner;

import calculadoraproj.src.main.java.com.trabalho.Calculadora;

public class Main {
    public static void main(String[] args) {

        
        
        Scanner resposta = new Scanner(System.in); 

        System.out.println("Insira o Primeiro número: ");
        double num1 = resposta.nextDouble();
        resposta.nextLine();

        System.out.println("Insira a Operação Arimitética: ");
        String operador = resposta.nextLine();

        System.out.println("Insira o Segundo número: ");
        double num2 = resposta.nextDouble();
        resposta.nextLine();


        if (operador == "+"){

            double soma = Calculadora.Soma(num1,num2);
            System.out.println("O resultado sa soma é: " + soma);

        }
        else if (operador == "-"){

            double subtracao = Calculadora.Subtracao(num1,num2);
            System.out.println("O resultado sa subtração é: " + subtracao);

        }
        else if (operador == "*"){

            double multiplicar = Calculadora.Multiplicacao(num1,num2);
            System.out.println("O resultado sa multiplicação é: " + multiplicar);

        }
        else if (operador == "/"){

            double dividir = Calculadora.Divisao(num1,num2);
            System.out.println("O resultado sa divisão é: " + dividir);

        }

        resposta.close();
        

    }
}