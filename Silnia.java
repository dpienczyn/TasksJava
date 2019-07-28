package rozmowa;

public class Silnia {

	public int silnia(int s) {
		if(s<2) {
			return 1;
		}
		return s * silnia(s-1);
		
	}
	
	public static void main(String[] args) {
		Silnia s = new Silnia();
		int y = s.silnia(4);
		System.out.println(y);
	}
}
