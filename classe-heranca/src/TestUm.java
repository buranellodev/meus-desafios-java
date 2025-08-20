public class TestUm {
    // Nome correto da classe é Animal.
    void comer(){
        System.out.println("Comendo...");
    }
}

class Cachorro extends TestUm {
    void latir(){
        System.out.println("Au, au");
    }
}

//Herança:

/*
Permite que uma classe "filha" reutilize atributos e métodos de uma classe "pai".
Evita duplicações de código e cria hierarquias de classes.
 */