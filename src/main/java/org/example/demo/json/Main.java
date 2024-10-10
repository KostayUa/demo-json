package org.example.demo.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.demo.json.model.PurchaseOrder;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            InputStream input = Main.class.getResourceAsStream("/json/purchaseOrder.json");
            PurchaseOrder order = mapper.readValue(input, PurchaseOrder.class);
            System.out.println("Successfully read JSON: " + order);

        } catch (JsonMappingException e) {
            System.err.println("Mapping failed JSON: " + e.getMessage());
        } catch (JsonProcessingException e) {
            System.err.println("Processing failed JSON: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO failed JSON: " + e.getMessage());
        }
    }
}
