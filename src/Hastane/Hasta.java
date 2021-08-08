package Hastane;

public class Hasta {
	private int hastaID;
	private String hastaName;
	private String hastaAdres;
	private String hastaTel;
	private static int HASTANO = 1000000;

	public Hasta(String name, String adres, String telNo) {
		this.hastaName = name;
		this.hastaAdres = adres;
		this.hastaTel = telNo;
		HastaIdOlustur();
	}	
	public String getHastaName() {
		return this.hastaName;
	}
	public String getHastaAdres() {
		return this.hastaAdres;
	}
	public String getHastaTel() {
		return this.hastaTel;
	}
	public int getHastaID() {
		return this.hastaID;
	}	
	private void HastaIdOlustur() {
		this.hastaID = HASTANO;
		HASTANO++;
	}
}
