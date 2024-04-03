
/**
 * Write a description of class larry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lorry extends GroundTransportation{

    private int numberOfPallets;
    private int trailers;
    
    public Lorry(String licensePlate,int trailers,int numberOfPallets){
        super(licensePlate);
        this.trailers = trailers;
        this.numberOfPallets = numberOfPallets;     
        
    } 
    
    public int getNumberOfPallets(){
        return numberOfPallets;
    }
    public int getTrailers(){
        return trailers;
    }
    public void setTrailers(int trailers){
        this.trailers = trailers;
        }
    public void setNumberOfPallets(int numberOfPallets){
       this.numberOfPallets = numberOfPallets;
    }
    
    @Override
    public String toString(){
         
        final StringBuilder sb = new StringBuilder();
         sb.append(super.toString());
        sb.append(String.format("%25s: %4.2f%%\n", "atrelados do Camião", (double)this.trailers));
        sb.append(String.format("%25s: %4.2f%%\n", "numero de paletes do Camião", (double)this.numberOfPallets));
               
        return sb.toString();
     
    }
}
