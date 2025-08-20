public class TesteUm {
    // Nome correto da classe é Animal, usado Teste apenas para separar.
    void emitirSom(){
        System.out.println("Som genérico");
    }
}

class Gato extends TesteUm{
    @Override
    void emitirSom(){
        System.out.println("Miau");
    }
}

class Teste {
    public static void main(String[] args) {
        TesteUm a = new Gato();
        a.emitirSom();
    }
}

//Boa prática para testar?
// Criar uma classe "TESTE" e iniciar sintaxe básica de uma aplicação Java (PSVM).

// Polimorfismo:
/*
Uma classe ou método pode ter várias formas;
Permite que use objetos de diferentes tipos de forma uniforme;
Sobrecarga de métodos (mesmo método, diferentes parâmetros) ou sobrescita de métodos (@OVERRIDE).
*/