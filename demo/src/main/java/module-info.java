module com.tdd.demo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tdd.demo to javafx.fxml;
    exports com.tdd.demo;
}
