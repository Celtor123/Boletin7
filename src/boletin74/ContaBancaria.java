
package boletin74;


public class ContaBancaria {
     String numconta,titular;
    float saldo;
   
    ContaBancaria(){
       
    }
    ContaBancaria(String numconta,String titular,float saldo){
         ContaBancaria conta= new ContaBancaria();
       this.numconta=numconta;
       this.titular=titular;
       this.saldo=saldo;
       
    }

 

    public String getNumconta() {
        return numconta;
    }

    public void setNumconta(String numconta) {
        this.numconta = numconta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void ingresar(float cantidade){
        saldo=saldo+cantidade;
    }
    public void retirar(float cantidade){
        if(saldo>=cantidade){
        saldo=saldo-cantidade;
        }
        else{
            System.out.println("saldo insuficiente");
        }
    }
    public void arruinar(ContaBancaria conta){
        conta=null;
         saldo=0;
         
    }
   
    
    
    
    
}

//4- Codifica un programa para xestionar unha conta bancaria . Para eso crea unha clase chamada ContaBancaria con 
//              atributos :
//     Un de tipo String  numConta 
//                       String titular
//                       Float saldo
//   métodos :
//constructores : un que non reciba ningún valor ( constructor por defecto )
//                              outro que reciba os 3 valores e, inicialize con estos valores os atributos   
//de acceso ( geters e seters )
//un método ingresar que recibe unha cantidade e, incremente o saldo nesta cantidade . Non devolverá ningún valor.
//Un método chamado retirar que non devolve nada e reciba unha cantidade a retirar . Se esta cantidade é menor que o saldo enton o retirará. 
//Pero se é menor visualizaremos unha mensaxe  se “ saldo insuficiente “
//Un método arruinar que non devolve nada e, recibe como parámetro un obxecto de tipo ContaBancaria  . Este método pon o saldo a 0 e o obxecto a null
// Implementa unha clase Aplicación que simule o reintegro e retirada de cartos da nosa conta . O final chama o método arruinar e comproba que na túa conta non quedan cartos .       