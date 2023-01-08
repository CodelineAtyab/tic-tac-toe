/**
 * 
 */
package io.console.tictactoe;

import java.io.FileWriter;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author SyedAtyabHussain
 *
 */
public class TicTacToe {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Staring Application ...");
        System.out.println("Staring Application 222...");
        
    }
    
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    
    public HashMap<String, String> getData(){
        HashMap<String, String> retrievedData = new HashMap<String, String>();
        String statusCode = "FAIL";
        
        // TODO: Get the data from some API like world clock
        // TODO: Assume you already have the data at this point
        statusCode = "SUCCESS";
        
        retrievedData.put("status", statusCode);
        retrievedData.put("data", "<html><h1>Some Data</h1></html>");
        
        return retrievedData;
    }

}
