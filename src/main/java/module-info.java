module fr.btsciel.td_equations {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens fr.btsciel.td_equations to javafx.fxml;
    exports fr.btsciel.td_equations;
}