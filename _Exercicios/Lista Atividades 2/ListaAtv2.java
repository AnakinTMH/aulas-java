import java.util.Arrays;
import java.util.Scanner;

public class ListaAtv2 {
    
    public static void main (String[] args){
        
        /*1 - Construa um programa que leia em um vetor uma sequência de 5 números digitados pelo usuário, calcule a média destes valores em um outro vetor, e depois apresente na tela quais valores são menores, iguais ou superiores à média. */

        int[] num = new int[5];
        Scanner resp = new Scanner(System.in);
        int maior = 0;
        int soma = 0;
        double media = 0;

        for (int i = 0; i < 5; i ++){
        System.out.println("Insira o " + (i + 1) + " número");
        num[i] = resp.nextInt();
        soma = soma + num[i];
        
            if (maior <= num[i]){
                maior = num[i];
            }

        }

        media = (soma/5);

        System.out.println("O maior número é: " + maior);
        System.out.println("A média dos números é: " + media);

    }

}
