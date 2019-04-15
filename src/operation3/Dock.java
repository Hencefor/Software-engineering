package operation3;
public class Dock {
	
	//boolean[] latch= {true,true,true,true,true,false,false,false};
	boolean[] latch= {false,true,true,true,true,true,true,true};
	int i;
	String dockId;
	
	public int releaseScooter()
	{
		int position=0;
		
		try {
			while(position<=8)
			{
				
				if(latch[position]==true)
				{
					latch[position]=false;
					break;
				}
				position++;
				
			}
		}
		
		catch(Exception e)
		{
			System.out.println("error in release");
			return -1;
		}
		return position;
		
	}
	public int retrieveScooter()
	{
		int position=0;
		try {
			while(position<=8)
			{
				if(latch[position]==false)
				{
					latch[position]=true;
					break;
				}
				position++;
			}
		}
		catch(Exception e)
		{
			System.out.println("error in retrieve");
			return -1;
		}
		
		
		return position;
	}
	
	public void scan()
	{
		
	}
	public boolean isEmpty()
	{
		int count=0;
		for(i=0;i<8;i++)
		{
			if(latch[i]==false)
			{
				count++;
			}
		}
		if(count<=8 && count>0)
		{
			return true;
		}
		else if(count==0)
		{
			return false;
		}
		return false;
	}
	
	public boolean isFull()
	{
		int count=0;
		for(i=0;i<8;i++)
		{
			if(latch[i]==true)
			{
				count++;
			}
		}
		if(count==8)
		{
			return true;
		}
		else if(count<8)
		{
			return false;
		}
		return false;
	}

	
	public static void main(String[] args)
	{
		Dock a = new Dock();
		System.out.println(a.isEmpty()+""+a.isFull()+""+a.releaseScooter());
	}
}



