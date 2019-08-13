package rozmowa;

import java.util.Scanner;

public class LiczbaPierwsza {
	
	public boolean sprawdz(int liczba) {
		
		if(liczba<2) {
			return false;
			//System.out.println("NIE");
		}
		else if(liczba==2||liczba==3) {
			return true;
			//System.out.print("TAK");
		}else 
		for(int i=3; i<=liczba; i+=2) {
			int ile = 0; 
			if(liczba%i==0) {
				//System.out.println(i+"NIE");
				return false;
			}else if(liczba%i!=0){
				//System.out.println("TAK");
				return true;
			}
	}
		return false;
	}

	public static void main(String[] args) {
		LiczbaPierwsza p = new LiczbaPierwsza();
		Scanner s = new Scanner(System.in);
		int liczba = s.nextInt();
		if(p.sprawdz(liczba)) {
			System.out.print("TAK");
		}
		else {
			System.out.print("NIE");
		}
		
		
		
	}
}