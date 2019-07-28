package rozmowa;

import java.util.Scanner;

public class Palindrom {

	public static boolean palindrom(String lancuch) {
		lancuch = lancuch.replace(" ", "");
		lancuch = (lancuch.toLowerCase());
		// tworzymy nowy obiekt klasy StringBuilder
		StringBuilder tekst = new StringBuilder(lancuch);
		System.out.println(tekst);
		// wykorzystujemu metodê reverse() do odwrócenia ³añcucha
		
		// oraz equals() do sprawdzenia czy oba ³añcuchy s¹ takie same
		
		return lancuch.equals(tekst.reverse().toString());
		
		}
		
		 
		
		public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print ("Podaj ³añcuch tekstowy: " );
		
		// pobieramy od u¿ytkownika ³añcuch tekstowy
		
		String lancuch = sc.nextLine();
		
		// wyœwietlamy na ekranie informacje czy podany wyraz jest palindromem
		
		
		System.out.println("£añcuch tekstowy: " + lancuch + (palindrom(lancuch) ? " jest" : " nie jest") + " palindromem");
		
		}
		
		}
