import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
        
        static GreenfootImage[] images = {new GreenfootImage("Zero.png"), 
                                          new GreenfootImage("one.png"),
                                          new GreenfootImage("two.png"),
                                          new GreenfootImage("three.png"),
                                          new GreenfootImage("four.png"),
                                          new GreenfootImage("five.png"),
                                          new GreenfootImage("six.png"),
                                          new GreenfootImage("seven.png"),
                                          new GreenfootImage("eight.png"),
                                          new GreenfootImage("Nine.png"),
                                          new GreenfootImage("Star.png"),
                                          new GreenfootImage("Hash.png"),
                                          new GreenfootImage("yes.png"),
                                          new GreenfootImage("No.png"),
                                          new GreenfootImage("Help.png"),
                                          new GreenfootImage("Cancel.png")                                           
                                        }; 
        int id;
        public Button(int id){
            this.id=id;
            setImage(images[id]);
        }
    
    
    public void act() 
    {
           
            GasPumpWorld obj = (GasPumpWorld)this.getWorld();
            String state = obj.getState().getMessage().toString();
            
            
                    if (Greenfoot.mouseClicked(this)) {
                if(this.id==14){
                    obj.setState(new Help(obj));
                    state = obj.getState().getMessage().toString();
                    
                }
                if(this.id == 15) {
                     obj.setState(new Cancel(obj));
                     
                }
                else if(state.equalsIgnoreCase("finalState") && this.id == 12)
                {
                    
                   
                    obj.setState(new carWashYes());
                }
                else if(state.equalsIgnoreCase("finalState") && this.id == 13)
                {
                    obj.setState(new receiptState());
                }
                else if(state.equalsIgnoreCase("interState") && this.id == 12)
                {
                    obj.setState(new ThankYouYes());
                }
                 else if(state.equalsIgnoreCase("interState") && this.id == 13)
                {
                    obj.setState(new ThankYouNo());
                }
                else if(state.equalsIgnoreCase("receiptState") && this.id == 12)
                {
                    obj.setState(new ThankYouYes());
                }
                else if(state.equalsIgnoreCase("receiptState") && this.id == 13)
                {
                    obj.setState(new ThankYouNo());
                }
                
                else if(this.id>9 && this.id<14){
                    Greenfoot.playSound("beep.wav");
                }
                
                
                else{
                switch(state){
                        
                        case "advt": //obj.setState(new CardInserted(obj)); 
                                        break;
                        case "cardInserted": obj.setState(new StateOne(obj)); break;
                        case "one":  obj.setState(new StateTwo(obj)); break;
                        case "two":  obj.setState(new StateThree(obj)); break;
                        case "three":obj.setState(new StateFour(obj)); break;
                        case "four": obj.setState(new StateActive(obj));break;
                        
                        case "active" : Greenfoot.playSound("beep.wav");
                                        break;  
                               }
                               
                            }
                         }
      
                        }
        
        }

