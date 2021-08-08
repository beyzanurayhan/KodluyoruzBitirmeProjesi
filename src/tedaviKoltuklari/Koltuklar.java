package tedaviKoltuklari;

public abstract class Koltuklar {
	
	protected int KoltukId;
	
	protected Boolean TedaviDurumu = false;
	
	public void GenelMuaneYap() {
		TedaviDurumu = true;
	}
	
	public void TedaviBitir() {
		TedaviDurumu = false;
	}
	
	public abstract String GetUretici();
	
	public abstract String GetUretimNo();
	
	public abstract Boolean KoltuktaMusait();

	public int getKoltukId() {
		return this.KoltukId;
	}
}
