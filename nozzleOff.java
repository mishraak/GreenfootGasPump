/**
 * Write a description of class nozzleOff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nozzleOff implements IGasMachineState  
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class nozzleOff
     */
     GasPumpWorld world;
    
    public nozzleOff(GasPumpWorld obj){
        this.world = obj;
    }
    
    public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    
    public String getMessage(){
        return "nozzleOff";
    }
}
