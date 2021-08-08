package Personel;

public abstract class KlinikPersonel {
	
	protected int personelNo;	
	protected String IsimSoyisim;
	protected String Adress;
	protected char Cinsiyet;
	protected String TellNo;
	protected String YakinAkraba;
	
	public int getpersonelNo() {
	    return personelNo;
	}

	public void setpersonelNo(int no) {
	    this.personelNo = no;
	}
	
	public String getName() {
	    return IsimSoyisim;
	}

	public void setName(String name) {
	    this.IsimSoyisim = name;
	}
	
	public String getAdress() {
	    return Adress;
	}

	public void setAdress(String adress) {
	    this.Adress = adress;
	}
	
	public String getTellNo() {
	    return TellNo;
	}

	public void setTellNo(String tel) {
	    this.TellNo = tel;
	}
	
	public String getYakinAkraba() {
	    return YakinAkraba;
	}

	public void setYakinAkraba(String akraba) {
	    this.YakinAkraba = akraba;
	}
	
	public char getCinsiyet() {
		return Cinsiyet;
	}
	
	public void setCinsiyet(char cins) {
		this.Cinsiyet = cins;
	}	
}
