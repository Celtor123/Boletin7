
package boletin71;


public class Temperatura {
    double celsius,farenheit;
    public double celsiusAFarenheit(double tem){
       celsius= tem;
       farenheit=1.8*celsius+32;
       return farenheit;
    }
    public double farenheitACelsius(double tem){
        farenheit=tem;
        celsius=(farenheit-32)/1.8;
        return celsius;
    }

  
    public static void main(String[] args) {
        Temperatura a= new Temperatura();
        System.out.println(a.celsiusAFarenheit(50));
        System.out.println(a.farenheitACelsius(100));
    }
    
}

//1- Realiza unha clase Temperatura, que convirta graos Celsius en Fahrenheit e viceversa . Para eso crea dous métodos :
//                double celsiusAFarenheit ( double tem) -> convirte º celsius a Fahrenheit
//                double farenheitACelsius ( double tem)
//    Na implementación ten en conta as seguintes fórmulas :
//            C = ( F – 32 ) / 1.8 
//            F = 1.8 * C + 32 
//    Unha vez rematada a clase     PROBA O PROGRAMA no método main( )
