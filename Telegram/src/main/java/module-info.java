module develop.telegram {
    requires javafx.controls;
    requires javafx.fxml;


    opens develop.telegram to javafx.fxml;
    exports develop.telegram;
}