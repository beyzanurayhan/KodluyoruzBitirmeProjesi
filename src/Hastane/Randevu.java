package Hastane;

import java.util.Date;
import Personel.DisHekimi;
import tedaviKoltuklari.Koltuklar;

public class Randevu {
	
	private DisHekimi hekim;
	private Hasta hasta;
	private Date randevuTarihi;
	private float maliyet;
	private boolean randevuGeldimi;
	private Koltuklar koltuk;
	
	public Randevu(DisHekimi hekim, Hasta hasta, Date tarih) {
		this.hekim = hekim;
		this.hasta = hasta;
		this.randevuTarihi = tarih;
	}
	
	public void setRandevuGeldi(boolean durum) {
		this.randevuGeldimi = durum;
	}
	
	public boolean getRandevuGeldi() {
		return this.randevuGeldimi;
	}
	
	public void setMaliyet(float maliyet) {
		this.maliyet = maliyet;
	}
	
	public float getMaliyet() {
		return this.maliyet;
	}
	
	public DisHekimi getHekim() {
		return this.hekim;
	}
	public Hasta getHasta() {
		return this.hasta;
	}
	public Date getTarih() {
		return this.randevuTarihi;
	}
	
	public int getKoltuk() {
		return this.koltuk.getKoltukId();
	}
}
