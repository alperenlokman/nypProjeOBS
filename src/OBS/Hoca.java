package OBS;

import java.util.ArrayList;

public class Hoca extends Kullanici { //inheritance

	private String unvan;
	private String odaNo;
	private ArrayList<Ders> verilenDersler;
	
	
	public Hoca(String kullaniciID, String ad, String soyad, String telefon, String adres, String kullaniciAdi,
			String sifre, String unvan, String odaNo, ArrayList<Ders> verilenDersler) {
		super(kullaniciID, ad, soyad, telefon, adres, kullaniciAdi, sifre);
		this.unvan = unvan;
		this.odaNo = odaNo;
		this.verilenDersler = verilenDersler;
	}
	
	public int[] dersProgramiGoruntule() {
		//nasıl yapacağım????
		//7 gün 24 saatten 168 slotluk dizi yapmak istiyorum!
		int[] yu = new int[168]; //böyle değil miydi ya? //arraylist çevir
	}
	
	
	
	public void notGirisiYap(OgrenciDersKaydi derskaydi, double vize1, double vize2, double proje, double odev, double finalNotu) {
		//nasıl yapacağım????
	}

	public void devamsizlikGirisiYap(OgrenciDersKaydi derskaydi, int eklenenDevamsizlik) {
		//nasıl yapacağım????
	}

	
	
	
	
	
	
	
	public String getUnvan() {
		return unvan;
	}

	public String getOdaNo() {
		return odaNo;
	}

	public ArrayList<Ders> getVerilenDersler() {
		return verilenDersler;
	}

	private boolean yetkiKontrolu(Kullanici islemYapan) { //kim kullanıyor? ona göre setterlara izin vereceğiz
		boolean sonuc = false;
		if (islemYapan instanceof Hoca || islemYapan instanceof Sekreter) {
			sonuc = true;
		} else {
			sonuc = false;
		}
		return sonuc;
	}
	
	public void setUnvan(String yeniUnvan, Kullanici islemYapan) {
		boolean izin = yetkiKontrolu(islemYapan);
		if(izin == true) {
			this.unvan = yeniUnvan;
			System.out.println("hoca unvanı" + yeniUnvan + "olarak güncellendi");
		} else {
			System.out.println("hoca unvanı" + yeniUnvan + "olarak güncellenemedi");
		}
	}
	
	public void setOdaNo (String yeniOdaNo, Kullanici islemYapan) {
		boolean izin = yetkiKontrolu(islemYapan);
		if(izin == true) {
			this.odaNo = yeniOdaNo;
			System.out.println("hoca odası" + yeniOdaNo + "olarak güncellendi");
		}else {
			System.out.println("hoca odası" + yeniOdaNo + "olarak güncellenemedi");
		}
	}
	
	public void setVerilenDersler(ArrayList<Ders> yeniDersler, Kullanici islemYapan) {
		boolean izin = yetkiKontrolu(islemYapan);
		if(izin == true) {
			this.verilenDersler = yeniDersler;
			System.out.println("hocanın ders listesi güncellendi");
		} else {
			System.out.println("hocanın ders listesi güncellenmedi");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
