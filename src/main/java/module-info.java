module com.example.labiryntgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labiryntgui to javafx.fxml;
    exports com.example.labiryntgui;
}