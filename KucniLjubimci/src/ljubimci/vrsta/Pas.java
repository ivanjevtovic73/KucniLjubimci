package ljubimci.vrsta;

import ljubimci.KucniLjubimac;

public class Pas extends KucniLjubimac {

	public Pas(String naziv, Boolean dlake, String rasa, String pedigre) {
		super(naziv, dlake);
	
	}

	@Override
	public String getNaziv() {
		// TODO Auto-generated method stub
		return super.getNaziv();
	}

	@Override
	public void setNaziv(String naziv) {
		// TODO Auto-generated method stub
		super.setNaziv(naziv);
	}

	@Override
	public Boolean getDlake() {
		// TODO Auto-generated method stub
		return super.getDlake();
	}

	@Override
	public void setDlake(Boolean dlake) {
		// TODO Auto-generated method stub
		super.setDlake(dlake);
	}

	@Override
	public String tipZabave() {
		// TODO Auto-generated method stub
		return super.tipZabave();
	}

	@Override
	public Integer vremeZaZabavu() {
		// TODO Auto-generated method stub
		return super.vremeZaZabavu();
	}
	

}
