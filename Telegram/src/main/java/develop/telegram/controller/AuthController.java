package develop.telegram.controller;

import develop.telegram.model.AuthData;
import develop.telegram.util.ThemeManager;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;

public class AuthController {

    @FXML private TextField emailField;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private TextField verificationField;
    @FXML private Label errorLabel;

    @FXML
    private void sendVerificationCode() {
        String email = emailField.getText().trim();
        String username = usernameField.getText().trim();
        String password = passwordField.getText().trim();

        if (email.isEmpty() || username.isEmpty() || password.isEmpty()) {
            showError("All fields are required!");
            return;
        }

        // TODO: connecting to server for checking duplicate
        if (email.endsWith("@fake.com")) {
            showError("Email already in use");
            return;
        }


        AuthData data = new AuthData(email, username, password);
        System.out.println("Mock sending verification code to " + data.getEmail());

        verificationField.setVisible(true);
        errorLabel.setVisible(false);
    }

    @FXML
    private void toggleTheme() {
        Scene scene = emailField.getScene();
        ThemeManager.toggleTheme(scene);
    }

    private void showError(String msg) {
        errorLabel.setText(msg);
        errorLabel.setVisible(true);
    }
}


