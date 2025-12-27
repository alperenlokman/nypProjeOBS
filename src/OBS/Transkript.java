package OBS;

import java.util.ArrayList;

public class Transkript {

	private Ogrenci ogrencibilgileri;
	private ArrayList<DonemRaporu> donemRaporlari;
	private double genelAGNO;
	
	//constructor
	public Transkript(Ogrenci ogrencibilgileri, ArrayList<DonemRaporu> donemRaporlari, double genelAGNO) {
		super();
		this.ogrencibilgileri = ogrencibilgileri;
		this.donemRaporlari = donemRaporlari;
		this.genelAGNO = genelAGNO;
	}
	
	public boolean azamiSureDolduMu() {
		int toplamDonemSayisi; //anlaşılması kolay olsun diye ekledim
		boolean sureDoldu;
		
		toplamDonemSayisi = this.donemRaporlari.size();
		
		if(toplamDonemSayisi > 14) { //bir öğr, aynı ogrenciNo ile max 14 dönem okuyabilir!
			sureDoldu = true;
		}else {
			sureDoldu = false;
		}
		return sureDoldu;
	}
	
	//agno hesaplamayı yerleştir buraya
	
	//getter setter ekle, setter sadece sekreterde olsun!
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
