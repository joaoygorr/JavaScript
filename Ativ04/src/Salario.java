import java.util.Scanner;

public class Salario
{

Scanner entrada = new Scanner(System.in);

private String nomeFunc1;
private double horaTrab = 0;
private double salHora = 0;

public Salario(String nome1, String nome2, String nome3, double horat, double salh)
{
nomeFunc1 = nome1;
horaTrab = horat;
salHora = salh;
}

public void setNomeFunc1(String nome1)
{
nomeFunc1 = nome1;
}

public String getNomeFunc1()
{
return nomeFunc1;
}

public void setHoraTrab(double horat)
{
horaTrab = horat;
}

public double getHoraTrab()
{

  return horaTrab;
}

public void setSalHora(double salh)
{
salHora = salh;
}

public double getSalHora()
{
return salHora;
}

public double getTotal()
{
double total = 0;

  if(horaTrab > 40)

     salHora = salHora * 1.50;
 
 total = horaTrab * salHora;

 return total;
}

public void getDemonstrativo()
{

 System.out.printf("Digite o nome do funcionário: ",nomeFunc1);
 nomeFunc1 = entrada.nextLine();

 System.out.printf("Digite as horas trabalhadas do funcionario: \n",horaTrab);
 horaTrab = entrada.nextDouble();

 System.out.printf("Digite o salário hora do funcionário: \n",salHora);
 salHora = entrada.nextDouble();

 System.out.printf("Total a receber: R$ %.2f\n\n", getTotal());

 while(horaTrab != -1)
 {
 
 System.out.printf("Digite o nome de outro funcionário: ");
 nomeFunc1 = entrada.nextLine();

 System.out.printf("\nDigite as horas trabalhadas do funcionario: \n",horaTrab);
 horaTrab = entrada.nextDouble();

 System.out.printf("Digite o salário hora do funcionário: \n",salHora);
 salHora = entrada.nextDouble();

 System.out.printf("Total a receber: R$ %.2f\n\n", getTotal());
 //double total = entrada.nextDouble();

 }
}

}

class SalarioTeste
{
    
    public static void main(String args [])
    {
       Scanner entrada = new Scanner(System.in);
         String x = "S";
         while (x.equals("S")) {
         Salario func1 = new Salario("","","",0.0,0.0);
         func1.getDemonstrativo();
         System.out.println("Mais um funcionário?(S/N)");  
         x = entrada.nextLine();
         entrada.close();
       
    }
}
}