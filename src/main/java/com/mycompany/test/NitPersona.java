/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 *
 * @author jluis
 */
public class NitPersona {

    public static void main(String[] args) {
      
        RestApiClient apiClient = new RestApiClient();
        
        try {
            String apiKey = "TAXID=000044653948&DATA1=SHARED_GETINFONITcom&DATA2=NIT|44653948&COUNTRY=GT&USERNAME=JULIOCIF";
            String accessToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VyIjoiR1QuMDAwMTIwMDExNjYyLlRFU1RVU0VSIiwiQ291bnRyeSI6IkdUIiwiRW52IjoiMCIsIm5iZiI6MTcxMDUzMjYxOCwiZXhwIjoxNzEzMTI0NjE4LCJpYXQiOjE3MTA1MzI2MTgsImlzcyI6Imh0dHBzOi8vd3d3LmRpZ2lmYWN0LmNvbS5ndCIsImF1ZCI6Imh0dHBzOi8vYXBpbnVjLmRpZ2lmYWN0LmNvbS5kby9kby5jb20uYXBpbnVjIn0.0F3dLLxUvOHA66hCr7FUEwOXllyCla5IZiVN07_wLkk";
            String endpoint = "your_endpoint";

            String response = apiClient.get(endpoint, apiKey, accessToken);
            System.out.println(response);
            
            JSONObject  jsonObject = new JSONObject(response);
            JSONArray arrayObject = (JSONArray) jsonObject.get("RESPONSE");
             for (int i = 0; i < arrayObject.length(); i++) {
                if (i == 0) {
            JSONObject object2 = (JSONObject) arrayObject.get(i);
            String tipoFiltro = object2.get("NOMBRE").toString();
            System.out.println("QUE MIERDA IMPRIME= "+tipoFiltro);
                }
             }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
