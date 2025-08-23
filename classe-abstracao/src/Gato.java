public class Gato extends Animal{
    Gato(String name){
        super(name);
    }

    @Override
    public void emitirSom(){
        System.out.println(name + " está miando: Miauu...");
    }
}
