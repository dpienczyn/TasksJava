package rozmowa;

import java.util.Scanner;

public class IloscLiter {
	
	
	public void Litery(String word) {
		int i=0;
		String h = word.replace(" ", "");	
		
		for(i=0 ; i<h.length(); i++) {
	
		}
		System.out.print("Ilos� liter w podanym s�owie to: "+ i);
		
	}

	public static void main(String[] args) {
		IloscLiter t = new IloscLiter();
		t.Litery("olal koj fgjhj ewfaurohfeiouj dwiaueyf sdfsf");

	}

}
