

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
    
    @Override
    public double getPriceWithFees(){
        return super.getPriceWithFees();    
    }
    
    @Override
    public String getTransportType(){
        return "Transporte Terreste";
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Matricula", this.licensePlate));
        
        return sb.toString();
    }
}