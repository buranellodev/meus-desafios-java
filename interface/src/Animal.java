public interface Animal {

    public void emitirSom(); // CONTRATO
                            // MÉTODO ABSTRATO.

    default void dormir(){
        System.out.println("Zzzzz... Dormindo");
    }

}
