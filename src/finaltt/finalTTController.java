/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltt;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Shiv
 */
public class finalTTController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button signinbtn;
    
    @FXML
    private void handleButtonAction1(ActionEvent event) throws IOException {
      //  System.out.println("You clicked me!");
      if(event.getSource()==signinbtn)
      {
          System.out.println("DO UIt");
      }
        Parent root = FXMLLoader.load(getClass().getResource("syDetails.fxml"));
        Scene scene=new Scene(root);
        
        label.setText("Successfully Logged in!");
        Stage stage=new Stage();
        stage.setScene(scene);
        staticLiked.called=true;
        stage.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
