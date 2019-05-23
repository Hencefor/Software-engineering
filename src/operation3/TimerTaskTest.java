package operation3;/**
 * 
 */

import java.util.Timer;  

/**   
* @Title:TimerTaskTest
* @Package:  operation3
* @Description: This class used to define the period that the system should be updated. 
* @author Group 88
* @date 2019.05.18
* @version V1.1   
*/
public class TimerTaskTest extends java.util.TimerTask{   
	int i=60;
	
	
	
	/** This method is used to count down the time of the period.
	 *@return void
	 */
    @Override   
    public void run() {   
       // TODO Auto-generated method stub  
    	i=i-1;
    	long stime=System.currentTimeMillis()/1000;
    	if(i<=-1)
    	{
    		
    		System.out.println("Time Out"); 
    		//retrieve
    	}
    		
    	else
       System.out.println("TimeLeft:"+i);   
    	System.out.println("CurrentTime"+stime);
    }   
          
       /* public static void main(String[] args){   
            Timer timer = new Timer();  
            timer.schedule(new TimerTaskTest(), 1000, 1000);   
         
     }  */ 
}   