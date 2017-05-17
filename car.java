import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Actor
{
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int counter = 0;
    public void act() 
    {
        // Add your action code here.
        MouseInfo mouseInfo = Greenfoot.getMouseInfo();
    Nozzle N1 = (Nozzle) getOneIntersectingObject(Nozzle.class);
    GasPumpWorld obj = (GasPumpWorld)this.getWorld();
    nozzleOn nozOn = new nozzleOn(obj);
    String state = obj.getState().getMessage().toString();
        if(N1 !=null)
        {
            if((state.equalsIgnoreCase("redFuel") || state.equalsIgnoreCase("yellowFuel")) && mouseInfo.getX() > 510 && mouseInfo.getX()< 600 && mouseInfo.getY()>34 && mouseInfo.getY()<150)
            {
                obj.setState(nozOn);
                
                
                    
            }
        }
   
        
    }
       
}
