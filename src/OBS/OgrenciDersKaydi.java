package OBS;

import java.util.ArrayList;

public class OgrenciDersKaydi {

	private Ders ders;
	private String donem;
	private Not not;
	private Devamsizlik devamsizlik;
	
	
	//constructor
	public OgrenciDersKaydi(Ders ders, String donem, Not not, Devamsizlik devamsizlik) {
		super();
		this.ders = ders;
		this.donem = donem;
		this.not = new Not(0,0,0,0,0); //bunu ben yaptım, not ile güçlü bağ olması için (null bırak yada -1 ver)
		this.devamsizlik = devamsizlik(0); //burada nasıl bi bağ yapacağım?
	}

	
	
	//getter setter başlamadan Not'a geçtim
	
	
	
	
	
	
	
	
	
	
	
	
	
}
