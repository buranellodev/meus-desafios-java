import java.net.SocketTimeoutException;

public class TestUm {
    // classe Calculadora.

    // Método com retorno.
    public int somar(int a, int b){
        return a + b;
    }

    // Método sem retorno.
    public void exibirMensagem(){
        System.out.println("Olá, mundo!");
    }

    // Método estático.
    static double multiplicar(double x, double y){
        return x * y;
    }

    public static void main(String[] args) {
        TestUm calc = new TestUm();
        System.out.println(calc.somar(5,3)); // R = 8
        calc.exibirMensagem(); // Olá, mundo.
        System.out.println(TestUm.multiplicar(2.5, 4)); // R = 10.
    }
}
