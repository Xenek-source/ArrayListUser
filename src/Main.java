import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Baza obiekt = null;
        ArrayList<String> lista = new ArrayList<>();
        int numeracja=0;

        for (int index = 0; index < 3; index++) {
            System.out.println("Nazwa obiektu");
            obiekt = new Baza();
            obiekt.getNazwa();
            lista.add(numeracja +". "+ obiekt.nazwa);
            numeracja++;
        }
        System.out.println("Obiekty: ");
        System.out.println(lista);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println("Wczytaj nazwe obiektu:");


    }

}


