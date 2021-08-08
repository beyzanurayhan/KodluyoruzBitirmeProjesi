import java.text.ParseException;
import java.util.*;
import Hastane.Hasta;
import Hastane.Randevu;
import Hastane.TimeFormat;

public class Main {
	
	private static Klinik k = new Klinik();
	
	public static void main(String[] args)  throws ParseException {
		TestRandevulari();	
	}
	
	public static void MesaiBitimi() {
		k.SmsGonder();
	}
	
	public static void HaftaBitimi() {
		Istatistik rapor = k.RandevuIstatikleri();
	}
	
	public static void TestRandevulari() throws ParseException {
		String randevuTarihi = "2020-12-4 17:50:00";
		Date date = TimeFormat.LongTimeFormat().parse(randevuTarihi);
		Hasta hasta = new Hasta("Ömer sönmez", "akçabat" , "054545545");
		Randevu randevu = new Randevu(k.getHekim(1), hasta ,  date);
		k.RandevuEkle(randevu);
		
		String baskarandevu = "2020-12-6 09:40:00";
		Date date1 = TimeFormat.LongTimeFormat().parse(baskarandevu);
		Hasta hasta1 = new Hasta("Ahmet Iþýk", "yeni köy" , "0544445655");
		Randevu randevu1 = new Randevu(k.getHekim(2), hasta1 ,  date1);
		k.RandevuEkle(randevu1);
	}
}
