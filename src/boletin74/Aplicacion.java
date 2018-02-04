
package boletin74;


public class Aplicacion {
    public static void main(String[] args) {
     ContaBancaria conta= new ContaBancaria();
      conta.getClass();
      conta.setTitular("Benvido usuario "+"Celtor123");
     System.out.println(conta.getTitular());
      conta.setNumconta("2t35c7q09@457i5g7h90");
     System.out.println("O seu número de conta é: "+conta.getNumconta());
      conta.setSaldo(1205);
      System.out.println("na súa conta posee: "+conta.getSaldo());
      conta.ingresar(123);
     System.out.println("na súa conta posee: "+conta.getSaldo());
      conta.retirar(251);
      System.out.println("na súa conta posee: "+conta.getSaldo());
      conta.arruinar(conta);
      System.out.println("na súa conta posee: "+conta.getSaldo());
    }
    
}
