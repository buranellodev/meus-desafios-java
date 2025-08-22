public class TestUm {
    private double saldo;

    public double getSaldo() { return saldo; }

    public void depositar (double valor){
        if(valor > 0){
            saldo += valor;
        }
    }
}

//Encapsulamento:

/*
Esconder os detalhes internos de uma classe e expor apenas o que é necessário.
Garante segurança e evita que outras partes do código mexam diretamente nos atributos.
Como se faz em java: usando private para atributos e public em getters e setters.
*/
