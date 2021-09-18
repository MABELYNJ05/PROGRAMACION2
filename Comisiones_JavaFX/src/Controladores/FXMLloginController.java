/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Datos.ClsUsuario;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import modelos.*;

/**
 * FXML Controller class
 *
 * @author mjber
 */
public class FXMLloginController implements Initializable {

    @FXML
    private TextField textUsername;
    @FXML
    private TextField textPass;
    @FXML
    private Button buttonIngresar;
    @FXML
    private TextField text1;
    @FXML
    private TextField text2;
    @FXML
    private Button buttonAceptar;
    @FXML
    private ComboBox<?> comboboxDB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void eventKey(KeyEvent event) {
         Object ev=event.getSource();
        if(ev.equals(textUsername)){
            if(event.getCharacter().equals(" ")){
                event.consume();
            }
        }else if(ev.equals(textPass)){
            if(event.getCharacter().equals(" ")){
                event.consume();
            }            
        }else if(ev.equals(text1)){
            if(event.getCharacter().equals(" ")){
                event.consume();
            }            
        }else if(ev.equals(text2)){
            if(event.getCharacter().equals(" ")){
                event.consume();
            }            
        }      
    }

    @FXML
    private void buttonAction(ActionEvent event) {
        Object ev=event.getSource();
        if(!textUsername.getText().isEmpty() && !textPass.getText().isEmpty()){
            mdUsuario usu=new mdUsuario();
            ClsUsuario usuario= new ClsUsuario();
            usu.setContraseña(textPass.toString());
            usu.setUsername(textUsername.toString());
            
            boolean b=usuario.validacion(usu);
            
            if(b==true){
                System.out.println("hola");
            }else{
                System.out.println("NO");
            }
            
            
        }
    }

    @FXML
    private void ButtonAceptar(ActionEvent event) {
    }
    
}
