package operation3;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private String name;
	private String Id;
	private String email;
	private boolean acState;/*account state*/
	 int counter=0;
	private boolean usState;/*Using state*/
	private long a=0;/*pick time*/
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
	
	public void setAcState(boolean acState)
	{
		this.acState=acState;
	}
	
	public void setUsState(boolean usState)
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
	
	public void pick()/*ȡ��ʱ����¼ϵͳʱ�䲢�浽a��*/
	{
		setAcState(true);
		setUsState(true);
		Date time= new Date();
		long a = time.getTime();
		this.a=a;
	}
//	
	public long Timeuse(long k)/*����ʱ����¼ϵͳʱ�䣬����ʱ����������ʱ����*/
	{
		long b=a-k;
		
		return b;
	}
	

}
