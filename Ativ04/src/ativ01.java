import java.util.Scanner;

public class ativ01
{
    public static void main(String[] args)
    {
        //Declaração de variaveis
        Scanner entrada;
        int x, y, z, prod;
       
        entrada = new Scanner(System.in);
       
        //Entrada dos numeros
        System.out.println("Informe o primeiro numero:");
        x = entrada.nextInt();
       
        System.out.println("Informe o segundo numero:");
        y = entrada.nextInt();
       
        System.out.println("Informe o terceiro numero:");
        z = entrada.nextInt();
       
        //Processamento
        prod = x * y * z;
       
        //Saida dos resultados
        System.out.println("O produto dos numeros é " + prod);

        entrada.close();
    }
}