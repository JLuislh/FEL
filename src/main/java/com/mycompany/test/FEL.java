/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.test;

import java.io.IOException;
import org.json.JSONObject;

/**
 *
 * @author jluis
 */
public class FEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FELclas apiClient = new FELclas();
        
        try {
            String apiKey = "TAXID=000000123456&FORMAT=''&USERNAME=TESTUSER";
            String accessToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VyIjoiR1QuMDAwMTIwMDExNjYyLlRFU1RVU0VSIiwiQ291bnRyeSI6IkdUIiwiRW52IjoiMCIsIm5iZiI6MTcxMDUzMjYxOCwiZXhwIjoxNzEzMTI0NjE4LCJpYXQiOjE3MTA1MzI2MTgsImlzcyI6Imh0dHBzOi8vd3d3LmRpZ2lmYWN0LmNvbS5ndCIsImF1ZCI6Imh0dHBzOi8vYXBpbnVjLmRpZ2lmYWN0LmNvbS5kby9kby5jb20uYXBpbnVjIn0.0F3dLLxUvOHA66hCr7FUEwOXllyCla5IZiVN07_wLkk";
            //String endpoint = "your_endpoint";
            String response = apiClient.get(/*endpoint,*/ apiKey, accessToken);
            System.out.println(response);
           
            JSONObject  jsonObject = new JSONObject(response);
            JSONObject object2 = (jsonObject);
            String auto = object2.get("authNumber").toString();
            String lot = object2.get("batch").toString();
            String serie = object2.get("serial").toString();
            System.out.println("No. Autorizacion = "+auto);
            System.out.println("No. Lote = "+lot);
            System.out.println("No. Serie = "+serie);
                //}
             //}

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
        
        
    }
    
}
