class Cachorro extends Animal{

    Cachorro(String name){
        super(name);
    }

    @Override
    void emitirSom(){
        System.out.println(name + " está latindo: Au, au...");
    }

}
