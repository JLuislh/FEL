/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.test;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.Properties;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

/**
 *
 * @author jluis
 */
public class ObtenerToken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       String res = "";
       String URL = "https://felgttestaws.digifact.com.gt/gt.com.apinuc/api/login/get_token";
        
        try {
            Client client = ClientBuilder.newClient();
            
            WebTarget target = client.target(URL );
            Invocation.Builder solicitud = target.request();
            
            Token req = new Token();
            req.setUsername("GT.000120011662.TESTUSER");
            req.setPassword("Coast$cm86");
            
            Gson gson = new Gson();
            String jsonString = gson.toJson(req);
            System.out.println("convierte a json "+jsonString);
            Response post = solicitud.post(Entity.json(jsonString));
            String resJson = post.readEntity(String.class);
            res = resJson;
            
            
            String fichero = "";
            fichero = resJson;
            Properties properties = gson.fromJson(fichero, Properties.class);
            System.out.println("SOLO TOKEN= "+properties.get("Token"));
            System.out.println("SOLO FECHA= " + properties.get("expira_en"));
 

           System.out.println("Estatus: " + post.getStatus());
           res = switch (post.getStatus()) {
               case 200 -> resJson;
               default -> "Error";
           };
        } catch (JsonSyntaxException e) {
            System.out.println("ERROR" );res = e.toString();
        }
        
         System.out.println("TRAE TODO = "+res);
         
        
    }
    
}
