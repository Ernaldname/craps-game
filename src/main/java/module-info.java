module org.example.crapsgametest {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.crapsjuegotest to javafx.fxml;
    opens com.example.crapsjuegotest.controller to javafx.fxml;

    exports com.example.crapsjuegotest.controller;
    exports com.example.crapsjuegotest.controller.controller to javafx.fxml;
    opens com.example.crapsjuegotest.controller.controller to javafx.fxml;

}
