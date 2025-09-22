
public class SalaCine {
    
    // Matriz que representa os assentos da sala de cinema (10 fileiras x 20 assentos)
    private char[][] assentos;

    // Construtor: inicializa todos os assentos como livres ('L')
    public SalaCine() {
        this.assentos = new char[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                this.assentos[i][j] = 'L'; // 'L' significa assento Livre
            }
        }
    }
       // Exibe o mapa da sala com todos os assentos formatados
    // Cada assento é mostrado como [L] (livre) ou [X] (ocupado)
    public void mostrarAssentos() {
        // Cabeçalho com os números dos assentos (colunas)
        System.out.print("Assentos:");
        for (int i = 1; i <= 20; i++) {
            if (i < 10) {
                System.out.print("  " + i); // Alinha os números de 1 a 9 com dois espaços
            } else {
                System.out.print(" " + i);  // Alinha os números de 10 a 20 com um espaço
        }
    }
        System.out.println();

    // Percorre cada fileira (linha da matriz)
        for (int i = 0; i < this.assentos.length; i++) {
    // Mostra o número da fileira com alinhamento adequado
        if ((i + 1) < 10) {
            System.out.print("Fila  " + (i + 1) + ":");
        } else {
            System.out.print("Fila " + (i + 1) + ":");
        }

        // Percorre os assentos da fileira (colunas da matriz)
            for (int j = 0; j < this.assentos[i].length; j++) {
                System.out.print("[" + this.assentos[i][j] + "]"); // Exibe [L] ou [X]
        }

            // Quebra de linha para a próxima fileira
            System.out.println();
        }
    }
    // Realiza a compra de um ingresso (reserva um assento)
    // Marca o assento como 'X' se estiver livre
    public void compraingresso(int posi, int assen) {
        int cordQueue = posi - 1; // Ajusta para índice da matriz (0 a 9)
        int cordSeat = posi - 1;   // Ajusta para índice da matriz (0 a 19)

        // Verifica se a posição é válida na matriz
        if ((posi >= 1 && posi <= 10) && (assen >= 1 && assen <= 20)) {
            // Verifica se o assento está livre
            if (this.assentos[cordQueue][cordSeat] == 'L') {
                System.out.println("Assento reservado, compra concluída.");
                this.assentos[cordQueue][cordSeat] = 'X'; // Marca como ocupado
            } else {
                System.out.println("Lugar já reservado.");
                return;
            }
        } else {
            System.out.println("Não existe nenhum assento nas coordenadas informadas.");
            return;
        }
    }
    // Cancela uma reserva, liberando o assento
    // Marca o assento como 'L' se estiver ocupado
    public void cancelaingresso (int posi, int assen) {
        int cordQueue = posi - 1;
        int cordSeat = posi - 1;

        // Verifica se a posição é válida na matriz
        if ((posi >= 1 && posi <= 10) && (assen >= 1 && assen <= 20)) {
            // Verifica se o assento está ocupado
            if (this.assentos[cordQueue][cordSeat] == 'X') {
                System.out.println("Reserva cancelada com sucesso.");
                this.assentos[cordQueue][cordSeat] = 'L'; // Marca como livre
            } else {
                System.out.println("O lugar já está livre.");
                return;
            }
        } else {
            System.out.println("Não existe nenhum assento nas coordenadas informadas.");
            return;
        }
    }

}
