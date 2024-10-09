package purchase_order;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            PurchaseOrder order = mapper.readValue(new File("src/main/java/json/purchaseOrder.json"),
                    PurchaseOrder.class);
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
