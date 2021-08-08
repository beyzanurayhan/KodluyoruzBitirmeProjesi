package Personel;

public class Hemsire extends KlinikPersonel {
	
	private String ILK_YRD_KRSSAGLAYICI;	
	private String ILK_YRD_TARIH;
	
	public Hemsire(int no, String name , String adress, String tel, String akraba, char cinsiyet) {
		this.setpersonelNo(no);
		this.setName(name);
		this.setAdress(adress);
		this.setTellNo(tel);
		this.setYakinAkraba(akraba);
		this.setCinsiyet(cinsiyet);
	}
	
	
	public void IlkYardimKursunaGit(String kursSaglayici, String tarih) {
		this.ILK_YRD_KRSSAGLAYICI = kursSaglayici;
		this.ILK_YRD_TARIH = tarih;
	}
	
	
	public String getIlkYardimKursSaglayici() {
		return this.ILK_YRD_KRSSAGLAYICI;
	}
	
	public String getIlkYardimKursTarih() {
		return this.ILK_YRD_TARIH;
	}
}
