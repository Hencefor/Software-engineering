package operation3;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private String name;
	private String Id;
	private String email;
	private boolean acstate;
	 int counter=0;
	private boolean usState;
//	private long a;
//	private long b;
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
	
	public void setAcState(boolean acstate)
	{
		this.acstate=acstate;
	}
	
	public void setUsState(boolean ustate)
	{
		this.usState=usState;
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
		
		return acstate;
	}
	
	public boolean getUsState()
	{
		return usState;
	}
	
	public int getCounter()
	{
		
		return counter;
	}
	
//	public void pick(long a)/*取车时，记录系统时间并存到a中*/
//	{
//		Date time= new Date(a);
//		this.a=a;
//	}
//	
//	public long Timeuse(long k)/*还车时，记录系统时间，计算时间间隔并返回时间间隔*/
//	{
//		b=a-k;
//		Date time= new Date(a-k);
//		return b;
//	}
	

}
