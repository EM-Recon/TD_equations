package fr.btsciel.td_equations;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;


public class MainController implements Initializable {


    @FXML
    private Label labelResultat;

    private EqResoudre eqResoudre = new EqResoudre();

    @FXML
    private TextField textFieldequation;

    private void miseAJour (){
        if(eqResoudre.typeEquationOk(textFieldequation.getText())){
            labelResultat.setText(eqResoudre.resoudre(textFieldequation.getText()));
        } else {
            labelResultat.setText("NoK");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textFieldequation.textProperty().addListener((observable, oldValue, newValue) -> miseAJour());

    }

}
