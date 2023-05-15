module com.example.javafx_harry {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_harry to javafx.fxml;
    exports com.example.javafx_harry;
}