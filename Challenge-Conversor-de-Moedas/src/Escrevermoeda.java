import java.util.Scanner;

public class Escrevermoeda {
    public static void escrever (Scanner scanner) {
        try {
            System.out.print("Digite a abreviação da moeda!\n");
            System.out.print("Moedas USD, BRL, EUR, JPY e outros...\n");
            System.out.print("Digite a moeda de origem: ");
            String moedaOrigem = scanner.next().toUpperCase();
            System.out.print("Digite a moeda de destino: ");
            String moedaDestino = scanner.next().toUpperCase();
            Conversor.ConversorMoeda(moedaOrigem, moedaDestino, scanner);
        } catch (Exception e) {
            System.out.println("*********************************** --ERRO-- ***********************************");
            System.out.println("Erro: " + e.getMessage());
            System.out.println("***********************************");
            // Finalizar a aplicação
            System.exit(1);
        }
    }
}