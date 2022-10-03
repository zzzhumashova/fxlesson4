module com.example.fxlessonn4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxlessonn4 to javafx.fxml;
    exports com.example.fxlessonn4;
}