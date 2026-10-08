
package java;

import java.util.Scanner;
import java.util.Random;

public class Vjezbe {

	public static void main(String[] args) { 
			// Kreirati program koji ce kreirati novi niz, korisnik unosi duzinu niza a nakon toga poopuni niz sa random brojevima i prikazati ga

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Unesite duzinu niza:");

        int n = sc.nextInt();

        double[] noviNiz = new double[n];

        for (int i = 0; i < n; i++) {
            noviNiz[i] = r.nextInt(100);
        }

        for (int i = 0; i < n; i++) {

            if (noviNiz[i] % 2 == 0) {

                if (noviNiz[i] != -1) {
                    noviNiz[i] = 1.0 / noviNiz[i];
                }

            }
        }

        System.out.println("Niz nakon izmjene:");

        for (int i = 0; i < n; i++) {
            System.out.print(noviNiz[i] + " ");
        }

        System.out.println();
    }
}
