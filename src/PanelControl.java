import java.util.ArrayList;
// import java.util.Objects;
import java.util.Objects;
import java.util.Scanner;

public class PanelControl {
    Scanner scan = new Scanner(System.in);
    ArrayList<UserManage> userList = new ArrayList<>();
    String logUser;

    public void startPanel(){
        System.out.println("### Witaj w panelu logowania ###");
        System.out.println();
    }
    public void startCheck(){
        System.out.println("     ### Wybierz opcje ####");
        System.out.println("     > Wpisz zaloguj ######");
        System.out.println("     > Wpisz zarejestruj ##");
        System.out.println();
        String wybor = scan.nextLine();
        switch (wybor) {
            case "zaloguj" -> logOn();
            case "zarejestruj" -> addUser();
            default -> {
                System.out.println("Nie ma takiej opcji.");
                startCheck();
            }
        }
    }
    public void addUser(){
        System.out.println("###  Rejestracja konta ###");
        System.out.println("     Wpisz username:");
        String name = scan.nextLine();
        UserManage user = new UserManage(name);
        userList.add(user);
        System.out.println("     Konto utworzone.");
        System.out.println("     ####################");
        System.out.println();
        startCheck();
    }
    public void logOn() {
        System.out.println("     Logowanie ##########");
        System.out.println("     Podaj login: #######");
        String login = scan.nextLine();
        if (userList.isEmpty()) {
            System.out.println("Brak użytkownika. Zaloguj się ponownie.");
            startCheck();
        } else {
            for (int i = 0; i < userList.size(); i++) {
                if (Objects.equals(login,userList.get(i).name)) {
                    logUser = userList.get(i).name;
                    System.out.println(logUser);
                    account();
                    break;
                } else {
                    System.out.println("Brak użytkownika. Zaloguj się ponownie.");
                    startCheck();
                }
            }
        }
    }
    public void account(){
        System.out.println("     Zalogowano konto: " + logUser);
        for (UserManage userManage : userList)
            System.out.println("     Wszystkie konta to:" + userManage.name);
    }

}
