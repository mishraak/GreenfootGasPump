/**
 * Write a description of class nozzleOn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nozzleOn  implements IGasMachineState
{
    // instance variables - replace the example below with your own
    GasPumpWorld world;
    
    public nozzleOn(GasPumpWorld obj){
        this.world = obj;
    }
    
    public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    
    public String getMessage(){
       
        return "nozzleOn";
    }
}
