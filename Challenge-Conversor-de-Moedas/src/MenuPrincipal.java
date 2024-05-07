import java.util.Scanner;

public class MenuPrincipal {
    public void exibir() {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("*********************************");
            System.out.println("Bem Vindo ao conversor de Moedas, Por favor escolha uma opção abaixo ");
            System.out.println("(1) - BRL (real Brasileiro) para USD (Dólar)");
            System.out.println("(2) - EUR (Euro) para CAD (Dólar Canadense)");
            System.out.println("(3) - ARS (Peso Argentino) GBP para (Libra esterlina)");
            System.out.println("(4) - COP (Peso Colombiano) para GHS (Cedi ganês)");
            System.out.println("(5) - EGP (Libra egípcia) para AUD (Dólar Australiano)");
            System.out.println("(6) - KRW (Won sul-coreano) para FJD (Dólar Fiji)");
            System.out.println("(7) - Digitar moeda de origem, destino e valor");
            System.out.println("(8) - Sair ");
            System.out.println("*********************************");

            System.out.print("Escolha uma opção válida: ");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    Conversor.ConversorMoeda("BRL", "USD", scanner);
                    break;
                case 2:
                    Conversor.ConversorMoeda("EUR", "CAD", scanner);
                    break;
                case 3:
                    Conversor.ConversorMoeda("ARS", "GBP", scanner);
                    break;
                case 4:
                    Conversor.ConversorMoeda("COP", "GHS", scanner);
                    break;
                case 5:
                    Conversor.ConversorMoeda("EGP", "AUD", scanner);
                    break;
                case 6:
                    Conversor.ConversorMoeda("KRW", "FJD", scanner);
                    break;
                case 7:
                    Escrevermoeda.escrever(scanner);
                    break;
                case 8:
                    System.out.println("Fechando o aplicativo");
                    break;
                default:
                    System.out.println("*********************************** --ERRO-- ***********************************");
                    System.out.println("Opção inválida.");
                    System.out.println("***********************************");
                    System.out.println("Enter para voltar ao menu principal");
                    scanner.nextLine();
            }
        } while (escolha != 8);
        scanner.close();
        System.exit(1);
    }
}