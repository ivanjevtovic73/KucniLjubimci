package ljubimci;

public class KucniLjubimac implements BrigaOLjubimcu {

	String naziv;
	Boolean dlake;
		
	
	public KucniLjubimac(String naziv, Boolean dlake) {
		super();
		this.naziv = naziv;
		this.dlake = dlake;
	}
	
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Boolean getDlake() {
		return dlake;
	}
	public void setDlake(Boolean dlake) {
		this.dlake = dlake;
	}


	@Override
	public String tipZabave() {
		return null;
	}


	@Override
	public Integer vremeZaZabavu() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
