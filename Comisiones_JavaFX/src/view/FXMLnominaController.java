/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author mjber
 */
public class FXMLnominaController implements Initializable {

    @FXML
    private TextField textNombre;
    @FXML
    private TextField textEnero;
    @FXML
    private TextField textFebrero;
    @FXML
    private TextField textMarzo;
    @FXML
    private Button buttonIngresoDt;
    @FXML
    private TextField textCantidadBus;
    @FXML
    private TextField textId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void eventKeyNum(KeyEvent event) {
        Object evt = event.getSource();
        
        if(evt.equals(textEnero)){
            if(Character.isDigit(event.getCharacter().charAt(0))){
                
            }
        }
        
    }

    @FXML
    private void ButtonIngresoDatos(ActionEvent event) {
    }
    
}
