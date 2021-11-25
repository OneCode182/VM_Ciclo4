/** < - - - - - - - - { G3 - Sergio Silva } - - - - - - - - > */

package usa.ciclo4.reto2.models;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "products")
public class Product {
    
    @Id
    private Integer id;
    
    private String brand;
    private String procesor;
    private String os;
    private String description;
    private String memory;
    private String hardDrive;
    private boolean availability;
    private double price;
    private int quantity;
    private String photography;
    
    
    public boolean getAvailability() {
        return this.availability;
    }
    
}

