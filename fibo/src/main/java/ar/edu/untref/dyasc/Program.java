package ar.edu.untref.dyasc;

public class Program {

    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Debe especificarse la cantidad de números de la sucesión.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        SucesionDeFibonacci sucesionDeFibonacci = new SucesionDeFibonacci();
        int[] primerosN = sucesionDeFibonacci.ObtenerPrimerosN(n);

        String stringFinal = "fibo<" + n + ">:";
        for (int i = 0; i < primerosN.length; i++) {
            stringFinal += " " + primerosN[i];
        }

        System.out.println(stringFinal);

    
    }
}
