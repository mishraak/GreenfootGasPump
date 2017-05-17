/**
 * Write a description of class interState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class interState  implements IGasMachineState
{
    // instance variables - replace the example below with your own
    GasPumpWorld world;
    // instance variables - replace the example below with your own
    public interState()
    {
    }

    
   public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    public String getMessage(){
        return "interState";
    }
}
