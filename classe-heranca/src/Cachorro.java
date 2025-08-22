public class Cachorro extends Animal{

    // SUB-CLASSE.

    public void latir(){
        System.out.println(name + " Está latindo! Au au");
    }

    @Override // SOBREPOSIÇÃO
    public void fazerSom(){
        System.out.println("Cachorro está latindo! Au au");
    }

    public void abanarRabo(){
        System.out.println("Cachorro abanando o rabo.");
    }

    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.name = "Rex";
        c.comer(); // Herdado da classe Animal
        c.latir(); // Próprio da classe Cachorro

        Cachorro but = new Cachorro();
        // UPCASTING (CACHORRO > ANIMAL)
        Animal a = new Cachorro(); // UPCASTING IMPLÍCITO
        a.fazerSom(); // CACHORRO LATINDO (POLIMORFISMO)
        // a.abanarRabo(); // ERRO: MÉTODO NÃO EXISTE EM ANIMAL

        // DOWNCASTING (ANIMAL > CACHORRO)
        Cachorro dog = (Cachorro) a;
        dog.abanarRabo(); // AGORA FUNCIONA.

        // RESULTADO DA SOBREPOSIÇÃO
        Animal b1 = new Cachorro();
        Animal b2 = new Gato();
        b1.fazerSom(); // CACHORRO LATINDO
        b2.fazerSom(); // GATO MIANDO.
    }


}


