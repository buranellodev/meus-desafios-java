public interface Veiculo {
    void mover();

    default void buzinar(){
        System.out.println("Bii Bii!");
    }
}
