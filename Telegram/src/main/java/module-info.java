module develop.telegram {
    requires javafx.controls;
    requires javafx.fxml;

    opens develop.telegram.app to javafx.fxml;
    exports develop.telegram.app;
    opens develop.telegram.controller to javafx.fxml;
}