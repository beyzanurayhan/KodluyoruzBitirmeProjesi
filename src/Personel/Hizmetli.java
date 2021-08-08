package Personel;

public class Hizmetli extends KlinikPersonel {
	
	public Hizmetli(int no, String name , String adress, String tel, String akraba, char cinsiyet) {
		this.setpersonelNo(no);
		this.setName(name);
		this.setAdress(adress);
		this.setTellNo(tel);
		this.setYakinAkraba(akraba);
		this.setCinsiyet(cinsiyet);
	}
}
