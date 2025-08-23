abstract class Animal {

    // ATRIBUTOS
    public String name;

    // CONSTRUTOR
    public Animal(String name){
        this.name = name;
    }

    // MÉTODO ABSTRATO (SEM CORPO)
    abstract void emitirSom();

    // MÉTODO CONCRETO (COM CORPO)
    public void vouDormir(){
        System.out.println(name + " está dormindo... ZzZz");
    }

    public static void main(String[] args) {
        // Animal a = new Animal("Bicho"); NÃO É PERMITIDO.
        Animal b = new Cachorro("Rex");
        Animal c = new Gato("Mel");

        b.emitirSom(); // REX LATINDO
        c.emitirSom(); // MEL MIANDO
        b.vouDormir(); // REX DORMINDO
    }

}

// Abstração
/*
Focar no que um objeto faz, sem se preocupar com como ele faz.
Facilita criar interfaces e classes abstratas, permitindo programar para contratos em vez de implementações especifícas.
*/