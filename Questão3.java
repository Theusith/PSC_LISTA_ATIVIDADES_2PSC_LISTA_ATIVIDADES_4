/*
Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:
a) a quantidade de pessoas com idade superior a 50 anos;
b) a média das alturas das pessoas com idade entre 10 e 20 anos;
c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double altura, peso, cont;
        int idadeAcimaDe50 = 0;
        double somaAlturas10_20 = 0;
        int contadorAlturas10_20 = 0;
        int pessoasTotal = 10;
        int pessoasPesoInferior40 = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite a idade da pessoa " + (i+1) + ":");
            int idade = sc.nextInt();
            System.out.println("Digite a altura (em metros) da pessoa " + (i+1) + ":");
            altura = sc.nextDouble();
            System.out.println("Digite o peso (em quilos) da pessoa " + (i+1) + ":");
            peso = sc.nextDouble();

            if (idade > 50) {
                idadeAcimaDe50++;
            }
            if (idade >= 10 && idade <= 20) {
                somaAlturas10_20 += altura;
                contadorAlturas10_20++;
            }
            if (peso < 40) {
                pessoasPesoInferior40++;
            }

        }
        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + idadeAcimaDe50);
        if (contadorAlturas10_20 > 0) {
            double mediaAlturas10_20 = somaAlturas10_20 / contadorAlturas10_20;
            System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas10_20);
        } else {
            System.out.println("Não há pessoas com idade entre 10 e 20 anos.");
        }

        double porcentagemPesoInferior40 = (double) pessoasPesoInferior40 / pessoasTotal * 100;
        System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas: " + porcentagemPesoInferior40 + "%");

        sc.close();


    }
}
