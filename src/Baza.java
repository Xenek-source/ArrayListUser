import java.util.Scanner;

public class Baza {
   Scanner scan = new Scanner(System.in);
   public String nazwa;

public Baza (){
}

public String getNazwa(){
    nazwa = scan.nextLine();
    return nazwa;
}
}