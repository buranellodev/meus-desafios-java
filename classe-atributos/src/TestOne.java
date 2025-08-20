public class TestOne {
    // Nome correto da classe é Pessoa.
    private String nome; // Atributo de instância;
    private int idade; // Atributo de instância;

    /* Em Java, atributos de instância, também chamados de atributos de objeto, são variáveis que pertecem a cada objeto
    individual criado a partir de uma classe. Eles definem o estado específico de cada instância da Classe, ou seja,
    cada objeto terá seus próprios valores para esses atributos, diferentemente dos atributos de classe (estáticos), que
    são compartilhados por todas as instâncias. */

    public TestOne(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar(){
        System.out.println("My name is " + nome + " and I'm  " + idade + " years.");
    }

    public static void main(String[] args) {
        TestOne p1 = new TestOne("Tiago", 25);
        TestOne p2 = new TestOne("Fernanda", 21);
        p1.apresentar();
        p2.apresentar();
    }
}

