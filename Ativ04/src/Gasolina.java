import java.util.Scanner;

public class Gasolina {
    Scanner entrada;
    int quilometros, gasolina; 
    double prod;

    public Gasolina(int quilometros, int gasolina) {
        this.quilometros = quilometros;
        this.quilometros = quilometros;
        this.entrada = new Scanner(System.in); 
        prod = quilometros / gasolina;
    }

    public static void main(String[] args) {
        int gasolinaSomada = 0;
        int km = 0;
        int x = 0;
        // Declaração de variáveis
        Gasolina gas = new Gasolina(1,1);
        
        while(x <= 5) {
            System.out.println("Informe o Km dirigido: ");
            gas.quilometros = gas.entrada.nextInt();
    
            System.out.println("Informe litro de gasolina consumido: ");
            gas.gasolina = gas.entrada.nextInt();
    
            System.out.println("O consumo em Km/L é de: " + gas.prod);

            km = km + gas.quilometros;
            
            gasolinaSomada = gasolinaSomada + gas.gasolina;
            
            x++;
        }
        System.out.println("Quilometragem percorrida: " + km);
        System.out.println("O Soma total de combustível: " + gasolinaSomada);
        gas.entrada.close();
    }
}
