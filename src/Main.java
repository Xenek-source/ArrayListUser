import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Baza obiekt;
        ArrayList<Baza> lista = new ArrayList<>();
        int numeracja=0;

        for (int index = 0; index < 3; index++) {
            System.out.println("Nazwa obiektu");
        //  String nazwa = scan.nextLine();
            obiekt = new Baza();
            lista.add(numeracja, obiekt.getNazwa());
            numeracja++;
        }
        System.out.println("Obiekty: ");
        System.out.println(lista);
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));

    }
}


