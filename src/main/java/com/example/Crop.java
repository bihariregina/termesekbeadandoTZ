/*
* File: Crop.java
* Author: Bihari Regina
* Copyright: 2026, Bihari Regina
* Group: Szoft I
* Date: 2026-05-25
* Github: 
* Licenc: MIT
*/
 

package com.example;

import java.time.LocalDate;

public class Crop {
    private int id;
    private String name;
    private String slope;
    private int quantity;
    private LocalDate harvestDate;
    
    public Crop() {
    }
    public Crop(int id, String name, String slope, int quantity, LocalDate harvestDate) {
        this.id = id;
        this.name = name;
        this.slope = slope;
        this.quantity = quantity;
        this.harvestDate = harvestDate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSlope() {
        return slope;
    }
    public void setSlope(String slope) {
        this.slope = slope;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public LocalDate getHarvestDate() {
        return harvestDate;
    }
    public void setHarvestDate(LocalDate harvestDate) {
        this.harvestDate = harvestDate;
    }
    @Override
    public String toString() {
        return "Crop [id=" + id + ", name=" + name + ", slope=" + slope + ", quantity=" + quantity + ", harvestDate="
                + harvestDate + "]";
    }

    
}
