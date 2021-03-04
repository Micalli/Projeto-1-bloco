package PO;

public class CriseDePanico {
	
	private int doresnopeito;
	private int faltadear;
	private int sensacaodemorte;
	private String verify;
	
	
	public CriseDePanico( int doresnopeito, int faltadear,  int sensacaodemorte,String verify)
	{
		this.doresnopeito =  doresnopeito;
		this.faltadear = faltadear;
		this.sensacaodemorte = sensacaodemorte;
		this.verify = verify;
	}
	
	public CriseDePanico(int doresnopeito, int faltadear,  int sensacaodemorte)
	{
		this.doresnopeito =  doresnopeito;
		this.faltadear = faltadear;
		this.sensacaodemorte = sensacaodemorte;
		
	}


	public int GetDoresnopeito() {
	
		return doresnopeito;
	}


	public void setDoresnopeito(int doresnopeito) {
		this.doresnopeito = doresnopeito;
	}


	public int GetFaltadear() {
		return faltadear;
	}


	public void setFaltadear(int faltadear) {
		this.faltadear = faltadear;
	}


	public int GetSensacaodemorte() {
		return sensacaodemorte;
	}


	public void setSensacaodemorte(int sensacaodemorte) {
		this.sensacaodemorte = sensacaodemorte;
	}


	public String getVerify() {
		if(doresnopeito==1 && sensacaodemorte==1 && faltadear==1)
		{
			System.out.println("Você tem Crise de panico");
			System.out.println("Procure uma orientação médica para começar o tratamento");
			System.out.println("Agende agora no número: (11) 4527-1347");
		}
		if (doresnopeito==0 && sensacaodemorte==0 && faltadear==1)
		{
			
		}
		return verify;
		
	}


	public void setVerify(String verify) {
		this.verify = verify;
	}

}
