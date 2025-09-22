import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SalaCine sala = new SalaCine(); //Instanciando uma sala de cinema
        int option;
        
        do {
            System.out.println("=== CineDev - Sistema de Gerenciamento de Assentos ===");
            System.out.println("1. Exibir Mapa de Assentos");
            System.out.println("2. Comprar Ingresso");
            System.out.println("3. Cancelar Compra de Ingresso");
            System.out.println("4. Exibir Relatório de Ocupação");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            option = scan.nextInt();

            switch (option) {
                case 1: //Chamando função para mostrar assentos
                    sala.mostrarAssentos();
                    break;

                case 2: //Chamando fução para mostrar assento e comprar ingresso
                    sala.mostrarAssentos();
                    System.out.println("Digite a fila (1-10): ");
                    int fila = scan.nextInt(); 
                    System.out.println("Digite o assento (1-20): ");
                    int assento = scan.nextInt();
                    sala.compraingresso(fila, assento);
                    break;

                case 3: //Chamando função para mostrar assento e cancelar ingresso
                    sala.mostrarAssentos();
                    System.out.println("Digite a fila (1-10): ");
                    fila = scan.nextInt(); 
                    System.out.println("Digite o assento (1-20): ");
                    assento = scan.nextInt();
                    sala.cancelaingresso(fila, assento);
                    break;

                case 4: //Chamando funcção para mostar relatório da sala de cinema
                    sala.relatorioDeOcupacao();
                    break;

                case 5: //Saindo do menu1
                    
                    System.out.println("Saindo... Obrigado por usar o CineDev!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (option != 5);
    }
}