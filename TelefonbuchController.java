/**
 * Sample Skeleton for 'telefonbuch.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelefonbuchController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="buttonNachschlagen"
    private Button buttonNachschlagen; // Value injected by FXMLLoader

    @FXML // fx:id="textFieldName"
    private TextField textFieldName; // Value injected by FXMLLoader

    @FXML // fx:id="labelNamen"
    private Label labelNamen; // Value injected by FXMLLoader

    @FXML // fx:id="labelAdresse"
    private Label labelAdresse; // Value injected by FXMLLoader

    @FXML // fx:id="labelPlzUndOrt"
    private Label labelPlzUndOrt; // Value injected by FXMLLoader

    @FXML // fx:id="labelTelefonnummer"
    private Label labelTelefonnummer; // Value injected by FXMLLoader


    @FXML
    void onEnter(ActionEvent event) {
    	suchenUndAusgeben();
    }

    @FXML
    void nachschlagen(ActionEvent event) {
    	suchenUndAusgeben();
    }

	private void suchenUndAusgeben() {

		String suchName = textFieldName.getText();

    	Datensatz d = DatenSpeicher.getDatenSpeicher().nachschlagen(suchName);

    	if (d != null) {
    		labelNamen.setText("Name: " + d.name);
    		labelAdresse.setText("Strasse: " +d.strasse);
    		labelPlzUndOrt.setText("Ort: " + d.plz + " " + d.ort);
    		labelTelefonnummer.setText("Telefonnummer: " + d.telNummer);
    	} else {

    		labelNamen.setText("Der Name " + suchName + " wurde nicht gefunden");
    		labelAdresse.setText("");
    		labelPlzUndOrt.setText("");
    		labelTelefonnummer.setText("");
    	}
	}


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

        assert buttonNachschlagen != null : "fx:id=\"buttonNachschlagen\" was not injected: check your FXML file 'telefonbuch.fxml'.";
        assert textFieldName != null : "fx:id=\"textFieldName\" was not injected: check your FXML file 'telefonbuch.fxml'.";
        assert labelNamen != null : "fx:id=\"labelNamen\" was not injected: check your FXML file 'telefonbuch.fxml'.";
        assert labelAdresse != null : "fx:id=\"labelAdresse\" was not injected: check your FXML file 'telefonbuch.fxml'.";
        assert labelPlzUndOrt != null : "fx:id=\"labelPlzUndOrt\" was not injected: check your FXML file 'telefonbuch.fxml'.";
        assert labelTelefonnummer != null : "fx:id=\"labelTelefonnummer\" was not injected: check your FXML file 'telefonbuch.fxml'.";

    }
}



