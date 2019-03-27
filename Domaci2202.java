import java.util.Scanner;

public class Domaci2302 {

	public static void main(String[] args) {
		// Ako se unese broj 10  i k =3 fibonacijev niz brojeva je 1 1 2 3 5 8 13 21 34 55 ispis treba da bude 3 21.
		Scanner sc = new Scanner(System.in);
        int n,k,a,b,c,i;
        a=1;
        b=1;
        c=1;
        System.out.println("Unesite n");
       n = sc.nextInt();
       System.out.println("Unesite k");
       k = sc.nextInt();
       
       for (i=0;i<=n;i++) {
    	   a = b;
           b = c;
           c = a + b;
           if (a % k == 0)

               System.out.println(a);
       }
       
	}

}
