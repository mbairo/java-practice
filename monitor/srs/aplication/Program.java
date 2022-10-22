package aplication;

import java.util.Scanner;
import entities.Monitor;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dados do monitor: ");

        System.out.print("Marca: ");
        String marca = scanner.next();

        System.out.print("Polegadas: ");
        Double polegadas = scanner.nextDouble();

        System.out.print("Resolução: ");
        scanner.nextLine();
        String resolucao = scanner.nextLine();
        
        Monitor monitor = new Monitor(marca, polegadas, resolucao);
        System.out.println(monitor);
    }
}
