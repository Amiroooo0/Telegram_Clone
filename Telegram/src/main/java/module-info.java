module develop.telegram {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jbcrypt;


    opens develop.telegram to javafx.fxml;
    exports develop.telegram;
}