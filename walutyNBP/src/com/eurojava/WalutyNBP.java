/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava; 

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jp
 */
public class WalutyNBP {

    public WalutyNBP() throws IOException {
        loadFile(fileName);
        System.out.println(readFile());
    }

    /**
     * @param args the command line arguments
     */    
    private FileReader fileReader;
    private BufferedReader bufReader;
    private String jakasZmienna;
    private String fileName = "D:\\Katalog\\test.txt";

    
    public void loadFile(String fileName) throws FileNotFoundException {
        fileReader = new FileReader(fileName);
    }
    
    public String readFile() throws IOException {
        BufferedReader brReader = new BufferedReader(fileReader);
        jakasZmienna = brReader.readLine();
        return jakasZmienna;
    }
    
    public static void main(String[] args) throws IOException {
        
        WalutyNBP w = new WalutyNBP();
        
        
    }
}

