module com.example.comandoswin11 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.comandoswin11 to javafx.fxml;
    exports com.example.comandoswin11;
}