package operation3;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import control.FileOpe;
import entity.User;
public class ResetDay {   
    private final Timer timer = new Timer();
    private final static long DELAY_TIME=30 * 1000;//
    private final static long PERIO_TIME=30 * 1000;//execute each 60s
    public void start() { 
       timer.schedule(new SendMsgTask(), DELAY_TIME,PERIO_TIME);
    } 
   public static void main(String[] args) throws InterruptedException { 
       ResetDay test = new ResetDay(); 
       test.start();
       
    }
}
class SendMsgTask extends TimerTask{
    private static int i=0;
    public void run() { 
        sendMsg();
    } 
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