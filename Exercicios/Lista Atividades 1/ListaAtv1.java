import java.util.Arrays;
import java.util.Scanner;

public class ListaAtv1 {

    public static void main (String[] args){

        /* 1 - Escreva um algoritimo que leia um número digitado pelo usuário e mostre a mensagem "Número maior do que 10!", caso este número seja maior, ou "Número menor ou igual a 10!", caso este número seja menor ou igual.

        System.out.println("Insira um número: ");

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero > 10) {
            System.out.println("O Número: " + numero + " é maior do que 10!");
        } else {
            System.out.println("O Número: " + numero + " é menor ou igual a 10!");
        }

        scanner.close();
        */

        /* 2 - Escreva um algoritmo que leia dois números digitados pelo usuário e apresente o maior deles e o resultado da sua soma 

        System.out.println("Insira um número: ");

        Scanner num1 = new Scanner(System.in);
        int numero1 = num1.nextInt();

        System.out.println("Insira outro número: ");

        Scanner num2 = new Scanner(System.in);
        int numero2 = num2.nextInt();

        System.out.println("O resultado da soma dos números inseridos é: " + (numero1 + numero2));

        if (numero1 > numero2) {
            System.out.println("O número com o valor mais alto é o: " + numero1);
        }
        else {
            System.out.println("O número com o valor mais alto é o: " + numero2);
        }
        */

        /* 3 - Escreva um algoritmo que leia os valores de dois números inteiros distintos nas variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais, informe ao usuário que a sequência de números informados é inválida.

        System.out.println("Insira um número: ");

        Scanner num1 = new Scanner(System.in);
        int numero1 = num1.nextInt();

        System.out.println("Insira outro número: ");

        Scanner num2 = new Scanner(System.in);
        int numero2 = num2.nextInt();

        if (numero1 > numero2) {
            System.out.println("O número com o valor mais alto é o: " + numero1);
        }
        else if (numero2 > numero1) {
            System.out.println("O número com o valor mais alto é o: " + numero2);
        }
        else {
            System.out.println("A sequência de números informados é INVALIDA");
        }
        */

        /* 4 - Escreva um algoritmo que leia dois números e ao final mostre a soma,subtração, multiplicação e a divisão dos números lidos.

        System.out.println("Insira um número: ");

        Scanner num1 = new Scanner(System.in);
        int numero1 = num1.nextInt();

        System.out.println("Insira outro número: ");

        Scanner num2 = new Scanner(System.in);
        int numero2 = num2.nextInt();

        System.out.println("O resultado da soma dos números inseridos é: " + (numero1 + numero2));
        System.out.println("O resultado da subtração dos números inseridos é: " + (numero1 - numero2));
        System.out.println("O resultado da multiplicação dos números inseridos é: " + (numero1 * numero2));
        System.out.println("O resultado da divisão dos números inseridos é: " + (numero1 / numero2));
        */

        /* 5 - Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o valor da variável A. Apresentar uma mensagem com o valororiginal de cada variável e outra com os valores trocados.

        System.out.println("Insira o primeiro número: ");

        Scanner resposta1 = new Scanner(System.in);  
        int num1 = resposta1.nextInt();


        System.out.println("Insira o segundo número: ");

        Scanner resposta2 = new Scanner(System.in);  
        int num2 = resposta2.nextInt();

        int valor1 = num1;
        int valor2 = num2;

        System.out.println("Os valores originais são: " + num1 + " e " + num2);
        num1 = valor2;
        num2 = valor1;

        System.out.println("Os valores invertidos agora são: " + num1 + " e " + num2);

        resposta1.close();
        resposta2.close(); */

        /* 6 - Ler uma temperatura em graus Celsius e apresentá-la convertida em grausFahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5.

        RESPOSTA: 
        System.out.println("Insira o valor em Cº: ");

        Scanner celsius = new Scanner(System.in);
        int cel = celsius.nextInt();

        int fah = (9 * cel + 160)/5;

        System.out.println("O valor de: " + cel + " convertido em Fº é: " + fah);

        celsius.close();  */

        /* 7 - Escreva um algoritmo que leia um número e diga, através de umamensagem, se este número está no intervalo entre 100 e 200. Caso onúmero esteja fora do intervalo, o usuário também deverá ser informado. 

        REPOSTA: 
        System.out.println("Insira o número: ");

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        if (num >= 100 && num <= 200) {
            System.out.println("O número " + num + " está entre 100 e 200.");
        } else {
            System.out.println("O número " + num + " não está entre 100 e 200.");
        }
        
        number.close();
        */

        /* 8 - Escreva um algoritmo que leia um número e mostre uma mensagem casoeste número seja maior ou igual a 50, outra se ele for menor que 50.

        RESPOSTA:
        System.out.println("Insira o número: ");

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        if (num >= 50) {
            System.out.println("O número " + num + " é maior ou igual que 50");
        } else {
            System.out.println("O número " + num + " não é menor que 50");
        }
        
        number.close();
        */

        /* 9 - Leia dois números nas variáveis A e B e identifique se os valores são iguaisou diferentes. Caso eles sejam iguais, imprima uma mensagem dizendo quesão iguais. Caso sejam diferentes, informe ao usuário que eles são diferentese qual número é o maior.

        RESPOSTA:
        System.out.println("Insira o 1º número: ");

        Scanner number1 = new Scanner(System.in);
        int num1 = number1.nextInt();


        System.out.println("Insira o 2º número: ");

        Scanner number2 = new Scanner(System.in);
        int num2 = number2.nextInt();


        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior que " + num2);
        } else {
            System.out.println("O número " + num1 + " é menor que " + num2);
        }


        number1.close();
        number2.close();
        */

        /* 10 - Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso.Caso o usuário digite um valor que não esteja neste intervalo, exibir amensagem: “Número inválido!”. 

        REPOSTA:
        System.out.println("Insira um número de 1 a 5: ");

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        switch (num) {
                case 1:
                System.out.println("O número é UM");
                    break;
                case 2:
                System.out.println("O número é DOIS");
                    break;
                case 3:
                System.out.println("O número é TRÊS");
                    break;
                case 4:
                System.out.println("O número é QUATRO");
                    break;
                case 5:
                System.out.println("O número é CINCO");
                    break;
                default:
                System.out.println("Número inválido");
                    break;
            }

        number.close();
        */

        /* 11 - Escreva um algoritmo que leia três valores inteiros distintos e escreva-os emordem crescente.

        RESPOSTA: 
        import java.util.Arrays;
        int[] num = new int[3];
        
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Insira o " + (i + 1) + "º valor: ");
            num[i] = scanner.nextInt();
        }

        Arrays.sort(num);

        System.out.println("Números em ordem crescente:");
        for (int i = 0; i < 3; i++) {
            System.out.println(num[i]);
        }

        scanner.close();
        */

        /* 12 - Escreva um algoritmo que receba o número do mês e mostre o mêscorrespondente. Valide mês inválido.

        System.out.println("Insira O número do mês desejado: ");

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        if (num < 12 && num > 0) {
            System.out.println("O próximo mês é: " + (num + 1));
        } else if (num == 12) {
            System.out.println("O próximo mês é: 1 ");
        } else {
            System.out.println("Mês inválido");
        }
        
        number.close(); 
        */

    }

}