module com.mycompany.tarearecuperarinterfazjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.tarearecuperarinterfazjavafx to javafx.fxml;
    exports com.mycompany.tarearecuperarinterfazjavafx;
}
