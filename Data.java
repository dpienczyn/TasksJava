package rozmowa;

import java.util.Arrays;

public class Data {
	
	public void s(String slowo) {
		for(int i=slowo.length()-1; i>=0; i--) {
			System.out.print(slowo.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Data d = new Data();
		d.s("ola ma");
	}
}
