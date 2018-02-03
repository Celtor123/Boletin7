
package boletin73;

public class Rebaixas {
    public float calculaPorcentaxe(int prezo,int rebaixado){
       float rebaixa= (prezo-rebaixado);
       float porcentaxe= (rebaixa/prezo)*100;
       return porcentaxe;
    }
    
    
    
    public static void main(String[] args) {
        Rebaixas jdk=new Rebaixas();
        System.out.println("A rebaixa é do "+jdk.calculaPorcentaxe(2431,1624)+"%");
    }
    
}

//3- Crea unha clase Rebaixas cun método calculaPorcentaxe . 
//Este método recibirá o prezo original e o rebaixado do producto . 
//calculará a porcentaxe e, retornará éste valor 