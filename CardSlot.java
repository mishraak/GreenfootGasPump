import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class CardSlot extends Actor 
{

    public void act() 
    {       
      MouseInfo minfo=Greenfoot.getMouseInfo();
      OriginalCard oCard = (OriginalCard) getOneIntersectingObject(OriginalCard.class);
      DuplicateCard dCard = (DuplicateCard) getOneIntersectingObject(DuplicateCard.class);

       List objects = getWorld().getObjects(displaymessage.class);
      GasPumpWorld obj = (GasPumpWorld)this.getWorld();
        displaymessage d  = (displaymessage) getOneObjectAtOffset(350,100,null);
        
        CardInserted cardInserted = new CardInserted(obj);
          
         //if(Greenfoot.mouseDragged(gpw.getOriginalCard())){
             if(oCard != null){
                if(minfo.getX()>700 && minfo.getX()<800 && minfo.getY()>125 && minfo.getY()<200)
                {                          
                    getWorld().removeObject(oCard);
                    Greenfoot.playSound("swipe.wav");
                    obj.setState(cardInserted);
                    
                    
                    
                    /*
                    
                MouseInfo mouse = Greenfoot.getMouseInfo();
                if (Greenfoot.mouseClicked(null))
                {
                if (mouse.getX() >= 225 &&
                mouse.getX() <= 275 &&
                mouse.getY() >= 375 &&
                 mouse.getY() <= 425)
                {
                    displaymessage d = new displaymessage("1");
                }
}

                    
                    
                    
                    */
                }  
             }
             
             if(dCard != null){
                if(minfo.getX()>700 && minfo.getX()<800 && minfo.getY()>125 && minfo.getY()<200)
                {                          
                    getWorld().removeObject(dCard);
                    obj.removeObjects(objects);
                    displaymessage de = new displaymessage("Duplicate credit card.\n Please try again.");
                    getWorld().addObject(de,350,200);
                    Greenfoot.delay(120);
                    getWorld().removeObject(de);
                    obj.setState(new StateAdvt(obj));
                                      
                }  
             }
        //}
        
    }    
}
