/**
 * Write a description of class finalState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class finalState implements IGasMachineState 
{
    GasPumpWorld world;

    // instance variables - replace the example below with your own
    public finalState()
    {
    }

    
   public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    public String getMessage(){
        return "finalState";
    }
}
