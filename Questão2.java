/*
Faça um programa que leia um número indeterminado de valores e mostre o valor lido,
seu quadrado, seu cubo e sua raiz quadrada. Finalize a entrada com valor negativo ou zero.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Entrada de dados
            System.out.println("Digite um número (ou um valor negativo/zero para sair):");
            double numero = sc.nextDouble();
            
            if (numero <= 0) {
                System.out.println("Programa encerrado.");
                break;
            }
            
            double quadrado = Math.pow(numero, 2);
            double cubo = Math.pow(numero, 3);
            double raizQuadrada = Math.sqrt(numero);
            
            System.out.println("Número: " + numero);
            System.out.println("Quadrado: " + quadrado);
            System.out.println("Cubo: " + cubo);
            System.out.println("Raiz quadrada: " + raizQuadrada);
            System.out.println();
        }

        sc.close();
    }
}
