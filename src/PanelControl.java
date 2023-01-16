import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class PanelControl {
    Scanner scan = new Scanner(System.in);
    ArrayList<UserManage> userList = new ArrayList<>();
    String name;
    UserManage user;

    public void startPanel(){
        System.out.println("### Witaj w panelu logowania ###");
        System.out.println();
    }
    public void startCheck(){
        System.out.println("     ### Wybierz opcje ###");
        System.out.println("     ##### Zaloguj #######");
        System.out.println("     ##### Zarejestruj ###");
        System.out.println();

    }

    public void addUser(){
        System.out.println("### Rejestracja konta ###");
        name = scan.nextLine();
        user = new UserManage(name);
        userList.add(user);
    }

    public void getUser(){
        System.out.println(userList);
        System.out.println(userList.get(0).name);
        System.out.println(userList.get(1).name);
        System.out.println(userList.get(2).name);
    }

}
