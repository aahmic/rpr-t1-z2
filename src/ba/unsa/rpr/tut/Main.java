package ba.unsa.rpr.tut;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Unesite n");
        int n = unos.nextInt();

        for( int i = 1; i <= n; i++ )
        {
            if(i%sumaCifara(i) == 0) System.out.println(i);
        }
    }

    static int sumaCifara(int broj) {
        int suma = 0;
        while( broj > .5f ) {
            suma += broj%10;
            broj/=10;
        }
        return suma;
    }
}
