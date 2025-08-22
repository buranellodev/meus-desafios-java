public class TestTwo {
    // Nome da Classe Calculadora.

    // Mesmos nomes, mas parâmetros diferentes.
    int somar(int a, int b){
        return a + b;
    }

    double somar(double x, double y){
        return x + y;
    }

    int somar(int c, int d, int e){
        return c + d + e;
    }

    public static void main(String[] args) {
        TestUm calc = new TestUm();
        System.out.println(calc.somar(2, 4)); // CHAMA O SOMA INT, INT.
        // System.out.println(calc.somar(2.5, 3.5));// CHAMA O SOMA INT, INT E INT.
        // System.out.println(calc.somar(1, 2, 3)); // CHAMA O SOMA DOUBLE, DOUBLE.
    }
}

/*
- Sobrecarga:
// Não funcionou conforme exemplo! Só está chamando o método int, int.
 */