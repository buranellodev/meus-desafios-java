public class TestTwo {
    // Classe Pessoa
    private String name;
    private int idade;

    // Construtor diferenciando atributos de parametros.
    public TestTwo(String name, int idade){
        this.name = name; // this.name é o atributo.
        this.idade = idade; // idade é o parametro.
    }

    public void apresentar(){
        System.out.println("My name is " + this.name + "I have" + this.idade + "years.");
    }

    // Construtor chamadno outro construtor.
    public TestTwo(){
        this("Desconhecido", 0); // Chama o construtor acima.
    }

    public static void main(String[] args) {
        TestTwo p1 = new TestTwo("Tiago", 25);
        TestTwo p2 = new TestTwo();
        p1.apresentar();
        p2.apresentar();
    }
}

/*
- Palavra this:
 */