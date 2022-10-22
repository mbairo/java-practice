import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Cálculo de Rentabilidade de Ativos ---");

        System.out.print("Nome da ação: ");
        String nomeDoAtivo = scanner.next();
        System.out.print("Quantidade: ");
        double quantidade = scanner.nextInt();

        System.out.print("Preço médio: ");
        double precoMedio = scanner.nextDouble();

        System.out.print("Valor atual: ");
        double valorAtual = scanner.nextDouble();

        Calculos calculos = new Calculos(nomeDoAtivo, quantidade, precoMedio, valorAtual);

        System.out.println(calculos);

        System.out.println("\nInforme o número da opção desejada");
        System.out.println("Calcular outro Ativo?");
        System.out.println("1 - SIM  \n2 - NÃO");
        System.out.print("\nOpção: ");
        int option = scanner.nextInt();

        while (option == 1) {
            System.out.print("\nNome da ação: ");
            nomeDoAtivo = scanner.next();
            System.out.print("Quantidade: ");
            quantidade = scanner.nextInt();

            System.out.print("Preço médio: ");
            precoMedio = scanner.nextDouble();

            System.out.print("Valor atual: ");
            valorAtual = scanner.nextDouble();

            calculos = new Calculos(nomeDoAtivo, quantidade, precoMedio, valorAtual);
            System.out.println(calculos);

            System.out.println("Calcular outro Ativo?");
            System.out.println("Informe o número da opção desejada:");
            System.out.println("1 - SIM  \n2 - NÃO");
            System.out.print("Opção: ");
            option = scanner.nextInt();
        }

    }
}