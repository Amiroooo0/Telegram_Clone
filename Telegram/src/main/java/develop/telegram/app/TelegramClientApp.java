package develop.telegram.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelegramClientApp extends Application {

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/develop/telegram/fxml/login.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root, 400, 500);
            scene.getStylesheets().add(TelegramClientApp.class.getResource("/develop/telegram/styles/base.css").toExternalForm());
            scene.getStylesheets().add(TelegramClientApp.class.getResource("/develop/telegram/styles/light.css").toExternalForm());

            stage.setTitle("Telegram Login");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
