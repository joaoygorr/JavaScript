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
}


    public static void main(String args[]){
        Empregado empregado1 = new Empregado("Junior", "Lacerda", 1500.500);
        Empregado empregado2 = new Empregado("Luiz", "Carvalho", 45000.000);
       
    System.out.println("Empregado 1: " + empregado1.getNome() + " " +
            empregado1.getSobrenome() +"\nsalario: "+ empregado1.getSalario());
 
    System.out.println("Empregado 1: " + empregado2.getNome() + " " +
            empregado2.getSobrenome() +"\nsalario: "+ empregado2.getSalario()); 
  
    empregado1.setSalario(empregado1.getSalario() + (empregado1.getSalario() * .10));
    empregado2.setSalario(empregado2.getSalario() + (empregado2.getSalario() * .10));
       
    System.out.println("\nCom acrécimo 10%: \n"
            + "Empregado 1: " + empregado1.getNome() + " " +
            empregado1.getSobrenome() +"\nsalario: "+ empregado1.getSalario());
 
    System.out.println("Empregado 1: " + empregado2.getNome() + " " +
            empregado2.getSobrenome() +"\nsalario: "+ empregado2.getSalario());
    }

}