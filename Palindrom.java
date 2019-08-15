package rozmowa;

import java.util.Scanner;

public class Palindrom {

    public static boolean palindrom(String lancuch) {
        lancuch = lancuch.replace(" ", "");
        lancuch = (lancuch.toLowerCase());
        // tworzymy nowy obiekt klasy StringBuilder
        StringBuilder tekst = new StringBuilder(lancuch);
        System.out.println(tekst);
        // wykorzystujemu metodę reverse() do odwrócenia łańcucha

        // oraz equals() do sprawdzenia czy oba łańcuchy są takie same

        return lancuch.equals(tekst.reverse().toString());

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj łańcuch tekstowy: ");

        // pobieramy od użytkownika łańcuch tekstowy

        String lancuch = sc.nextLine();

        // wyświetlamy na ekranie informacje czy podany wyraz jest palindromem


        System.out.println("Łańcuch tekstowy: " + lancuch + (palindrom(lancuch) ? " jest" : " nie jest") + " palindromem");

    }

}
