package OBS;

public class Kullanici {

	
	private String kullaniciID;
	private String ad;
	private String soyad;
	private String telefon;
	private String adres;
	private String kullaniciAdi;
	private String sifre;
	
	//constructor
	public Kullanici(String kullaniciID, String ad, String soyad, String telefon, String adres, String kullaniciAdi,
			String sifre) {
		super();
		this.kullaniciID = kullaniciID;
		this.ad = ad;
		this.soyad = soyad;
		this.telefon = telefon;
		this.adres = adres;
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
	}
	
	
    
    public boolean login(String girilenKullaniciAdi, String girilenSifre) {
        boolean sonuc = false;
        if (this.kullaniciAdi.equals(girilenKullaniciAdi) && this.sifre.equals(girilenSifre)) {
            sonuc = true; //giriş başarılı
            System.out.println("Giriş Başarılı: " + this.ad + " " + this.soyad);
        } else { //giriş başarısız
            sonuc = false;
            System.out.println("Giriş Başarısız! Kullanıcı adı veya şifre hatalı.");
        }
        return sonuc;
    }



	public String getKullaniciID() {
		return kullaniciID;
	}

	public String getAd() {
		return ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public String getTelefon() {
		return telefon;
	}

	public String getAdres() {
		return adres;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}


	public void setAd(String yeniAd, Kullanici islemYapan) {
		boolean yetkilimi = false;
		if(islemYapan instanceof Sekreter) {
			yetkilimi = true;
		}else
			yetkilimi = false;
		if(yetkilimi == true) {
			this.ad = yeniAd;
			System.out.println("İsim" + yeniAd + "olarak güncellendi.");
		}else{
			System.out.println("sadece sekreter isim değiştirebilir!");
		}
	}
	
	public void setSoyad(String yeniSoyad, Kullanici islemYapan) {
		boolean yetkilimi = false;
		if(islemYapan instanceof Sekreter) {
			yetkilimi=true;
		}
		if(yetkilimi) {
			this.soyad = yeniSoyad;
			System.out.println("soyad" + yeniSoyad + "olarak güncellendi");
		} else {
			System.out.println("sadece sekreter soyad değiştirebilir!");
		}
	}
	
	public void setSifre(String yeniSifre, Kullanici islemYapan) {
		boolean yetkilimi = false;
		if(islemYapan instanceof Sekreter) {
			yetkilimi=true;
		}
		if(yetkilimi) {
			this.sifre = yeniSifre;
			System.out.println("şifre" + yeniSifre + "olarak güncellendi");
		} else {
			System.out.println("sadece sekreter şifre değiştirebilir!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}