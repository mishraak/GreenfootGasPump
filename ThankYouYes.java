/**
 * Write a description of class ThankYou here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThankYouYes implements IGasMachineState 
{
    // instance variables - replace the example below with your own
    GasPumpWorld world;

   
    public ThankYouYes()
    {
    }

    
    public void enter_pin(GasPumpWorld obj){
        this.world = obj;
    }
    
    public String getMessage(){
        return "ThankYouYes";
    }
}
