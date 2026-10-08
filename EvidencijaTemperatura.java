
package java;

import java.util.Scanner;

public class EvidencijaTemperatura {
			
			private float [] EvidencijaTemperature;

			public EvidencijaTemperatura(float[] evidencijaTemperature) {
				EvidencijaTemperature = evidencijaTemperature;
			}
			
			private float[] getEvidencijaTemperature() {
				return EvidencijaTemperature;
			}

			private void setEvidencijaTemperature(float[] evidencijaTemperature) {
				EvidencijaTemperature = evidencijaTemperature;
			}

			public static void main(String[] args) {
			
				Scanner ulaz = new Scanner (System.in);
				int n = 5;
				
				double [] niz = new double [n];
				
				for(int i = 0; i < n; i++) {
					System.out.println("Unesite element s indeksom [ " + i + "  ]");
					niz[i] = ulaz.nextInt();
				}
				System.out.println("Duzina niza je: " + n);
				
				for(int i = 0; i < n; i++) {
					System.out.println(niz[i]);
				}	
			}
         }
		
	


