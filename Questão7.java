/*
Crie um programa em Java que exiba formas geométricas na tela.
Um menu deve ser exibido com as seguintes opções: retângulo,
diagonal superior esquerda, diagonal superior direita, diagonal inferior esquerda,
diagonal inferior direita. As imagens devem ser formadas por asteriscos (*) e, a
pessoa utilizadora deve informar a quantidade de colunas. Abaixo estão alguns exemplos das formas:
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho;
        int opcao= 0;

        while(opcao != 6){
            System.out.println("Digite:");
            System.out.println("1 - Para retangulo");
            System.out.println("2 - Para diagonal Superior esquerda");
            System.out.println("3 - Para diagonal Superior direita");
            System.out.println("4 - Para Diagonal inferior esquerda");
            System.out.println("5 - Para diagonal inferior direita");
            System.out.println("6 - Para sair");
            opcao = sc.nextInt();


            switch(opcao){
                case 1:

                    System.out.println("Digite a quantidade de colunas:");
                    tamanho = sc.nextInt();
                    for (int i = 0; i < tamanho; i++) {
                        for (int j = 0; j < tamanho; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:

                    System.out.println("Digite a quantidade de colunas:");
                    tamanho = sc.nextInt();
                    for (int i = 0; i < tamanho; i++) {
                        for (int j = 0; j < tamanho; j++) {
                            if (j <= tamanho - i - 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case  3:

                    System.out.println("Digite a quantidade de colunas:");
                    tamanho = sc.nextInt();
                    for (int i = 0; i < tamanho; i++) {
                        for (int j = 0; j < tamanho; j++) {
                            if (j >= i) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 4:

                    System.out.println("Digite a quantidade de colunas:");
                    tamanho = sc.nextInt();
                    for (int i = 0; i < tamanho; i++) {
                        for (int j = 0; j < tamanho; j++) {
                            if (j <= i) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }

                case 5:

                    System.out.println("Digite a quantidade de colunas:");
                    tamanho = sc.nextInt();
                    for (int i = 0; i < tamanho; i++) {
                        for (int j = 0; j < tamanho; j++) {
                            if (j >= tamanho - i - 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Opção Inválida");
            }
          sc.close();

        }


    }
}
