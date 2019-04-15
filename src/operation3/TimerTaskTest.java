package operation3;/**
 * 
 */

import java.util.Timer;         
public class TimerTaskTest extends java.util.TimerTask{   
	int i=60;
	
	
	
	
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