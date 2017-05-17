/**
 * Write a description of class timeCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timeCalc  
{
    // instance variables - replace the example below with your own
    private long startTime;
    private long endTime;

    /**
     * Constructor for objects of class timeCalc
     */
    public timeCalc()
    {
        startTime=0;
        endTime = 0;
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
    
    public long getDuration()
    {
        long time_elapsed = getEndTime() - getStartTime();
        return time_elapsed;
    }
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
}
