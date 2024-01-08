public class poo {

    static String teste = "estou estudando orientacao a objeto em java :O";

    public String name;

    protected int salary;
    public static void main(String[] args) {
        Ser myAnimal = new Cachorro("Lady", 5, "Marisa");
        Ser myHuman = new Person("Marisa", 18, "Marques");
        myAnimal.setNome("Lady");
        System.out.println(myAnimal.saudacao());
        System.out.println(myHuman.saudacao());
        System.out.println(teste);
      
    }

    private void atualizaSalary(){
        this.salary = 4000;
    }

    public int getSalary(){
        this.atualizaSalary();
        return this.salary;
    }
    
}

