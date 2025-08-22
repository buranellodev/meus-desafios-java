public class TestUm {
    private String name;
    private int idade;

    public TestUm(String name, int idade){
        this.name = name;
        this.idade = idade;
    }

    void apresentar(){
        System.out.println("My name is " + name + " I Have " + idade + " years.");
    }

    public static void main(String[] args) {
        // CRIANDO OBJETO
        TestUm pessoa1 = new TestUm("Tiago", 25);
        TestUm pessoa2 = new TestUm("Adriana", 52);
        // USANDO MÉTODOS DO OBJETO.
        pessoa1.apresentar();
        pessoa2.apresentar();
    }
}

/*
- OBJETOS:
 */
