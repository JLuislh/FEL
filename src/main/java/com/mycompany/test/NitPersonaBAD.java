/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author jluis
 */
public class NitPersonaBAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String token ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VyIjoiR1QuMDAwMTIwMDExNjYyLlRFU1RVU0VSIiwiQ291bnRyeSI6IkdUIiwiRW52IjoiMCIsIm5iZiI6MTcxMDUzMjYxOCwiZXhwIjoxNzEzMTI0NjE4LCJpYXQiOjE3MTA1MzI2MTgsImlzcyI6Imh0dHBzOi8vd3d3LmRpZ2lmYWN0LmNvbS5ndCIsImF1ZCI6Imh0dHBzOi8vYXBpbnVjLmRpZ2lmYWN0LmNvbS5kby9kby5jb20uYXBpbnVjIn0.0F3dLLxUvOHA66hCr7FUEwOXllyCla5IZiVN07_wLkk";
        try {
    URL url=new URL("https://felgttestaws.digifact.com.gt/gt.com.apinuc/api/Shared");
    HttpURLConnection con=(HttpURLConnection)url.openConnection(); 
    con.setRequestMethod("GET");
    con.setRequestProperty("Authorization",token);
    con.setRequestProperty("TAXID", "000044653948");
    con.setRequestProperty("DATA1", "SHARED_GETINFONITcom");
    con.setRequestProperty("DATA2", "NIT|44653948");
    con.setRequestProperty("COUNTRY", "GT");
    con.setRequestProperty("USERNAME", "JULIOCIF");
    
    int responsecode=con.getResponseCode();
    if(responsecode!=200) {
        System.out.println("Error "+ responsecode);
    }
    else {
        StringBuilder informationstring= new StringBuilder();
        Scanner sc=new Scanner(url.openStream());
        while(sc.hasNext()) {
            informationstring.append(sc.nextLine());
        }
        sc.close();
        //JSONObject dataObject=new JSONObject(String.valueOf(informationstring));
        //System.out.println(dataObject.getJSONArray("types").getJSONObject(0).getJSONObject("type").getString("name"));
    }
} catch (Exception e) {
    e.printStackTrace();
}
    
    }

    
    
}
