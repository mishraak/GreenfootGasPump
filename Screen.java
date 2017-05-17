import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.concurrent.*; 
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen extends Actor 
{
    /**
     * Act - do whatever the Screen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    long startTime = 0;
    long endTime = 0;
    double totalcost=0;
    String fuelType;
    int count;
    
    public void setFirstCount(int k)
    {
        count = k;
    }
    
    public int getFirstCount()
    {
        return count;
    }
    public void setStartTime(long start_time)
    {
        startTime = start_time;
    }
    public long getStartTime()
    {
        return startTime;
    }
    
    public void setEndTime(long end_time)
    {
        endTime = end_time;
    }
    
    public long getEndTime()
    {
        return endTime;
    }
    
    public void setCost(double cst)
    {
        totalcost = cst;
    }
    
    public double getCost()
    {
        return totalcost;
    }
    
    public void setFuelType(String sft)
    {
        fuelType = sft;
    }
    public String getFuelType()
    {
        return fuelType;
    }
    
    public int animated()
    {
        
       
        int i = 900;
        while(i > 510)//cancel
        {
            car Car = new car();
            
             
        getWorld().addObject(Car, i,35);
        Greenfoot.delay(5);
        i = i-10;
        getWorld().removeObject(Car);
        if(i == 510)
        {
            setFirstCount(1);
            return i;
        }
    }
    return i;
    
    }

    public int driveaway()
    {
        
       
        int i = 510;
        while(i > 0)//cancel
        {
            car Car = new car();            
             
        getWorld().addObject(Car, i,35);
        Greenfoot.delay(5);
        i = i-10;
        getWorld().removeObject(Car);
        if(i == 0)
        {
            setFirstCount(2);
            return i;
        }
    }
    return i;
    
    }
    car car2 = new car();
    public void act() 
    {
        
        GasPumpWorld obj = (GasPumpWorld)this.getWorld();
        String state = obj.getState().getMessage().toString();
        displaymessage d  = new displaymessage("");
        List objects = getWorld().getObjects(displaymessage.class);
        
        if(getFirstCount() == 0)
        {
            int j = animated();
        }
        
        getWorld().addObject(car2,510,35);

        
        //timeCalc time = new timeCalc();
        int counter = 0;
        int mX, mY ;
        switch(state){
            
            case "advt":  
                           d = new displaymessage("Welcome !!!");
                           getWorld().addObject(d,350,100);  
                           d = new displaymessage("Please Swipe Your Card");
                           getWorld().addObject(d,350,200);  
                           break;
            case "cardInserted": obj.removeObjects(objects);
                         d = new displaymessage("Credit card scan succcessful.");
                         getWorld().addObject(d,350,100);
                         d = new displaymessage("Enter your Zip code\n\n _ _ _ _ _");
                         getWorld().addObject(d,350,200);  
                                                    
                          break;
            case "one":  
                          d = new displaymessage("Enter your Zip code\n\n * _ _ _ _");
                          getWorld().addObject(d,350,200);  
                          break;
                        
            case "two":   d = new displaymessage("Enter your Zip code\n\n * * _ _ _");
                          getWorld().addObject(d,350,200);  
                          break;
           
            case "three": d = new displaymessage("Enter your Zip code\n\n * * * _ _");
                          getWorld().addObject(d,350,200);  
                          break;
                        
            case "four":  
                          d = new displaymessage("Enter your Zip code\n\n * * * * _");
                          getWorld().addObject(d,350,200);  
                          break;
                        
            case "active": d = new displaymessage("Enter your Zip code\n\n * * * * *");
                          getWorld().addObject(d,350,200);
                           d = new displaymessage("Continue");
                           getWorld().addObject(d,230,280);  
                           d = new displaymessage("Cancel");
                           getWorld().addObject(d,480,280); 
                           break;
             case "fuelSelection": obj.removeObjects(objects);
                         d = new displaymessage("Please Select Fuel Type");
                          getWorld().addObject(d,350,100);
                          d = new displaymessage("Red");
                           getWorld().addObject(d,230,280);  
                           d = new displaymessage("Yellow");
                           getWorld().addObject(d,480,280); 
                           break;
             case "redFuel" :  obj.removeObjects(objects);
                                
                                d = new displaymessage("Please Remove Red Nozzle ");
                               setFuelType("red");
                               getWorld().addObject(d,350,100);
                               d = new displaymessage("Back");
                               getWorld().addObject(d,230,280); 
                              
                           
                                break;
             case "yellowFuel" :  obj.removeObjects(objects);   
                                d = new displaymessage("Please Remove Yellow Nozzle ");
                                setFuelType("yellow");
                          getWorld().addObject(d,350,100);
                          d = new displaymessage("Back");
                           getWorld().addObject(d,230,280);
                          
                          break;
              case "nozzleOn":obj.removeObjects(objects);  
                     setStartTime(System.currentTimeMillis());
                     
                     obj.setState(new fillingTank());
                    
                     d = new displaymessage("fuel nozzle is on... ");
                     getWorld().addObject(d,350,100);
                     break;
                     
               case "Help" : obj.removeObjects(objects);
                              d = new displaymessage("A worker is on the way for help");
                             getWorld().addObject(d,350,100);
                             break;
                            
                     
              case "nozzleOff":obj.removeObjects(objects);   
                
                       
                      setEndTime(System.currentTimeMillis());
                      long stime = getStartTime();
                       long etime = getEndTime();
                   
                      long duration = etime - stime;
                      double cost = 0;
                      double roundOff=0;
                      duration /=1000.0;
                      if(getFuelType().equalsIgnoreCase("red"))
                      {
                           cost = duration * 2.23;
                          roundOff = Math.round(cost * 100.0) / 100.0;
                      }
                      else if(getFuelType().equalsIgnoreCase("yellow"))
                      {
                          cost = duration * 4.23;
                          roundOff = Math.round(cost * 100.0) / 100.0;
                      }
                      
                      
                      
                      d = new displaymessage("The fuel cost you :" + roundOff);
                      getWorld().addObject(d,350,100);
                      setCost(roundOff);
                     obj.setState(new finalState());
                     d = new displaymessage("Do you want a car wash? \n Enter using keypad");
                     getWorld().addObject(d,350,150);
                     
                     
                     
                     break;
                     
                   case "carWashYes":obj.removeObjects(objects);   
                            double price = getCost();
                            price +=10;
                            price = Math.round(price * 100.0)/100.0;
                            setCost(price);
                            obj.setState(new interState());
                            d = new displaymessage("Car wash Code : "+ Math.round(System.currentTimeMillis()/1000000000)+
                            "\nDo you want a receipt?");
                            getWorld().addObject(d,350,250);
                            break;
                          
                case "receiptState":
                            obj.removeObjects(objects);
                            d = new displaymessage("Do you want a car receipt?");
                             getWorld().addObject(d,350,150);
                 break;
                     
                case "ThankYouYes":
                
                              obj.removeObjects(objects);
                                obj.addObject(new Receipt(),700,440);
                                            String costmsg =  "" + getCost();
                                                    d = new displaymessage(costmsg);
                
                    getWorld().addObject(d,720,505);
                         
                d = new displaymessage("Thank You \n Total Amt : "+ costmsg);
                getWorld().addObject(d,350,150);
                getWorld().removeObject(car2);
                if(getFirstCount() == 1)
                {
                    int j = driveaway();
                }
                
                break;
                
                case "ThankYouNo": obj.removeObjects(objects);
                        d = new displaymessage("Thank You");
                        getWorld().addObject(d,350,150);
                        getWorld().removeObject(car2);
                if(getFirstCount() == 1)
                {
                    int j = driveaway();
                }
                          break;
              case "cancel" :  Greenfoot.setWorld(new GasPumpWorld());
                          break;
            
        }
        
    
    
    }
    
 
}
