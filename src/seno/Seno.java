package seno;

public class Seno {

    public static void main(String[] args) {

//        System.out.println("facotrial de 0 " + factorial(0));
//        for (int i = 1; i <= 13; i += 2) {
//            System.out.println("factorial de " + i + " " + factorial(i));
//        }
//        System.out.println(numeroImpares(2));
//
//        System.out.println("El calculo del exponente es " + calculaExponente(2, 3));
//
//        imprimeImpares(13);

        calculaSeno();

    }


    public static int numeroImpares(int n) {
        int operacion = 1;
        for (int i = 1; i <= n; i++) {
            operacion = 2 * i - 1;
        }
        return operacion;
    }

    public static int calculaExponente(int base, int exponente) {
        int resultado = 0;
        resultado = (int) Math.pow(base, exponente);
        return resultado;
    }

    public static void imprimeImpares(int a) {
        int i;
        for (i = 1; i <= a; i += 2) {
            System.out.println(i);
        }
    }
    
    /** 
     * @param con variable que cuenta
     * @param n variable que referencia 
     * @return resultado del factorial
    */
    
     private static double factorial(int con, int n){
        if(con > n)
            return 1;
        return con *= factorial(con +=1, n);
    }

    public static void calculaSeno() {
        int x = 0;
        boolean signo = true;
        double expo,fact,result,valor=0;
        for (int i = 1; i <= 13; i += 2) {
            expo = Math.pow(x,i);
            fact=factorial(1,i);
            result=expo/fact;
            if(signo){
                valor += result;
                signo = false;
            }else{
                valor -=result;
                signo = true;
            }
        }
        System.out.println("f(" + x + ") = " + valor);
//        boolean positivo = true;
//        double d,f,b,valor = 0;
//        for(int i = 1; i<=13; i+=2) {
//            d = Math.pow(x, i);
//            f = factorial(1, i);
//            b = d/f;
//            if (positivo) {
//                valor += b;
//                positivo = false;
//            } else{
//                valor -= b;
//                positivo = true;
//            }
//        }
//        System.out.println("El resultado de "+ x+" es = " + valor);
//    }
}
}
