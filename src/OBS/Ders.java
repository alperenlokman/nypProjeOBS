package OBS;

public class Ders {

	private String dersKodu;
	private String dersAdi;
	private String donemTipi;
	private int kredi;
	private int akts;
	private Hoca dersiVerenHoca;
	private int[] haftalikProgram;
	
	//constructor
	public Ders(String dersKodu, String dersAdi, String donemTipi, int kredi, int akts, Hoca dersiVerenHoca,
			int[] haftalikProgram) {
		super();
		this.dersKodu = dersKodu;
		this.dersAdi = dersAdi;
		this.donemTipi = donemTipi;
		this.kredi = kredi;
		this.akts = akts;
		this.dersiVerenHoca = dersiVerenHoca; //genel constructrları kontrol et must ları tut
		this.haftalikProgram = haftalikProgram;
	}


	public String getDersKodu() {
		return dersKodu;
	}


	public String getDersAdi() {
		return dersAdi;
	}


	public String getDonemTipi() {
		return donemTipi;
	}


	public int getKredi() {
		return kredi;
	}


	public int getAkts() {
		return akts;
	}


	public Hoca getDersiVerenHoca() {
		return dersiVerenHoca;
	}


	public int[] getHaftalikProgram() {
		return haftalikProgram;
	}
	
	
	//set edebilen yalnızca hoca ile sekreter mi, akts set edilmesin mesela hesaplanılsın çağırılsın?
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
