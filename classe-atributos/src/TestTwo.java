public class TestTwo {
    // Class ContaBancaria

    private double saldo;

    // Getter
    public double getSaldo() {
        return saldo;
    }

    // Setter com validação
    public void setSaldo(double saldo) {
        if ( saldo >= 0){
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido!");
        }
    }

    public static void main(String[] args) {
        TestTwo conta = new TestTwo();
        conta.setSaldo(1000.0); // Altera saldo.
        System.out.println("Saldo atual: " + conta.getSaldo()); // Obter saldo.
        conta.setSaldo(-500.0); //Tentativa inválida
    }

}

/*
Getters e Setters:
 */
