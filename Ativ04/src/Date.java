public class Date {

    private int dia;  

    private int mes;  

    private int ano;  

    public Date(int d, int m, int a)  
    {  
        this.dia=d;
        this.mes=m;
        this.ano=a;
    }  
    public void setDia(int d)  
    {  
        this.dia = d;  
    }  
    public int getDia()  
    {  
        return this.dia;  
    }  
    public void setMes(int m)  
    {  
        this.mes = m;  
    }  
    public int getMes()  
    {  
        return this.mes;  
    }  
    public void setAno(int a)  
    {  
        this.ano = a;  
    }  
    public int getAno()  
    {  
        return this.ano;  
    }  
    public String displayDate()  
    {  
       // Alterado para retornar uma String formatada em vez de printar.
       return String.format("%d/%d/%d", this.dia, this.mes, this.ano);  
    }  
}

public class DateTest {
    public static void main( String[] args ) {
        int dia = 0;
        int mes = 0;
        int ano = 0;
        Scanner s = new Scanner( System.in );
        System.out.println( "Digite o dia: " );        
        dia = s.nextInt();
        System.out.println( "Digite o mês: " );
        mes = s.nextInt();
        System.out.println( "Digite o ano: " );
        ano = s.nextInt();

        Date d = new Date(dia,mes,ano);
        System.out.println( "A data é: " + d.displayDate() );
    }

}