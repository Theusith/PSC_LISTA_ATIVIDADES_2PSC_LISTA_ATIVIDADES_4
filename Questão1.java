/*
Crie um programa que lê vários números inteiros e
positivos e imprima o produto dos números ímpares
e a soma dos números pares.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prodImpar = 1, somaPar = 0, num = 0;

        int i = 0;

        System.out.println("Para numeros inteiros positivos, os ímpares serão multiplicados e os pares serão somados/nPara sair digite '-1'.");

        for(i = 0; num != -1; i++){
            System.out.println("Digite um numero:");
            num = sc.nextInt();
            if(num >= 0 && num % 2 != 0){
                prodImpar *= num;
            }else if(num >= 0 && num % 2 == 0){
                somaPar += num;
            }
        }
        System.out.println("O produto dos numeros Ímpares é:" + prodImpar);
        System.out.println("A soma dos números pares é:" + somaPar);
        sc.close();

    }
}
