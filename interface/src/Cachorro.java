public class Cachorro implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Au, au!");
    }

    // OPCIONALMENTE POSSO SOBRESCREVER
    @Override
    public void dormir(){
        System.out.println("Cachorro dormindo enrolado...");
    }

    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        Gato g = new Gato();
        c.emitirSom(); // Au, au!
        g.emitirSom(); // Miau!

        System.out.println("-------");

        Animal a = new Cachorro();
        a.emitirSom(); // Au, au!
        a.dormir(); // CACHORRO DORMINDO ENROLADO...

    }
}
