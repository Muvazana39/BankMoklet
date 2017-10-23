/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokletbank;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author ChaVaZaSRL
 */
public class FXMLDocumentController implements Initializable {

    String PIN11 = "123456";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private JFXButton btn1;
    @FXML
    private JFXButton btn2;
    @FXML
    private JFXButton btn3;
    @FXML
    private JFXButton btn4;
    @FXML
    private JFXButton btn5;
    @FXML
    private JFXButton btn6;
    @FXML
    private JFXButton btn7;
    @FXML
    private JFXButton btn8;
    @FXML
    private JFXButton btn9;
    @FXML
    private JFXButton btnc;
    @FXML
    private JFXButton btn0;
    @FXML
    private JFXButton btnok;
    @FXML
    private JFXPasswordField pin;
    
    public String PinNumb;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        PinNumb = "";
    }    

    @FXML
    private void tekan1(ActionEvent event) {
        if(pin.getText().length() <= 5){
            PinNumb += "1";
        }
        pin.setText(PinNumb);
    }

    @FXML
    private void tekan2(ActionEvent event) {
        if(pin.getText().length() <= 5){
            PinNumb += "2";
        }
        pin.setText(PinNumb);
    }

    @FXML
    private void tekan3(ActionEvent event) {
        if(pin.getText().length() <= 5){
            PinNumb += "3";
        }
        pin.setText(PinNumb);
    }

    @FXML
    private void tekan4(ActionEvent event) {
        if(pin.getText().length() <= 5){
            PinNumb += "4";
        }
        pin.setText(PinNumb);
    }

    @FXML
    private void tekan5(ActionEvent event) {
        if(pin.getText().length() <= 5){
            PinNumb += "5";
        }
        pin.setText(PinNumb);
    }

    @FXML
    private void tekan6(ActionEvent event) {
        if(pin.getText().length() <= 5){
            PinNumb += "6";
        }
        pin.setText(PinNumb);
    }

    @FXML
    private void tekan7(ActionEvent event) {
        if(pin.getText().length() <= 5){
            PinNumb += "7";
        }
        pin.setText(PinNumb);
    }

    @FXML
    private void tekan8(ActionEvent event) {
        if(pin.getText().length() <= 5){
            PinNumb += "8";
        }
        pin.setText(PinNumb);
    }

    @FXML
    private void tekan9(ActionEvent event) {
        if(pin.getText().length() <= 5){
            PinNumb += "9";
        }
        pin.setText(PinNumb);
    }

    @FXML
    private void tekan0(ActionEvent event) {
        if(pin.getText().length() <= 5){
            PinNumb += "0";
        }
        pin.setText(PinNumb);
    }
    
    @FXML
    private void tekanC(ActionEvent event) {
        PinNumb = "";
        pin.setText(PinNumb);
    }

    @FXML
    private void proses(ActionEvent event) {
        if(PinNumb.equals(PIN11)){
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLHome.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Bank Moklet");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
        else{
            kesempatan -= 1;
            JOptionPane.showMessageDialog(null, "Pin Anda Salah \nTersisa = "+kesempatan+" Kesempatan Lagi");
            pin.setText("");
            PinNumb = "";
            if(kesempatan == 0){
                System.exit(0);
            }
        }
    }
}
