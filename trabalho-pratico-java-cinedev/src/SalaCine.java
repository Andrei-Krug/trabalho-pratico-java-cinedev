
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
}
