package tedaviKoltuklari;

public class CFirmaKoltugu extends Koltuklar implements IDisTadavisi {
	private final String URETICI = "C firmasi aninomi sirketi";
	private final String URETIM_NO = "C2019000012";
	
	public CFirmaKoltugu() {
		this.KoltukId = 3;
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
	public void DisTasiTemizle() {
		TedaviDurumu = true;
	}
	@Override
	public void DolguYap() {
		TedaviDurumu = true;
	}
	@Override
	public void DisCekimiYap() {
		TedaviDurumu = true;
	}
}
