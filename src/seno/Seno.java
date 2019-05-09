
package seno;


public class Seno {

   
    public static void main(String[] args) {
        
        System.out.println("facotrial de 0 "+factorial(0));
        for(int i=1;i<=13;i+=2){
        System.out.println("factorial de "+i+" "+factorial(i));
        }
    }
    
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
}
