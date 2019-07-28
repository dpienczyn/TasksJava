package rozmowa;

public class Stack {

    // Zdefiniowanie tablicy i element�w odpowiedzialnych za wierzcho�ek.
    double[] tab;
    int firstFree;

    // Konstruktor, kt�ry zainicjuje wierzcho�ek i stos o odpowiedniej
    // wielko�ci.
    public Stack(int MaxSize) {
        tab = new double[MaxSize];
        firstFree = 0;
    }

    // Metoda zwracaj�ca maksymalny rozmiar stosu
    int getMaximumStackSize() {
        return tab.length;
    }

    // Metoda zwracaj�ca prawd�, je�eli stos jest pusty
    boolean isEmpty() {
        if (firstFree == 0) {
            return true;
        } else
            return false;
    }

    // Metoda zwracaj�ca rozmiar stosu
    int getSize() {
        return firstFree;
    }

    // Metoda dodaj�ca na stos
    void Push(double E) throws ArrayIndexOutOfBoundsException {
        if (firstFree < tab.length) {
            tab[firstFree] = E;
            firstFree++;

        } else {
            throw new ArrayIndexOutOfBoundsException(
                    "Przepe�nienie stosu, operacja nie powiod�a si�");
        }
    }

    // Metoda zdejmuj�ca ze stosu
    double Pop() throws IndexOutOfBoundsException {
        if (firstFree <= 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiod�a si�");
        }

        double temp = tab[firstFree - 1];
        firstFree--;
        return temp;
    }

    // Metoda wy�wietlaj�ca zawarto�� stosu
    void display() throws IndexOutOfBoundsException {
        if (firstFree == 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiod�a si�");
        }

        int temp = firstFree - 1;
        do {
            System.out.println(tab[temp]);
            temp--;
        } while (temp > -1);

    }

    // Metoda wielokrotnego zdj�cia
    void multiPop(int k) {
        if (k < firstFree) {
            for (int i = k; i > 0; i--) {
                System.out.println(Pop());
            }
        }
    }

    // Metoda czyszcz�ca stos
    void clear() {
        for (int i = 0; i < firstFree; i++) {
            tab[i] = 0.0;

        }

        firstFree = 0;
    }

    // Metoda odwracaj�ca kolejno�� element�w na stosie
    void reverse() {
        for (int i = 0; i < firstFree / 2; i++) {
            double temp = tab[i];
            tab[i] = tab[firstFree - 1 - i];
            tab[firstFree - 1 - i] = temp;

        }
    }
    
    public static void main(String[] args) {
    	Stack s = new Stack(10);
    	int y = s.getMaximumStackSize();
    	boolean r = s.isEmpty();
    	int size = s.getSize();
    	s.Push(10);
    	double o = s.Pop();
    	s.display();
    	
    	System.out.println(o);
    	
    }
}
