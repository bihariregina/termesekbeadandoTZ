/*
* File: MainController.java
* Author: Bihari Regina
* Copyright: 2026, Bihari Regina
* Group: Szoft I
* Date: 2026-05-25
* Github: 
* Licenc: MIT
*/
 

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void onClickAboutButton(ActionEvent event) {
        App.setRoot("aboutScene");
    }

    @FXML
    void onClickCropButton(ActionEvent event) {
        App.setRoot("cropScene");
    }

}
