public class Funcionario{

    private String nome, sobrenome;
    private double salario;
   
    Funcionario(String nome, String sobrenome, double salario){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.salario=salario;
    }
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
   
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if(salario>0){
        this.salario = salario;}
        else{System.out.println("Salário negativo, não configurado!");}
    }



    public static void main(String args[]){
        Funcionario funcionario1 = new Funcionario("Junior", "Lacerda", 1500.500);
        Funcionario funcionario2 = new Funcionario("Luiz", "Carvalho", 45000.000);
       
    System.out.println("Empregado 1: " + funcionario1.getNome() + " " +
            funcionario1.getSobrenome() +"\nsalario: "+ funcionario1.getSalario());
 
    System.out.println("Empregado 1: " + funcionario2.getNome() + " " +
            funcionario2.getSobrenome() +"\nsalario: "+ funcionario2.getSalario()); 
  
    funcionario1.setSalario(funcionario1.getSalario() + (funcionario1.getSalario() * .10));
    funcionario2.setSalario(funcionario2.getSalario() + (funcionario2.getSalario() * .10));
       
    System.out.println("\nCom acrécimo 10%: \n"
            + "Empregado 1: " + funcionario1.getNome() + " " +
            funcionario1.getSobrenome() +"\nsalario: "+ funcionario1.getSalario());
 
    System.out.println("Empregado 1: " + funcionario2.getNome() + " " +
            funcionario2.getSobrenome() +"\nsalario: "+ funcionario2.getSalario());
    }

}