
/**
 * Write a description of class larry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Van extends GroundTransportation{

    private int packages;
    
    public Van(String licensePlate,int packages){
        super(licensePlate);
        this.packages = packages;     
        
    } 
    
    public int getPackages(){
        return packages;
    }
    
    public void setPackages(int packages){
       this.packages = packages;
    }
    
    @Override
    public String toString(){
         
        final StringBuilder sb = new StringBuilder();
         sb.append(super.toString());
        sb.append(String.format("%25s: %4.2f%%\n", "numero de pacotes", (double)this.packages));
       
               
        return sb.toString();
     
    }
}