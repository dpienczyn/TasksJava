package rozmowa;

public class CiagF {

    public int ciag(int f) {
        if (f < 2) {
            return 1;
        }
        return ciag(f - 1) + ciag(f - 2);
    }

    public static void main(String[] args) {
        CiagF g = new CiagF();
        int h = g.ciag(5);
        System.out.println(h);
    }
}
