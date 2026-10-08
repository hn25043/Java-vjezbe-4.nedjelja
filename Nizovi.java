
package java;

public class Nizovi {
	private int[] niz;

	public Nizovi(int[] niz) {
    this.niz = niz;
	}
	public double prosjekParniPozitivni() {
		double suma = 0;
		int brojac = 0;
		for(int i = 0; i < this.niz.length; i++) {
			if(this.niz[i] > 0 && this.niz[i] % 2 == 0) {
				suma = suma + this.niz[i];
				brojac++;
				
			}
		}
		if(brojac == 0) {
			return 0;
		}
		return (double) suma / brojac;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int duzinaNiza = 10;
		int noviNiz[] = new int[duzinaNiza];
		for(int i = 0; i < duzinaNiza;i++) {
		noviNiz[i] = 2;
		
	}
		Nizovi niz2 = new Nizovi(noviNiz);

		double rez = niz2.prosjekParniPozitivni();

		System.out.println(rez);
	}
}
