package domaci;

import java.util.Scanner;

public class Domaci2602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n;
		 System.out.println("Unesite n ");
		 n= sc.nextInt();
		 System.out.println(obrni (n));}
		 public static int obrni(int n)
		 {
		  int c,inv;
		  inv=0;
		  while (n>0) {
				 c=n%10;
				 inv*=10; // pomeramo u levo
				 inv+=c;
				
				 n/=10;
		  }
					return inv;
		  }
	}


