abstract class TestUm {
    abstract double calcularArea();
}

class Circulo extends TestUm {
    private double raio;
    public Circulo(double r) { raio = r; }

    @Override
    double calcularArea(){
        return Math.PI * raio * raio;
    }
}

// Abstração
/*
Focar no que um objeto faz, sem se preocupar com como ele faz.
Facilita criar interfaces e classes abstratas, permitindo programar para contratos em vez de implementações especifícas.
*/

