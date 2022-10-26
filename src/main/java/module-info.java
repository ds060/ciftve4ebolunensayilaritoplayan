module com.example.batch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.batch to javafx.fxml;
    exports com.example.batch;
}