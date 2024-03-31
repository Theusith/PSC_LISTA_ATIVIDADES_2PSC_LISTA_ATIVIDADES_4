/*
Em um campeonato de LOL, enquanto não há a tomada de território,
o contador implementado deve contar (que é contabilizado pelo jogo),
o número de kills, deaths e assists. Se o número de kills for menor ou
igual a 5, ele mostra a mensagem “noob”, se chegar a 20 ou mais “master”.
Se o número de deaths chegar a 20 ou mais, ele mostra a mensagem “Houston,
we have a problem”. Se o número de assists chegar a 20 ou mais,
é mostrada a mensagem: “team work”. Lembre-se, é uma rotina que continua enquanto não houver um vencedor.
● Dicas:
○ há kills, deaths e assists total e da rodada
○ medite na frase: enquanto não há um vencedor, faça…
○ pergunte a cada loop o número de cada medida comentada.
○ você deve perguntar se há um vencedor a cada loop…
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalKills = 0, maiorKills = 0;
        int totalDeaths = 0, maiorDeaths = 0;
        int totalAssists = 0, maiorAssists = 0;


        while (true) {
            // Pergunta o número de kills, deaths e assists da rodada
            System.out.println("Digite o número de kills da rodada:");
            int killsRodada = sc.nextInt();
            // Verifica se o jogador é Master
            if (killsRodada >= 20) {
                System.out.println("Master!");
            }
            // Verifica se o jogador é considerado noob
            if (killsRodada <= 5) {
                System.out.println("Noob!");
            }
            System.out.println("Digite o número de deaths da rodada:");
            int deathsRodada = sc.nextInt();

            // Verifica se houve muitas mortes
            if (deathsRodada >= 20) {
                System.out.println("Houston, we have a problem!");
            }
            System.out.println("Digite o número de assists da rodada:");
            int assistsRodada = sc.nextInt();
            // Verifica se houve muito trabalho em equipe
            if (assistsRodada >= 20) {
                System.out.println("Team work!");
            }

            // Atualiza o total de kills, deaths e assists
            if(killsRodada > maiorKills){
                maiorKills = killsRodada;
            }
            if(deathsRodada > maiorDeaths){
                maiorDeaths = deathsRodada;
            }
            if(assistsRodada > maiorAssists){
                maiorAssists = assistsRodada;
            }
            totalKills += killsRodada;
            totalDeaths += deathsRodada;
            totalAssists += assistsRodada;

            // Pergunta se há um vencedor
            System.out.println("Há um vencedor? (S/N)");
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase("S")) {
                System.out.println("Total kills: " + totalKills);
                System.out.println("Total deaths: " + totalDeaths);
                System.out.println("Total assists: " + totalAssists );
                if(maiorKills >= 20){
                    System.out.println("Ranking: Master");
                }
                if(maiorKills <= 5){
                    System.out.println("Ranking: Noob");
                }

                break;
            }
        }

        sc.close();
    }
}
