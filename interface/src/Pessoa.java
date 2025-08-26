public class Pessoa implements Comparable<Pessoa>{
    private String name;
    private int idade;

    public Pessoa(String name, int idade){
        this.name = name;
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa outra){
        // COMPARANDO POR IDADE
        return Integer.compare(this.idade, outra.idade);
    }

    @Override
    public String toString(){
        return name + " - " + idade;
    }

}
