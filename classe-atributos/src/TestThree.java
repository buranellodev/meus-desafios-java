public class TestThree {
    // Nome correto da classe Conta

    public String titular; // Qualquer classe pode acessar
    private double saldo; // protegido contra acesso direto

    // Getters e Setters são criados para acessar o Saldo.
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double valor){
        if (valor > 0){
            this.saldo = valor;
        }
    }

    public static void main(String[] args) {
        TestThree conta = new TestThree();
        conta.setSaldo(100.0);
        System.out.println("Saldo da conta: " + conta.getSaldo());
    } // Inicialização para testar.
}

/*
- Modificadores de acessos:
 */