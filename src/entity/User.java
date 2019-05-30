package entity;
import java.io.Serializable;
import java.util.Date;

/**   
* @Title:User
* @Package: entity
* @Description: This class defines operations of users with the information in the Docks document. 
* @author Group 88
* @date 2019.05.18
* @version V1.0   
*/
public class User implements Serializable{
	private String name;
	private String Id;
	private String email;
	private boolean acState=false;/*account state*/
	 public int counter=0;
	private boolean usState=false;/*Using state*/
	private long pickTime=0;/*pick time*/
	private long dayDuration=0;/*time used in one day*/
//	private long c;
	
	/**
	 * This method is used to set the user's ID.
	 * @param Id
	 */
	public void setId(String Id)
	{
		this.Id=Id;
	}
	/**
	 * This method is used to set the user's name.
	 * @param name
	 */
	public void setName(String name)
	{
		this.name=name;
	}
	/**
	 * This method is used to set the user's email.
	 * @param email
	 */
	public void setEmail(String email)
	{
		this.email=email;
	}
	/**
	 * This method is used to set the user's account state.
	 * @param acState
	 */
	public void setAcState(boolean acState)
	{
		this.acState=acState;
	}
	/**
	 * This method is used to set the user's using state.
	 * @param usState
	 */
	public void setUsState(boolean usState)
	{
		this.usState=usState;
	}
	
	/**
	 * This method is used to make user need to pay for the bill.
	 */
	public void fine()
	{
		this.acState=true;
	}
	/**
	 * This method is used to recover the user's account state.
	 */
	public void pay()
	{
		this.acState=false;
	}
	/**
	 * This method is used to recover the user's using state.
	 */
	public void usingSc()
	{
		this.usState=true;
	}
	/**
	 * This method is used to frozen the using state.
	 */
	public void notUsingSc()
	{
		this.usState=false;
	}
	
	
	/**
	 * This method is used count the number that the user using the scooter.
	 */
	public void Counter()
	{
		counter++;
	}
	/**
	 * This method is used to get the user's ID.
	 * @return String
	 */
	public String getId()
	{
		
		return Id;
	}
	/** 
	 * This method is used to get the user's email.
	 *@return String
	 */
	public String getEmail()
	{
		return email;
	}
	/** 
	 * This method is used to get the user's name.
	 *@return String
	 */
	public String getName()
	{
		return name;
	}
	/** 
	 * This method is used to get the user's account state.
	 *@return boolean
	 */
	public boolean getAcState()
	{
		
		return acState;
	}
	/** 
	 * This method is used to get the user's using state.
	 *@return boolean
	 */
	public boolean getUsState()
	{
		return usState;
	}
	/** 
	 * This method is used to get the number of user using scooter.
	 *@return int
	 */
	public int getCounter()
	{
		
		return counter;
	}
	/**
	 * This method is used to help user to pick a scooter.
	 */
	public void pick()/*when pick up a scooter, the current time will be recorded in pickTime*/
	{
		fine();
		usingSc();
		Date time= new Date();
		long a = time.getTime();
		this.pickTime=a;
	}
	
	/**
	 * This method is used to count the time that user use scooter at one time.
	 * @param k
	 * @return long
	 */
	public long timeuse(long k)/*when return a scooter, this will return the duration of single using*/
	{
		long b=k-pickTime;
		
		return b;
	}
	/**
	 * This method is used to count the time that user use scooter at one time.
	 * @param duration
	 */
	public void addDuration(long duration) /* record daily duration*/
	{
		this.dayDuration=this.dayDuration+duration;
		judgeDuration();
	}
	/**
	 * This method is used to reset the durations of users'.
	 */
	public void resetDayDuration()
	{
		dayDuration=0;
	}
	/**
	 * This method is used to judge if timeout.
	 */
	public void judgeDuration()/*judge if the duration is invalid*/
	{
		if(this.dayDuration > (10000*1000))
		{
			fine();
			
		}
	}

}
