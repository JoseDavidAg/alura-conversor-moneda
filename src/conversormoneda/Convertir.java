/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversormoneda;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.URI;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ambro
 */


public class Convertir {
    private String key= "fe6d1170a0c45cc44c7dafd5";
    private String link= "https://v6.exchangerate-api.com/v6/"+key+"/pair/";

    
    
    
    public void buscarAPI(String base, String conve, float valor){
        
        
         Gson gson = new GsonBuilder().setFieldNamingPolicy(
                 FieldNamingPolicy.IDENTITY).setPrettyPrinting().create(); //seguir la convención de nombres camelCase
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()   
         .uri(URI.create(link+base+"/"+conve))
         .build();
    
        try {
            HttpResponse<String> response = client
                    .send(request, BodyHandlers.ofString());
            System.out.println(response.body());
            String json= response.body();
            ConversionDto conversion= gson.fromJson(json,ConversionDto.class);
            Conversion conv = new Conversion(conversion);
            String sf = String.format("%.2f",conv.getValor()*valor );
            System.out.println("El valor "+valor+"["+base+"] corresponde al valor final de ==> "+sf+" ["+conve+"]");
        } catch (IOException ex) {
            Logger.getLogger(Convertir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Convertir.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
       

    }
}

