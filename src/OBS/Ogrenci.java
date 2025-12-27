package OBS;

import java.util.List;
import java.util.ArrayList;


public class Ogrenci extends Kullanici { //inheritance



	private String ogrenciNo;
	private String bolum;
	private ArrayList<OgrenciDersKaydi> alinanDersKayitlari;
	private Mufredat mufredat;
	
	//constructor yanlıştır, refactor araştır
	public Ogrenci(String kullaniciID, String ad, String soyad, String telefon, String adres, String kullaniciAdi,
			String sifre, String ogrenciNo, String bolum, ArrayList<OgrenciDersKaydi> alinanDersKayitlari,
			Mufredat mufredat) {
		super(kullaniciID, ad, soyad, telefon, adres, kullaniciAdi, sifre);
		this.ogrenciNo = ogrenciNo;
		this.bolum = bolum;
		this.alinanDersKayitlari = alinanDersKayitlari; //yine aynı sorun, anlamadım ben bu işi
		this.mufredat = mufredat;
	}


	public String getOgrenciNo() {
		return ogrenciNo;
	}


	public String getBolum() {
		return bolum;
	}


	public List<OgrenciDersKaydi> getAlinanDersKayitlari() {
		return alinanDersKayitlari;
	}


	public Mufredat getMufredat() {
		return mufredat;
	}
	
	private boolean yetkiKontrolu(Kullanici islemYapan) { //kim kullanıyor? ona göre setterlara izin vereceğiz
		boolean sonuc = false;
		if (islemYapan instanceof Sekreter) {
			sonuc = true;
		} else {
			sonuc = false;
		}
		return sonuc;
	}
	
	public void setOgrenciNo (String ogrenciNo, Kullanici islemYapan) {
		if(yetkiKontrolu(islemYapan) == true) {
			this.ogrenciNo = ogrenciNo;
			System.out.println("öğrenci numarası" + ogrenciNo + "olarak güncellendi");
		} else {
			System.out.println("öğrenci numarası" + ogrenciNo + "olarak güncellenemedi!!!");
		}
	}
	
	public void setBolum(String bolum, Kullanici islemYapan) {
		if(yetkiKontrolu(islemYapan) == true) {
			this.bolum = bolum;
			System.out.println("bölüm bilgisi" + bolum + "olarak güncellendi");
		} else {
			System.out.println("bölüm bilgisi" + bolum + "olarak güncellenemedi!!!");
		}
	} //niye error veriyor yok ki??????
	
	public void setAlinanDersKayitlari() {
		//burada kaldım!!
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
