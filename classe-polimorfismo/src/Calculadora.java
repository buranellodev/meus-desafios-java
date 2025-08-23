public class Calculadora {
    public int soma(int a, int b){
        return a + b;
    }

    public double soma(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); // POLIMORFISMO ESTÁTICO
        System.out.println(calc.soma(2, 3)); // CHAMA VERSÃO INT, INT
        System.out.println(calc.soma(2.5, 3.5)); // CHAMA VERSÃO DOUBLE, DOUBLE
    }
}



// Polimorfismo:
/*
Uma classe ou método pode ter várias formas;
Permite que use objetos de diferentes tipos de forma uniforme;
Sobrecarga de métodos (mesmo método, diferentes parâmetros) ou sobrescita de métodos (@OVERRIDE).
*/