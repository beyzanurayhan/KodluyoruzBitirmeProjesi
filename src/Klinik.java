import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import Hastane.Randevu;
import Personel.DisHekimi;
import Personel.Hemsire;
import Personel.Hizmetli;

public class Klinik {
	
	public static List<DisHekimi> hekimListesi = new ArrayList<DisHekimi>();
	public static List<Randevu> randevuListesi = new ArrayList<Randevu>();
	public static List<Hemsire> hemsireListesi = new ArrayList<Hemsire>();
	public static List<Hizmetli> hizmetliListesi = new ArrayList<Hizmetli>();


	public Klinik() {
		KlinikOlustur();
	}
	
	
	public void RandevuEkle(Randevu randevu) {
		randevuListesi.add(randevu);
	}
	
	public int RandevuSayisi() {
		return randevuListesi.size();
	}
	
	public Istatistik RandevuIstatikleri() {
		Istatistik rapor = new Istatistik();
		int geldi = 0;
		int gelmedi = 0;
		
		for(int i = 0 ; i < randevuListesi.size() ; i++) {
			if(randevuListesi.get(i).getRandevuGeldi() == true) {
				geldi++;
			}
			else {
				gelmedi++;
			}
			rapor.SetGelenHasta(geldi);
			rapor.SetGelmeyenHasta(gelmedi);
		}
		return rapor;
	}
	
	public void AnlikHastaSayisi() {
		Date bugun = new Date();
		int hastaSayisi = 0;
        
		for(int i = 0 ; i < randevuListesi.size(); i++) {
			Date randevuTarihi = randevuListesi.get(i).getTarih();
			long fark = randevuTarihi.getTime() - bugun.getTime();
			fark = TimeUnit.HOURS.convert(fark, TimeUnit.MILLISECONDS);

			if(fark >= -10 && fark <= 8) {
				hastaSayisi++;
			}
			System.out.println( "Hasta Sayýsý: " + hastaSayisi);
		}
	}
	
	
	public void SmsGonder() {
        Date bugun = new Date();
        
		for(int i = 0 ; i < randevuListesi.size(); i++) {
			Date randevuTarihi = randevuListesi.get(i).getTarih();
			long fark = randevuTarihi.getTime() - bugun.getTime();
			fark = TimeUnit.DAYS.convert(fark, TimeUnit.MILLISECONDS);
			
			if(fark == 2) {
				System.out.println( randevuListesi.get(i).getHasta().getHastaTel() + " Sms Gönderiliyor...");
			}
		}
	}
	
	public DisHekimi getHekim(int id) {
		for(int i = 0 ; i < hekimListesi.size(); i++) {
			if(id == hekimListesi.get(i).getpersonelNo()) {
				return hekimListesi.get(i);
			}
		}
		return null;
	}
	
	public DisHekimi getHekim(String name) {
		for(int i = 0 ; i < hekimListesi.size(); i++) {
			if(name == hekimListesi.get(i).getName()) {
				return hekimListesi.get(i);
			}
		}
		return null;
	}
	
	public List<Randevu> getRandevuListesi(){
		return this.randevuListesi;
	}
	
	private void KlinikOlustur() {
		DisHekimi hekim = new DisHekimi(1, "Cemal Süreyya", "Kýrýkkale", "05051234567", "Ahmet Can Polat", 'E', "DH199602965", "1988-09-29");
		hekimListesi.add( hekim);
		DisHekimi hekim2 = new DisHekimi(2, "Serdar Ortaç", "Istanbul", "0501365484", "Müge Anlý", 'E', "DH199007855", "1990-01-10");
		hekimListesi.add(hekim2);
		
		Hemsire hemsire = new Hemsire(100,"Ayþe YILMAZ","Kocaeli","012345678","Kamil Yýlmaz", 'K');
		hemsireListesi.add(hemsire);
		
		Hizmetli hizmetli = new Hizmetli(500,"Fatma YILMAZ","Kýrýkkale","012345678","Ahmet Yýlmaz", 'K');
		hizmetliListesi.add(hizmetli);
	}
}
