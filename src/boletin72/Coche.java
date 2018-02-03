
package boletin72;


public class Coche {
    private int velocidade;
    Coche(){
        velocidade=0;
    }
    public int getvelocidade(){
        return velocidade;
    }
    public void acelerar(int cantidade){
        velocidade=velocidade+cantidade;
    }
    public void frenar(int menos){
        velocidade=velocidade-menos;
    }
    
    
    
    
    public static void main(String[] args) {
        Coche asd=new Coche();
        asd.acelerar(3);
        System.out.println(asd.getvelocidade());
        asd.frenar(2);
        System.out.println(asd.getvelocidade());
        
    }
    
}

//2- Temos a seguinte clase Coche
//Class Coche {
//     Private int velocidade ;
//     Coche ( ) {
//         Velocidade = 0; 
//   }
// Engade a clase coche os seguintes métodos :
//
//int getVelocidade ( ) .Este método devolve a velocidade actual
//void acelerar(int cantidade) . aumenta a velocidade en cantidade kilómetros
//void frena ( int menos ). Diminue a velocidade en menos kilómetros
//
//Fai unha proba do programa
 