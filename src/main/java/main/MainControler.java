package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Comentari;

public class MainControler {
	
	// Camps del formulari
	@FXML
    private TextField nom;

    @FXML
    private TextField tipus;

    @FXML
    private TextField temps;

    @FXML
    private TextField link;

    @FXML
    private TextField imatge;

    @FXML
    private TextField opinio;
    
    @FXML
    private TextField km;

    @FXML
    private Button inserir;
	@FXML
	/**
	 * Recull els camps del inputs i els introdueix dins un objecte que el pasa perque l'introdueixi a la BDD
	 * @param Event
	 */
	public void inserir(ActionEvent Event) {
		Comentari nou = new Comentari(
				nom.getText(),
				'E',
				temps.getText(),
				km.getText(),
				link.getText(),
				imatge.getText(),
				opinio.getText()
				);
		Test.introduir(nou);
		alert("Inserció amb exit");
	}
	/**
	 * Mostra el String que li pasem en una finestra d'alerta
	 * @param s
	 */
	public void alert(String s) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(s);
		alert.show();
	}
}
