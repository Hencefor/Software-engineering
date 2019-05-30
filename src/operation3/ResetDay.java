package operation3;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import control.FileOpe;
import entity.User;

/**   
* @Title:ResetDay
* @Package:  operation3
* @Description: This class used to operation the system update when the time of the period is timeout. 
* @author Group 88
* @date 2019.05.18
* @version V1.1   
* @see control.FileOpe
* @see entity.User
*/
public class ResetDay {   
    private final Timer timer = new Timer();
    private final static long DELAY_TIME=30 * 1000;//
    private final static long PERIO_TIME=30 * 1000;//execute each 60s
    /** 
     * This method is used to start the operation of update.
	 */
    public void start() { 
       timer.schedule(new SendMsgTask(), DELAY_TIME,PERIO_TIME);
    } 
    /**
     * This is the main method, which used to reset the date of system.
     * @param args
     * @throws InterruptedException
     */
   public static void main(String[] args) throws InterruptedException { 
       ResetDay test = new ResetDay(); 
       test.start();
       
    }
}

/**   
* @Title SendMsgTask
* @Description: This class used to send the message to users through their email. 
* @author Group 88
* @date 2019.05.18
* @version V1.1   
*/
class SendMsgTask extends TimerTask{
    private static int i=0;
    /**
     * This method is used to start the operation of send messages.
     */
    public void run() { 
        sendMsg();
    } 
    /**
     * This method is used to send messages.
     */
    private void sendMsg() {
    	ArrayList<User> a= new ArrayList<User>();
    	a=FileOpe.fetchAllUsers();
    	for(User temp:a)
    	{
    		temp.resetDayDuration();
    		FileOpe.updateUser(temp);
    	}
    	System.out.println("clear");
    } 
}