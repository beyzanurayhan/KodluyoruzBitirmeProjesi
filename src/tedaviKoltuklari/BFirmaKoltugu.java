package tedaviKoltuklari;

public class BFirmaKoltugu extends Koltuklar implements IKanalTedavi , IMuzik{

	private final String URETICI = "B firmasi aninomi sirketi";
	private final String URETIM_NO = "BB20201201";
	
	public BFirmaKoltugu() {
		this.KoltukId = 2;
	}
	
	@Override
	public String GetUretici() {
		return URETICI;
	}
	@Override
	public String GetUretimNo() {
		return URETIM_NO;
	}
	@Override
	public Boolean KoltuktaMusait() {
		return TedaviDurumu;
	}
	@Override
	public void KanalTedavisiYap() {
		 TedaviDurumu = true;	
	}
	@Override
	public void MuzikDinle() {
		System.out.println("Müzik Çalýyor.....");
	}
}
