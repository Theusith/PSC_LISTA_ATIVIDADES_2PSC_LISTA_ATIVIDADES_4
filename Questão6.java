/*
Crie um programa em Java que implementa um jogo simples de adivinhação.
O objetivo do jogo é que o usuário tente adivinhar um número secreto gerado
aleatoriamente pelo computador. Este número estará entre 1 e 100, inclusive.
Para tornar o jogo interativo e dar feedback ao jogador, o programa deve
informar após cada tentativa se o palpite do usuário é muito alto, muito baixo, ou correto.
O jogo termina quando o usuário acertar o número, e o programa deve informar o
número de tentativas que foram necessárias para chegar à resposta correta.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, tentativa, max = 100, min = 0;

        while(true){
            System.out.println("Bem vindo ao jogo de advinhação! ");
            System.out.println("Estou pensando em um número entre 0 e 100...");
            System.out.println("Tente advinhar qual é!");
            num = (int)(Math.random() * max - min + 1) + min + 1;

            do{
                tentativa = sc.nextInt();
                if (tentativa == num) {
                    System.out.println("Parabens, você acertou!");
                }
                if (tentativa > num) {
                    System.out.println("Valor alto!");
                    System.out.println("Tente novamente:");
                }
                if (tentativa < num) {
                    System.out.println("Valor baixo!");
                    System.out.println("Tente novamente:");
                }
            }while(tentativa != num);

            System.out.println("Gostaria de tentar novamente? [S/N]");
            String resposta = sc.next();
            if(resposta.equalsIgnoreCase("N")){
                System.out.println("Obrigado por jogar comigo!");
                break;

            }
        }
        sc.close();
    }
}
