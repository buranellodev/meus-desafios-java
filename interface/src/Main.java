import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 25));
        pessoas.add(new Pessoa("João", 30));
        pessoas.add(new Pessoa("Carlos", 20));

        Collections.sort(pessoas); // USA COMPARETO()
        System.out.println(pessoas);
    }
}