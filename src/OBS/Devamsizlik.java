package OBS;

public class Devamsizlik {

	private int toplamDersSaati;
	private int yapilanDevamsizlik;
	
	//constructor
	public Devamsizlik(int toplamDersSaati, int yapilanDevamsizlik) {
		super();
		this.toplamDersSaati = toplamDersSaati;
		this.yapilanDevamsizlik = yapilanDevamsizlik;
	}


	public int getToplamDersSaati() {
		return toplamDersSaati;
	}


	public int getYapilanDevamsizlik() {
		return yapilanDevamsizlik;
	}
	
	
	//setterlara sadece hoca ve sekreter erişebilmeli
	
	public double devamsizlikYuzdesiHesapla() {   //sayısal değer yapma, arrayliste dön!!!
		if (toplamDersSaati == 0) { //ders saati 0 ise error vermesin
			return 0.0;
			
			}
		double yuzde = (yapilanDevamsizlik / toplamDersSaati * 100);
		return yuzde;
	}
	
	public void devamsizlikEkle(int saat) { //uml de yok, hocanın işini kolaylaştırmak için babam önerdi
		this.yapilanDevamsizlik = this.yapilanDevamsizlik + saat ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
