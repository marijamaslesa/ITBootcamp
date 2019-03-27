package vezbanjemarija;

public abstract class Parcela {

public static int uid=0;

 protected int id;
 protected double povrsina;
 protected char vrsta;
  
  
  
  
  
public Parcela( double povrsina, char vrsta) {
	super();
	this.id += uid;
	this.povrsina = povrsina;
	this.vrsta=vrsta;
}
public Parcela() {
	super();
	this.id += uid;
	this.povrsina = 0;
}

public abstract double prinos(int brGodina);


@Override
public String toString() {
	return getVrsta() + " - "+ getId() + "[" + getPovrsina() +  "]";
}
public int getId() {
	return id;
}
public double getPovrsina() {
	return povrsina;
}
public char getVrsta() {
	return vrsta;
}
  
  
  
  



}
