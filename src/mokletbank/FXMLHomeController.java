/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokletbank;

import com.jfoenix.controls.JFXButton;
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

/**
 * FXML Controller class
 *
 * @author ChaVaZaSRL
 */
public class FXMLHomeController implements Initializable {

    @FXML
    private JFXButton btn50;
    @FXML
    private JFXButton exit;
    @FXML
    private JFXButton back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tekan50(ActionEvent event) {
        
    }

    @FXML
    private void tekan100(ActionEvent event) {
    }

    @FXML
    private void tekan200(ActionEvent event) {
    }

    @FXML
    private void tekan300(ActionEvent event) {
    }

    @FXML
    private void tekan500(ActionEvent event) {
    }

    @FXML
    private void tekan1000(ActionEvent event) {
    }

    @FXML
    private void prosesexit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void back(ActionEvent event) {
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLLogin.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Bank");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
    }
    
}
