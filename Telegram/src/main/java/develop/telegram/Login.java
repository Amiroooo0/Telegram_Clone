package develop.telegram;

public class Login {
    private UserDatabase userDatabase = new UserDatabase();

    public boolean loginService(String username, String rawPassword) {
        User user = userDatabase.findByUsername(username);
        if (user == null) {
            System.out.println("User not found");
            return false;
        }

        if (Password.checkPassword(rawPassword, user.getPassword())) {
            System.out.println("Login successful");
            return true;
        } else {
            System.out.println("Incorrect password");
            return false;
        }
    }
}
