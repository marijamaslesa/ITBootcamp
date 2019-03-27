package vezbanjemarija;

public class Glavni {

	public static void main(String[] args) {
		
 Suma s1=new Suma (55,44,888,66);
 NJiva n1=new NJiva(1515,554);
 
 Parcela[] parcele = {s1,n1};

 for(int i =0;i<parcele.length; i++){

     System.out.println(parcele[i].prinos(3));
 }
	}

}
