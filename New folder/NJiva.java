package vezbanjemarija;

public class NJiva extends Parcela{
	public double prinosPoKM;

	public NJiva(double povrsina, double prinosPoKM) {
		super(povrsina, 'N');
		this.prinosPoKM = prinosPoKM;
		this.id+=uid;
		
	}
	@Override
	public double prinos(int godine) {
		return this.getPovrsina()*this.getPrinosPoKM();
	}
	public double getPrinosPoKM() {
		return prinosPoKM;
	}
	public void setPrinosPoKM(double prinosPoKM) {
		this.prinosPoKM = prinosPoKM;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder(super.toString());
	    sb.append(":").append(this.getPrinosPoKM());
	    return sb.toString();
	
	
	
}
