package vezbanjemarija;

public class Suma extends Parcela {
	
	
	
	public double povrsStabla;
	public double prinosPoStablu;
	public int periodSazrevanja;
	
	public Suma( double povrsina, double povrsStabla, double prinosPoStablu, int periodSazrevanja) {
		super( povrsina, 'S');
		this.povrsStabla = povrsStabla;
		this.prinosPoStablu = prinosPoStablu;
		this.periodSazrevanja = periodSazrevanja;
		
		this.id+=uid;
		
	}

	public double getPovrsStabla() {
		return povrsStabla;
	}

	public double getPrinosPoStablu() {
		return prinosPoStablu;
	}

	public int getPeriodSazrevanja() {
		return periodSazrevanja;
	}
	
	
	@Override
	public double prinos(int godine) {
		return this.getPovrsina()/this.getPovrsStabla()*this.getPrinosPoStablu()*(godine/this.getPeriodSazrevanja());
	};
	
@Override
public String toString() {
    StringBuilder sb = new StringBuilder(super.toString());
    sb.append(":(").append(this.getPovrsStabla()).append(",").append(this.getPrinosPoStablu()).append(",").append(this.getPeriodSazrevanja()).append(")");
    return sb.toString();
}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}