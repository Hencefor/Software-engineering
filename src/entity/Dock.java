package entity;
import java.io.Serializable;

/**   
* @Title:Dock
* @Package: entity
* @Description: This class defines operations of Docks with the information in the Docks document. 
* @author Group 88
* @date 2019.05.18
* @version V1.0   
*/
public class Dock implements Serializable{
	
	//boolean[] latch= {true,true,true,true,true,false,false,false};
	boolean[] latch= {true,true,true,true,true,false,false,false};
	int i;
	public String dockId;
	
	/** This is the first method, used to check the first full latch and release the latch at the position and return the position.
	 *@return int
	 */
	public int releaseScooter()/*turn one latch to false if there is a latch has scooter(in order),return the position of latch */
	{
		int position=1;
		
		try {
			while(position<=8)
			{
				
				if(latch[position-1]==true)
				{
					latch[position-1]=false;
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
	
	/** This is the second method, used to check the first full latch position.
	 *@return int
	 */
	public int returnPositionPick()
	{
		int position=1;
		
		try {
			while(position<=8)
			{
				
				if(latch[position-1]==true)
				{
					return position;
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
		
	/** This is the third method, used to check the first empty latch position.
	 *@return int
	 */
		public int returnPositionReturn()
		{
			int position=1;
			
			try {
				while(position<=8)
				{
					
					if(latch[position-1]==false)
					{
						return position;
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
		
	/** This is the forth method, used to check the first empty latch and lock the latch at the position and return the position.
	 *@return int
	 */
	public int retrieveScooter()/*turn one latch to true if there is a empty latch, return the postion of the latchf*/
	{
		int position=1;
		try {
			while(position<=8)
			{
				if(latch[position-1]==false)
				{
					latch[position-1]=true;
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
	
	/** This is the fifth method, used to scan all the latches in the dock.
	 *@return void
	 */
	public void scan()
	{
		
	}
	
	/** This is the sixth method, used to check is there any scooter in the dock.
	 *@return boolean
	 */
	public boolean isEmpty()/*if empty return false, else return true*/
	{
		int count=0;
		for(i=0;i<8;i++)
		{
			if(latch[i]==false)
			{
				count++;
			}
		}
		if(count==8)
		{
			return true;
		}
		else if(count<8&&count>=0)
		{
			return false;
		}
		return false;
	}
	
	/** This is the seventh method, used to check are all latches in the dock are full with the scooters.
	 *@return boolean
	 */
	public boolean isFull()/*if full, return true, else return false*/
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
	
	/** This is the eighth method, used to check the number of the latch.
	 *@return int
	 */
	public int numOflatch()
	{
		return latch.length;
	}
	
	/** This is the ninth method, used to check the number of scooters in the dock.
	 *@return int
	 */
	public int numOfSco()
	{
		int count=0;
		for(int i=0;i<8;i++)
		{
			if(latch[i]==true)
			{
				count++;
			}
		}
		return count;
	}
	
	/** This is the main method, which is used to create a dock.
	 *@param args 
	 */
	public static void main(String[] args)
	{
		Dock a = new Dock();
		System.out.println(a.isEmpty()+""+a.isFull()+""+a.releaseScooter());
	}
}



