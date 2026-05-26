/*
* File: Storage.java
* Author: Bihari Regina
* Copyright: 2026, Bihari Regina
* Group: Szoft I
* Date: 2026-05-25
* Github: 
* Licenc: MIT
*/
 

package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Storage {
    
    public static List<Crop> readContent() {
        try {
            return tryReadContent();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static List<Crop> tryReadContent() throws FileNotFoundException {
        List<Crop> cropList = new ArrayList<>();
        File file = new File("termes.txt");
        try(Scanner sc = new Scanner(file);){
            sc.nextLine();
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] lineSplit = line.split(":");
                Crop crop = new Crop();
                crop.setId(Integer.parseInt(lineSplit[0]));
                crop.setName(lineSplit[1]);
                crop.setSlope(lineSplit[2]);
                crop.setQuantity(Integer.parseInt(lineSplit[3]));
                crop.setHarvestDate(LocalDate.parse(lineSplit[4]));
                cropList.add(crop);
            }
        }
        
        return cropList;
    }
}