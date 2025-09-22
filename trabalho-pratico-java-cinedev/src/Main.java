import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int option;
        
        do {
            System.out.println("=== CineDev - Sistema de Gerenciamento de Assentos ===");
            System.out.println("1. Exibir Mapa de Assentos");
            System.out.println("2. Comprar Ingresso");
            System.out.println("3. Cancelar Compra de Ingresso");
            System.out.println("4. Exibir Relatório de Ocupação");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");//Menu inicial
            option = scan.nextInt();
            
        } while (option != 5);
    }
}