public class TestTwo {
    // CLASSE PESSOA.

    private String name;
    private int idade;

    // GETTERS (ACESSO CONTROLADO A LEITURA)
    public String getName(){
        return name;
    }
    // SETTER (ACESSO CONTRALADO A ESCRITA)
    public void setName(String name){
        this.name = name;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        if (idade >= 0){ // VALIDAÇÃO
            this.idade = idade;
        }
    }

    public static void main(String[] args) {
        TestTwo p1 = new TestTwo();
        TestTwo p2 = new TestTwo();
        p1.setName("Tiago");
        p1.setIdade(25);
        System.out.println("My name is " + p1.getName() + " I have " + p1.getIdade() + " years.");
        p2.setName("Adriana");
        p2.setIdade(52);
        System.out.println("My name is " + p2.getName() + " I have " + p2.getIdade() + " years.");
    }
}

/*
- ENCAPSULAMENTO:
 */
