/*
* File: CropCrontroller.java
* Author: Bihari Regina
* Copyright: 2026, Bihari Regina
* Group: Szoft I
* Date: 2026-05-25
* Github: 
* Licenc: MIT
*/
 
package com.example;

import java.time.LocalDate;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CropConrtoller {

    @FXML
    private TableColumn<LocalDate, Crop> cropEnd;

    @FXML
    private TableColumn<String, Crop> cropField;

    @FXML
    private TableColumn<Integer, Crop> cropID;

    @FXML
    private TableColumn<String, Crop> cropName;

    @FXML
    private TableColumn<Integer, Crop> cropQuality;

    @FXML
    private TableView<Crop> cropTable;
     @FXML
    void onClickBackButton(ActionEvent event) {
        
        App.setRoot("mainScene");
    }
    
    @FXML
    void initialize() {
        List<Crop> cropList = Storage.readContent();
        cropID.setCellValueFactory(new PropertyValueFactory<>("id"));
        cropName.setCellValueFactory(new PropertyValueFactory<>("name"));
        cropField.setCellValueFactory(new PropertyValueFactory<>("slope"));
        cropQuality.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        cropEnd.setCellValueFactory(new PropertyValueFactory<>("harvestDate"));

        cropTable.getItems().addAll(cropList);
    }

}
