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
        int[] playerScores = new int[2];
        System.out.println("Staring Application ...");
        
    }
    
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    
    public HashMap<String, String> getData(){
        HashMap<String, String> retrievedData = new HashMap<String, String>();
        String returnStatusCode = "FAIL";
        
        // TODO: Get the data from some API like world clock
        // TODO: Assume you already have the data at this point
        returnStatusCode = "SUCCESS";
        
        retrievedData.put("status", returnStatusCode);
        retrievedData.put("data", "<html><h1>Some Data</h1></html>");
        
        return retrievedData;
    }

}
