package PO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner ler = new Scanner(System.in);
		
		int doresnopeito, sensacaodemorte,faltadear;
		String verify;
		do
		{
		System.out.println("Você tem dores no peito?");
		doresnopeito=ler.nextInt();
		}while(doresnopeito !=1 && doresnopeito!=2);
		do
		{
		System.out.println("Você tem sensação de morte?");
		sensacaodemorte=ler.nextInt();
		}while(sensacaodemorte!=1 && sensacaodemorte!=2);
		
		do
		{
		System.out.println("Você tem falta de ar?");
		faltadear=ler.nextInt();
		}while(faltadear!=1 && faltadear!=2);
		
		CriseDePanico p1 = new CriseDePanico (doresnopeito, sensacaodemorte,faltadear);
		
		p1.getVerify();

	}
}
