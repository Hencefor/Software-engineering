package operation3;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private String name;
	private String Id;
	private String email;
	private boolean acState=false;/*account state*/
	 int counter=0;
	private boolean usState=false;/*Using state*/
	private long pickTime=0;/*pick time*/
	private long dayDuration=0;/*time used in one day*/
//	private long c;
	
	public void setId(String Id)
	{
		this.Id=Id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public void setAcState(boolean acState)
	{
		this.acState=acState;
	}
	
	public void setUsState(boolean usState)
	{
		this.usState=usState;
	}
	
	public void fine()
	{
		this.acState=true;
	}
	
	public void pay()
	{
		this.acState=false;
	}
	
	public void usingSc()
	{
		this.usState=true;
	}
	
	public void notUsingSc()
	{
		this.usState=false;
	}
	
	
	
	public void Counter()
	{
		counter++;
	}
	
	public String getId()
	{
		
		return Id;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getAcState()
	{
		
		return acState;
	}
	
	public boolean getUsState()
	{
		return usState;
	}
	
	public int getCounter()
	{
		
		return counter;
	}
	
	public void pick()/*when pick up a scooter, the current time will be recorded in pickTime*/
	{
		fine();
		usingSc();
		Date time= new Date();
		long a = time.getTime();
		this.pickTime=a;
	}
//	
	public long timeuse(long k)/*when return a scooter, this will return the duration of single using*/
	{
		long b=k-pickTime;
		
		return b;
	}
	public void addDuration(long duration) /* record daily duration*/
	{
		this.dayDuration=this.dayDuration+duration;
		judgeDuration();
	}
	public void judgeDuration()/*judge if the duration is invalid*/
	{
		if(this.dayDuration > 7200000)
		{
			fine();
		}
	}

}
