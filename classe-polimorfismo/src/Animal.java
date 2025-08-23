public class Animal {

    public void emitirSom(){
        System.out.println("Animal fazendo som!");
    }

    public static void main(String[] args) {
        Animal a = new Cachorro(); // POLIMORFISMO DE SOBRESCRITA.
        Animal b = new Gato();
        a.emitirSom(); // CACHORRO LATINDO
        b.emitirSom(); // GATO MIANDO
    }
}
