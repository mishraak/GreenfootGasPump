import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class holder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class holder extends Actor
{
    /**
     * Act - do whatever the holder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
            MouseInfo mouseInfo = Greenfoot.getMouseInfo();
            Nozzle N1 = (Nozzle) getOneIntersectingObject(Nozzle.class);
            GasPumpWorld obj = (GasPumpWorld)this.getWorld();
            nozzleOff nozOff = new nozzleOff(obj);
            String state = obj.getState().getMessage().toString();
            if(N1 !=null )
            {
            if(state.equalsIgnoreCase("fillingTank") && mouseInfo.getX() > 660 && mouseInfo.getX()< 1050 && mouseInfo.getY()>441 && mouseInfo.getY()<590)
                {
                obj.setState(nozOff);
                
            }
        }
    }    
}
