

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GroundTransportation.
 *
 * @author  POO
 * @version 03/2024
 */
public class GroundTransportation extends Transport{
    private String licensePlate;
    
    public GroundTransportation(String licensePlate){
        super();
        this.licensePlate = licensePlate;
        super.setFees(3);
        
    } 
    
     public String getLicensePlate(){
        return licensePlate;
    }
   
    public void setLicensePlate(String newLicensePlate){
        if(newLicensePlate !=null){
           licensePlate= newLicensePlate;
        }
    }

}