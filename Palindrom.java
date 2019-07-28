package rozmowa;

import java.util.Scanner;

public class Palindrom {

	public static boolean palindrom(String lancuch) {
		lancuch = lancuch.replace(" ", "");
		lancuch = (lancuch.toLowerCase());
		// tworzymy nowy obiekt klasy StringBuilder
		StringBuilder tekst = new StringBuilder(lancuch);
		System.out.println(tekst);
		// wykorzystujemu metod� reverse() do odwr�cenia �a�cucha
		
		// oraz equals() do sprawdzenia czy oba �a�cuchy s� takie same
		
		return lancuch.equals(tekst.reverse().toString());
		
		}
		
		 
		
		public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print ("Podaj �a�cuch tekstowy: " );
		
		// pobieramy od u�ytkownika �a�cuch tekstowy
		
		String lancuch = sc.nextLine();
		
		// wy�wietlamy na ekranie informacje czy podany wyraz jest palindromem
		
		
		System.out.println("�a�cuch tekstowy: " + lancuch + (palindrom(lancuch) ? " jest" : " nie jest") + " palindromem");
		
		}
		
		}
