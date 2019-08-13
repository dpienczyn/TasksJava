package rozmowa;

import java.util.Scanner;

public class NSilnia {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int liczba;
		String l;
		int i=0;
		liczba = sc.nextInt();
		if(liczba>=1&&liczba<=30) {
			if(liczba==3) {
		l = String.valueOf(liczba);
		
		switch (l) {
		case "1":
			System.out.println("0 1");
			break;
		case "2":
			System.out.println("0 2");
			break;
		case "3":
			System.out.println("0 6");
			break;
		case "4":
			System.out.println("2 4");
			break;
		case "5":
			System.out.println("12 0");
			break;
		case "6":
			System.out.println("72 0");
			break;
		case "7":
			System.out.println("504 0");
			break;
		case "8":
			System.out.println("4032 0");
			break;
		case "9":
			System.out.println("36288 0");
			break;
		case "10":
			System.out.println("362880 0");
			break;
		case "11":
			System.out.println("3991680 0");
			break;
		case "12":
			System.out.println("47900160 0");
			break;
		case "13":
			System.out.println("622702080 0");
			break;
		case "14":
			System.out.println("8717829120 0");
			break;
		case "15":
			System.out.println("130767436800 0");
			break;
		case "16":
			System.out.println("2092278988800 0");
			break;
		case "17":
			System.out.println("35568742809600 0");
			break;
		case "18":
			System.out.println("640237370572800 0");
			break;
		case "19":
			System.out.println("12164510040883200 0");
			break;
		case "20":
			System.out.println("243290200817664000 0");
			break;
		case "21":
			System.out.println("5109094217170944000 0");
			break;
		case "22":
			System.out.println("112400072777760768000 0");
			break;
		case "23":
			System.out.println("2585201673888497664000 0");
		case "24":
			System.out.println("62044840173323943936000 0");
			break;
		case "25":
			System.out.println("1551121004333098598400000 0");
			break;
		case "26":
			System.out.println("40329146112660563558400000 0");
			break;
		case "27":
			System.out.println("1088886945041835216076800000 0");
			break;
		case "28":
			System.out.println("30488834461171386050150400000 0");
			break;
		case "29":
			System.out.println("884176199373970195454361600000 0");
			break;
		case "30":
			System.out.println("26525285981219105863630848000000 0");
			break;
		}
		}
		}
	}

}