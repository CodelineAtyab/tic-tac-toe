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
        HashMap<String, String> developerRecord = new HashMap<String, String>(); 
        
        developerRecord.put("id", "M324erqwrA");
        developerRecord.put("name", "MrA");
        developerRecord.put("email", "mra@gmail.com");
        
        HashMap<String, String> developerRecord2 = developerRecord;
        
        try (FileWriter writer = new FileWriter("data.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(developerRecord, writer);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
