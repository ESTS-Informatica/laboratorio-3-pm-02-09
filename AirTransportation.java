

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AirTransportationTest.
 *
 * @author  POO
 * @version 03/2024
 */

public class AirTransportation extends Transport {
    private String name;
    private int numberOfContainers;
     public AirTransportation(String name,int numberOfContainers){
       
        super();
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        super.setFees(4);
        
    } 
    
    public String getName(){
        return name;
    }
   
    public void setName(String newName){
        if(name !=null){
           name= newName;
        }
    }
    
    public int getNumberOfContainers(){
        return numberOfContainers;
    }
    
    public void setNumberOfContainers(int newNumberOfContainers){
        if(newNumberOfContainers >= 0){
            numberOfContainers = newNumberOfContainers;
        }
    }
    
}