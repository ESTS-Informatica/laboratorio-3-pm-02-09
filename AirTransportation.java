

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
    
    @Override
    public double getPriceWithFees(){
        return super.getPriceWithFees();    
    }
    
    
    @Override
    public String getTransportType(){
        return "Transporte Aereo";
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Nome", this.name));
        sb.append(String.format("%25s: %4.2f%%\n", "numero de contentores", (double)this.numberOfContainers));
        return sb.toString();
    }
}