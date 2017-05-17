/**
 * Write a description of class ThankYouNo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThankYouNo implements IGasMachineState 
{
    // instance variables - replace the example below with your own
       // instance variables - replace the example below with your own
    GasPumpWorld world;

   
    public ThankYouNo()
    {
    }

    
    public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    public String getMessage(){
        return "ThankYouNo";
    }
}
