module co.edu.uniquindio.poo.parqueadero {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.poo.main to javafx.fxml;
    exports co.edu.uniquindio.poo.main;
    exports co.edu.uniquindio.poo;
    exports co.edu.uniquindio.poo.controlador;
    exports co.edu.uniquindio.poo.model;
    opens co.edu.uniquindio.poo to javafx.fxml;
}