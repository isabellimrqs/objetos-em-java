public class Person extends Ser{

    String sobrenome;
    
    public Person(String nome, int idade, String sobrenome){
        super(nome,idade);
        this.sobrenome = sobrenome;
    }
    void criaPoo(){
        poo myPoo = new poo();
        System.out.println(myPoo.name);
        System.out.println(myPoo.salary);
        this.idade = 18;
       
    } 

    @Override
    public String saudacao(){
        return "oi " + this.nome;
    }
}
