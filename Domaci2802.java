package domaci;

import java.util.Scanner;

public class Domaci2802 {

	public static void main(String[] args) {
		// Korisnik ucitava niz od N elemenata niza.
		//Napisati 2 metode
		//Prva metoda ispisuje elemente niza koji su deljivi sa 3
		//Druga metoda ispisuje elemente niza koji su deljivi sa 5
		//Napredno: Korisnik ucitava niz od N elemenata niza, kao i nekoi broj br. Napisati metodu koja ispisuje elemente niza deljive sa brojem br
		 int n;
		 int br;
		Scanner sc = new Scanner(System.in);
		System.out.println ("Unesi br elemenata niza " );
		n= sc.nextInt();
		int [] niz1=new int [n];
		for (int i=0;i<niz1.length;i++) {
			System.out.println ("Unesi element " + i);
			niz1[i]=sc.nextInt (); }
		
		System.out.println ("Unesi br  " );
		br= sc.nextInt();
ispisTri(niz1);
ispisPet(niz1);
ispisBr(niz1,br);
	}
		public static void ispisTri (int[] niz) {
			for (int i = 0; i < niz.length; i++) {
				if (niz[i]%3 == 0) System.out.println(niz[i]);
			
		}
		
	}
		public static void ispisPet (int[] niz) {
			for (int i = 0; i < niz.length; i++) {
				if (niz[i]%5 == 0) System.out.println(niz[i]);
		
		

}}
		public static void ispisBr (int[] niz, int br) {
			for (int i = 0; i < niz.length; i++) {
				if (niz[i]%br == 0) System.out.println(niz[i]);}
		}
		
		
}
