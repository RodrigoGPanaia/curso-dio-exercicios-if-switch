//      Exercicio utilizando if e switch

import java.util.Scanner;

public class exercicio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        1. Com if, exiba o nome do mês do ano de acordo com seu número. Evitando o efeito
//        "flexa".

        System.out.println("Exercício Exibir nome do mês");
        int mesIf;
        System.out.print("Digite o Número do Mês: ");
        mesIf = scan.nextInt();

        if (mesIf == 1) {
            System.out.println("Janeiro");
        } else if (mesIf == 2) {
            System.out.println("Fevereiro");
        } else if (mesIf == 3) {
            System.out.println("Março");
        } else if (mesIf == 4) {
            System.out.println("Abril");
        } else if (mesIf == 5) {
            System.out.println("Maio");
        } else if (mesIf == 6) {
            System.out.println("Junho");
        } else if (mesIf == 7) {
            System.out.println("Julho");
        } else if (mesIf == 8) {
            System.out.println("Agosto");
        } else if (mesIf == 9) {
            System.out.println("Setembro");
        } else if (mesIf == 10) {
            System.out.println("Outubro");
        } else if (mesIf == 11) {
            System.out.println("Novembro");
        } else if (mesIf == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Digite um número valido!");
        }
        System.out.println("_______________________________________________________________________________");
        System.out.println();

//        2. Faça também outro if que verifique se o mês é julho, dezembro ou janeiro, para
//        assim exibir o texto "Férias".

        System.out.println("Exercício Exibir Texto Férias");
        String mes = "Janeiro";

        if (mes == "Janeiro" || mes == "Julho" || mes == "Dezembro"){
            System.out.println("Ferias");
        }
        System.out.println("_______________________________________________________________________________");
        System.out.println();

//        3. Com switch use String para a partir do dia da semana, exibir seu número.

        System.out.println("Exercício dia da semana");
        String dia;
        System.out.print("Digite um dia da semana: ");
        dia = scan.next();

        switch (dia){
            case "Domingo":
                System.out.println(1);
                break;
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            default:
                System.out.println("Digite um dia da Semana valido:");
        }

    }

}
