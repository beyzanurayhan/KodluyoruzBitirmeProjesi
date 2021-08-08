package Personel;

import java.util.List;
import Hastane.Randevu;
import tedaviKoltuklari.AFirmaKoltugu;

public class DisHekimi extends KlinikPersonel{
	
	private String kayitNo;	
	private String kayitTarihi;
	
	private void SetKayitNo(String kayitNo) {
		this.kayitNo = kayitNo;
	}
	
	public String GetKayitNo() {
		return this.kayitNo;
	}
	
	private void SetKayitTarihi(String tarih) {
		this.kayitTarihi = tarih;
	}
	
	public String GetKayitTarihi() {
		return this.kayitTarihi;
	}
	
	public DisHekimi(int no, String name , String adress, String tel, String akraba, char cinsiyet, String KAYITNO, String K_TARIH) {
		this.setpersonelNo(no);
		this.setName(name);
		this.setAdress(adress);
		this.setTellNo(tel);
		this.setYakinAkraba(akraba);
		this.setCinsiyet(cinsiyet);
		this.SetKayitNo(KAYITNO);
		this.SetKayitTarihi(K_TARIH);
	}
	
	public void HekimMuanesi(List<Randevu> r) {
		
		AFirmaKoltugu koltuk = new AFirmaKoltugu();
		koltuk.KanalTedavisiYap();
		
		for(int i = 0; i < r.size() ; i++) {
			if(r.get(i).getHekim().GetKayitNo() == this.GetKayitNo()) {
				RandevuDurumuGuncelle(r.get(i), true);
			}
		}
	}
	
	private void RandevuDurumuGuncelle(Randevu r, boolean durum) {
		r.setRandevuGeldi(durum);
	}
	private void RandevuMaliyetGuncelle(Randevu r, float fiyat) {
		r.setMaliyet(fiyat);
	}
}
