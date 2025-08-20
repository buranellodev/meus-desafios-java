public class TestUm {
    // Nome da classe Pessoa.

    private String name;
    private int age;

    // Construtor COM parametros.
    public TestUm(String name, int age){
        this.name = name;
        this.age = age;
    };

    // Construtor SEM parametros.
    public TestUm(){
        this.name = "Desconhecido";
        this.age = 0;
    }

    public void apresentar(){
        System.out.println("My name is " + name + " I have " + age + " years.");
    }

    public static void main(String[] args) {
        TestUm p1 = new TestUm(); // usa construtor sem parametro;
        TestUm p2 = new TestUm("Tiago", 25); // usa construtor com parametro;
        p1.apresentar();
        p2.apresentar();
    }
}
