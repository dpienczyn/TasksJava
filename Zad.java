package rozmowa;
//Wypisz liczby od 1 do 100, je¿eli liczba jest podzielna przez 3 to wypisz Fizz, je¿eli podzielna przez 5 to Buzz, je¿eli podzielna przez 3 i 5 to wypisz FizzBuzz. W przeciwnym wypadku wypisz liczbê.
public class Zad {
	
	public void fizzBuzz() {
		int liczba = 100;
		for(int i=1; i<liczba; i++) {
			if(i%3==0) {
				System.out.println("Fizz");
			}
			if(i%5==0) {
				System.out.println("Buzz");
			}
			if(i%3==0&&i%5==0) {
				System.out.println("FizzBuzz");
			}
			else
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Zad z = new Zad();
		z.fizzBuzz();

	}

}
