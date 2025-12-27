package OBS;

public class Not {

	private double vizeBir;
	private double vizeİki;
	private double proje;
	private double odev;
	private double finalNotu;
	
	private double vize1Orani = 0.15; // yeni ekledim
    private double vize2Orani = 0.15; // yeni ekledim
    private double projeOrani = 0.10; // yeni ekledim   ytoplam 100 olmalı
    private double odevOrani  = 0.10; // yeni ekledim
    private double finalNotuOrani = 0.50; // yeni ekledim
	
  //constructor
	public Not(double vizeBir, double vizeİki, double proje, double odev, double finalNotu) {
		super();
		this.vizeBir = vizeBir;
		this.vizeİki = vizeİki;
		this.proje = proje;
		this.odev = odev;
		this.finalNotu = finalNotu;
	}

	private boolean yetkiKontrolu(Kullanici islemYapan) { //kim kullanıyor? ona göre setterlara izin vereceğiz
		boolean sonuc = false;
		if (islemYapan instanceof Sekreter || islemYapan instanceof Hoca) {
			sonuc = true;
		} else {
			sonuc = false;
		}
		return sonuc;
	}

	public double getVizeBir() {
		return vizeBir;
	}

	public double getVizeİki() {
		return vizeİki;
	}

	public double getProje() {
		return proje;
	}

	public double getOdev() {
		return odev;
	}

	public double getFinalNotu() {
		return finalNotu;
	}

	public double getVize1Orani() {
		return vize1Orani;
	}

	public double getVize2Orani() {
		return vize2Orani;
	}

	public double getProjeOrani() {
		return projeOrani;
	}

	public double getOdevOrani() {
		return odevOrani;
	}

	public double getFinalNotuOrani() {
		return finalNotuOrani;
	}
	
	public void setVize1Orani (double yeniOran, Kullanici islemYapan) {
		if(yetkiKontrolu(islemYapan)) {
			this.vize1Orani = yeniOran;
			System.out.println("vize 1 oranı" + yeniOran + "olarak güncellendi.");
		}else {
			System.out.println("vize 1 oranı" + yeniOran + "olarak güncellenemedi!!!");
		}
	}
	
	public void setVize2Orani (double yeniOran, Kullanici islemYapan) {
		if(yetkiKontrolu(islemYapan)) {
			this.vize2Orani = yeniOran;
			System.out.println("vize 2 oranı" + yeniOran + "olarak güncellendi.");
		}else {
			System.out.println("vize 2 oranı" + yeniOran + "olarak güncellenemedi!!!");
		}
	}
	
	public void setProjeOrani (double yeniOran, Kullanici islemYapan) {
		if(yetkiKontrolu(islemYapan)) {
			this.projeOrani = yeniOran;
			System.out.println("Proje oranı" + yeniOran + "olarak güncellendi.");
		}else {
			System.out.println("Proje oranı" + yeniOran + "olarak güncellenemedi!!!");
		}
	}
	
	public void setOdevOrani (double yeniOran, Kullanici islemYapan) {
		if(yetkiKontrolu(islemYapan)) {
			this.odevOrani = yeniOran;
			System.out.println("Ödev oranı" + yeniOran + "olarak güncellendi.");
		}else {
			System.out.println("Ödev oranı" + yeniOran + "olarak güncellenemedi!!!");
		}
	}
	
	public void setFinalNotuOrani (double yeniOran, Kullanici islemYapan) {
		if(yetkiKontrolu(islemYapan)) {
			this.finalNotuOrani = yeniOran;
			System.out.println("Final oranı" + yeniOran + "olarak güncellendi.");
		}else {
			System.out.println("Final oranı" + yeniOran + "olarak güncellenemedi!!!");
		}
	}
	
	public double ortalamaHesapla() {
		double ortalama;
		ortalama = (this.vize1Orani * this.vizeBir) + (this.vize2Orani * this.vizeİki) + (this.projeOrani * this.proje) + (this.odevOrani * this.odev) + (this.finalNotuOrani * this.finalNotu);
		return ortalama;		
	}
	
	public String harfNotuHesapla() {
		double ortalama = ortalamaHesapla();
		String harf;
		
		if(ortalama >= 90) {
			harf = "AA";
		} else if (ortalama >= 80) {
			harf = "BA";
		} else if (ortalama >= 70) {
			harf = "BB";
		} else if (ortalama >= 65) {
			harf= "CB";
		}else if (ortalama >= 60) {
			harf = "CC";
		}else if (ortalama >= 55) {
			harf = "DC";
		}else if (ortalama >= 50) {
			harf = "DD";
		} else if (ortalama >= 40) {
			harf = "FD";
		}else {
			harf = "FF";
		}
		return harf;
	}
	
	
	public void setVizeBir(double vizeBir, Kullanici islemYapan) {
		boolean izin;
		izin = yetkiKontrolu(islemYapan);
		if (izin == true) {
			this.vizeBir = vizeBir;
			System.out.println("vize 1 notu" + vizeBir + "olarak girildi");
		}else {
			System.out.println("vize 1 notu" + vizeBir + "olarak girilemedi!!!");
		}
	}
	
	public void setVizeİki(double vizeİki, Kullanici islemYapan) {
		boolean izin;
		izin = yetkiKontrolu(islemYapan);
		if (izin == true) {
			this.vizeİki = vizeİki;
			System.out.println("vize 2 notu" + vizeİki + "olarak girildi");
		}else {
			System.out.println("vize 2 notu" + vizeİki + "olarak girilemedi!!!");
		}
	}
	
	public void setProje(double proje, Kullanici islemYapan) {
		boolean izin;
		izin = yetkiKontrolu(islemYapan);
		if (izin == true) {
			this.proje = proje;
			System.out.println("proje notu" + proje + "olarak girildi");
		}else {
			System.out.println("proje notu" + proje + "olarak girilemedi!!!");
		}
	}
	
	public void setOdev(double odev, Kullanici islemYapan) {
		boolean izin;
		izin = yetkiKontrolu(islemYapan);
		if (izin == true) {
			this.odev = odev;
			System.out.println("ödev notu" + odev + "olarak girildi");
		}else {
			System.out.println("ödev notu" + odev + "olarak girilemedi!!!");
		}
	}
	
	public void setFinalNotu(double finalNotu, Kullanici islemYapan) {
		boolean izin;
		izin = yetkiKontrolu(islemYapan);
		if (izin == true) {
			this.finalNotu = finalNotu;
			System.out.println("final notu" + finalNotu + "olarak girildi");
		}else {
			System.out.println("final notu" + finalNotu + "olarak girilemedi!!!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
