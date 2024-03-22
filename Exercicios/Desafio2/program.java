/* 
O programa deverá sempre imprimir o seguinte relatório:



~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

~~~ Matrícula: xxxxx

~~~ Nome: xxxxx xxxxx

~~~ Status: "Aprovado" ou "Reprovado"

~~~ Nota final: xxxxx

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



------ 01

Crie um programa que receba como input quatro valores (matrícula, nome, nota1, nota2);

Durante a execução calcular a nota final do aluno utilizando a seguinte regra: notaFinal = (nota1 + nota2) / 2 . Se a nota final for igual ou superior a 6 o aluno está aprovado, caso contrário estará reprovado;



------ 02

Arrume o primeiro exercicio de forma a ler as mesmas informações só que adicionando elas em um VETOR (List<>). Fazendo isso de forma a permitir adicionar as informações de cinco alunos e imprimindo os resultados apenas após a leitura de todos eles.

 

------ 03

Agora atualize o programa para que seja possível ler as mesmas informações porem com até cinco notas. Fazendo isso de forma a verificar se o valor digitado está entre 0 a 10.



~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

~~~ Matrícula: xxxxx

~~~ Nome: xxxxx xxxxx

~~~ Aprovado: ( x ) Sim ( ) Não

~~~ Nota ( 1 ) : xxxxx

~~~ Nota ( 2 ) : yyyyy

~~~ Nota ( 3 ) : yyyyy

~~~ Nota ( 4 ) : yyyyy

~~~ Nota ( 5 ) : yyyyy

~~~ Nota final: xxxxx

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class program {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("\nInsira a sua matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\nInsira o seu nome: ");
            String nome = scanner.nextLine();

            double[] notas = new double[5];
            for (int j = 0; j < 5; j++) {
                System.out.println("\nInsira a sua nota " + (j + 1) + ": ");
                double nota = scanner.nextDouble();
                while (nota > 10 || nota < 0) {
                    System.out.println("\nApenas valores entre 0 e 10 são válidos: ");
                    nota = scanner.nextDouble();
                }
                notas[j] = nota;
            }

            Aluno aluno = new Aluno(matricula, nome, notas);
            alunos.add(aluno);
        }

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        scanner.close();
    }
}

class Aluno {
    private int matricula;
    private String nome;
    private double[] notas;

    public Aluno(int matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public double calcularNotaFinal() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getStatus() {
        double notaFinal = calcularNotaFinal();
        return notaFinal >= 6 ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n~~~ Matrícula: ").append(matricula);
        sb.append("\n~~~ Nome: ").append(nome);
        sb.append("\n~~~ Status: ").append(getStatus());
        for (int i = 0; i < notas.length; i++) {
            sb.append("\n~~~ Nota (").append(i + 1).append("): ").append(notas[i]);
        }
        sb.append("\n~~~ Nota final: ").append(calcularNotaFinal());
        return sb.toString();
    }
}
