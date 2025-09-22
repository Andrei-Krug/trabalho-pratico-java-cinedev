
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
}
