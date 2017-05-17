import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Nozzle extends Actor{
    
    int nozzleType;
    static GreenfootImage[] images = {new GreenfootImage("red-nozzle.png"), new GreenfootImage("yellow-nozzle.png")}; 
    int mX, mY ;
    GasPumpWorld obj = (GasPumpWorld)this.getWorld();
     
    
    public Nozzle(int type){
        nozzleType=type;
        setImage(images[type]); 
    }
    
    public void act() {
              int nX,nY;
              boolean touch = false;
              
              nozzleOn nozOn = new nozzleOn(obj);
              nozzleOff nozOff = new nozzleOff(obj);
    if(Greenfoot.mouseDragged(this)){
                  MouseInfo m = Greenfoot.getMouseInfo();
                  nX= m.getX();
                  nY = m.getY();
                  setLocation(nX,nY);
    }
    
    
    
   /*if( != null)
    {
    if(isTouching(car.class))
    {
        obj.setState(nozOn);
       
    }
    else
    {
        obj.setState(nozOff);
    }
}*/
    

    
    
   
    
}
}
    
    
    
    


   

