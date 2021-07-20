package funciones;

public class DigitosNumero {
    public static void main(String[] args) {

        System.out.println(digitos(85));

    }

    public static int digitos(int x) {
        if (x == 0) {
            return 1;
        } else {
            int n = 0;
            while (x > 0) {
                x = x / 10;
                n++;
            }
            return n;
        }
    }
}
