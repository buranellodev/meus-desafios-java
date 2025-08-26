import java.util.Objects;

public class Pessoa {
    private String name;
    private int idade;

    public Pessoa(String name, int idade){
        this.name = name;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true; // MESMA REFERÊNCIA
        if (obj == null || getClass() != obj.getClass()) return false;
        Pessoa outra = (Pessoa) obj;
        return idade == outra.idade && name.equals(outra.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, idade);
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana",25);
        Pessoa p2 = new Pessoa("Ana", 25);
        System.out.println(p1.equals(p2));  //TRUE (MESMO VALORES)
        System.out.println(p1.hashCode()); // EX: 123456
        System.out.println(p2.hashCode()); // MESMO HASH QUE P1.
    }
}
