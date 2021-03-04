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
		int num = (int) ((int) 1 + (Math.random() * 100)); 
		
		if(this.doresnopeito==2 && this.sensacaodemorte==1 && this.faltadear==2)
		{
			System.out.println("Procure um m�dico especifico");
			System.out.println("Agende agora no n�mero: (11) 7857-6587");
		}	
		if(this.doresnopeito==1 && this.sensacaodemorte==1 && this.faltadear==1)
		{
			System.out.println("Voc� tem Crise de panico");
			System.out.println("Procure uma orienta��o de um psiquatra e para come�ar o tratamento");
			System.out.println("Agende agora no n�mero: (11) 4527-1347");
		}
		if(this.doresnopeito==2 && this.sensacaodemorte==2 && this.faltadear==1)
		{	
			
			System.out.println("Obtendo IP...\nObtendo seu endere�o...");
			System.out.println("Rua."+num);
			System.out.println("Discando 193...");
			System.out.println("Ambul�ncia em caminho! ");
			
		}
		
		
		if(this.doresnopeito==1 && this.sensacaodemorte==2 && this.faltadear==2)
		{
			System.out.println("Procure um m�dico especifico em urg�ncia");
			System.out.println("Agende agora no n�mero: (11) 8956-3256");
		}
		if(this.doresnopeito==2 && this.sensacaodemorte==2 && this.faltadear==2)
		{
			System.out.println("Voc� n�o tem nenhum diagn�stico");
			System.out.println("Cuide de sua saude, praticando exercicios como meditar!");
		}
		return verify;
		
	}


	public void setVerify(String verify) {
		this.verify = verify;
	}

}
