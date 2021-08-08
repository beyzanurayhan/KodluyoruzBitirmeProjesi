package tedaviKoltuklari;

public class AFirmaKoltugu extends Koltuklar implements IKanalTedavi , IMuzik {
	
	private final String URETICI = "A firmasi aninomi sirketi";
	private final String URETIM_NO = "A011995654";
	
	public AFirmaKoltugu() {
		this.KoltukId = 1;
	}
	
	public String GetUretici() {
		return this.URETICI;
	}
	public String GetUretimNo() {
		return this.URETIM_NO;
	}

	@Override
	public void KanalTedavisiYap() {
		 TedaviDurumu = true;
	}

	@Override
	public void MuzikDinle() {
		System.out.println("Müzik Çalýyor.....");
		
	}

	@Override
	public Boolean KoltuktaMusait() {
		return TedaviDurumu;
	}
}
