/*
1- Construa um programa que leia em um vetor uma sequência de 5 números digitados pelo usuário, calcule a média destes valores em um outro vetor, edepois apresente na tela quais valores são menores, iguais ou superiores àmédia.
*/

import java.util.Scanner;
import java.util.Arrays;;

public class Atv1{

    public static void main(String[] args){

        int[] num = new int[5];
        double mediaFinal = 0;
        double mediaArm = 0;
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 5; i++){

            System.out.println("Insira o " + (i+1)+ "° número: ");
            num[i] = scanner.nextInt();

            mediaArm = (num[i] + mediaFinal);

        }

        mediaFinal = (mediaArm /5);

        System.out.println("A média é: " + mediaFinal);
        
        scanner.close();

    }

}