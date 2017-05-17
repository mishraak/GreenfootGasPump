/**
 * Write a description of class receiptState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class receiptState  implements IGasMachineState
{
    // instance variables - replace the example below with your own
    // instance variables - replace the example below with your own
     GasPumpWorld world;

    /**
     * Constructor for objects of class YellowFuel
     */
    public receiptState()
    {
    }


   
    public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    public String getMessage(){
        return "receiptState";
    }
}
