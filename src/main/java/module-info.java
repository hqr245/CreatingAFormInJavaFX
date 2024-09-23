module es.ieslosmontecillos.creatingaforminjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens es.ieslosmontecillos.creatingaforminjavafx to javafx.fxml;
    exports es.ieslosmontecillos.creatingaforminjavafx;
}