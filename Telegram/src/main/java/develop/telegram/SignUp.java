package develop.telegram;

import java.sql.SQLException;
import java.util.Scanner;

public class SignUp {

    private static final Scanner scanner = new Scanner(System.in);

    public static void register() {
        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            if (UserDatabase.isUsernameTaken(username)) {
                System.out.println("Username already taken. Try another one.");
                return;
            }

            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            System.out.print("Enter name: ");
            String name = scanner.nextLine();


            System.out.print("Enter phone number: ");
            String phone = scanner.nextLine();

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            System.out.print("Enter bio: ");
            String bio = scanner.nextLine();

            User newUser = new User(username, password,name, phone, email, bio);
            UserDatabase.registerUser(newUser);

            System.out.println("Registred");

        } catch (SQLException e) {
            System.out.println("Registration failed");
            e.printStackTrace();
        }
    }
}
