package pl.sda.orange.java2.carsharing.Login;

import java.sql.SQLException;
import java.util.Scanner;

public class MainLogin {

    public static void main(String[] args) {
        LoginSystemWithH2 loginSystem = new LoginSystemWithH2();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        try {
            loginSystem.addUser("user1", "password1");
            loginSystem.addUser("user2", "password2");
            loginSystem.addUser("user3", "password3");
            loginSystem.addUser("user4", "password4");
            loginSystem.addUser("user5", "password5");
            loginSystem.addUser("user6", "password6");


            loginSystem.login(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}