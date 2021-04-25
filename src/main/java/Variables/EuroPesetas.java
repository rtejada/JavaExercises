package Variables;

public class EuroPesetas {

    public static void main(String[] args) {

        final double PESETA = 166.386;
        final double EURO = 0.006;
        int euro = 12;
        int peseta = 500;


        double pesetas = euro * PESETA;
        double euros = peseta * EURO;

        System.out.println(euro + " € equivale a "+ pesetas +" pesetas") ;

        System.out.println(peseta + " pesetas equivale a " + euros + " €");

        char x = 'a';
        char y = 'b';
        char z = 'c';
        char w = 'd';
        char s = 'e';
        int cadena = x + y + z + w + s;

        System.out.println(cadena);
    }


}
