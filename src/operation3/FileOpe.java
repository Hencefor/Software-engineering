package operation3;

/**

 * This class contains static method to save and fetch user's information
 */
import java.io.*;
import java.util.ArrayList;


public class FileOpe {/**/
	
	public static void temptest()/**/
	{
		//
		User f = new User();
		User g = new User();
		User d = new User();
		User b=new User();
		User c=new User();
		b.setId("ljw");
		b.setName("ljw");
		b.setEmail("ljw@qq");
		b.setAcState(false);
		b.setUsState(false);
		b.counter=0;
		c.setId("csc");
		c.setName("csc");
		c.setEmail("csc@qq");
		c.setAcState(false);
		c.setUsState(false);
		c.counter=0;
		d.setId("jmd");
		d.setName("jmd");
		d.setEmail("jmd@qq.com");
		d.setAcState(false);
		d.setUsState(false);
		d.counter=0;
		g.setId("qy");
		g.setName("qy");
		g.setEmail("qy@qq.com");
		g.setAcState(false);
		g.setUsState(false);
		g.counter=0;
		f.setId("zhr");
		f.setName("zhr");
		f.setEmail("zhr@qq.com");
		f.setAcState(false);
		f.setUsState(false);
		f.counter=0;
		try {
			FileOutputStream fs= new FileOutputStream("UserInfor.ser");
			ObjectOutputStream os=new ObjectOutputStream(fs);
				
				os.writeObject(b);
				os.writeObject(c);
				os.writeObject(d);
				os.writeObject(f);
				os.writeObject(g);
				
			os.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void viewUser() /*view all user information*/
	{
		ArrayList<User> a= new ArrayList<User>();
		try {
			FileInputStream fileStream= new FileInputStream("UserInfor.ser");
			ObjectInputStream os= new ObjectInputStream(fileStream);
			User head =null;
			try {
					while((head=(User)os.readObject())!=null) {
					a.add(head);
					}	
				}
					catch(EOFException e) {}
					os.close();
			for(User b: a)
				{
					System.out.println("id="+ b.getId()+"\nemail="+b.getEmail()+"\nus="+b.getUsState()+"\nac="+b.getAcState()+"\n"+b.counter);
				}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error1");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("error2");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("error3");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void addUser(User a) /*add a user to file*/
	{
		ArrayList<User> temp=fetchAllUsers();
		temp.add(a);
		try {
			FileOutputStream fs= new FileOutputStream("UserInfor.ser");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			for(User b:temp)
			{
				os.writeObject(b);
			}
			os.flush();
			os.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<User> fetchAllUsers() {/*obtain all users object in file*/
		ArrayList<User> a= new ArrayList<User>();
		try {
			FileInputStream fileStream= new FileInputStream("UserInfor.ser");
			ObjectInputStream os= new ObjectInputStream(fileStream);
			User head =null;
			try {
					while((head=(User)os.readObject())!=null) {
					a.add(head);
					}	
				}
					catch(EOFException e) {}
					os.close();
			/*for(User b: a)
				{
					System.out.println("id="+ b.getId()+"\nemail="+b.getEmail()+"\nstate="+b.getAcState());
				}*/
			return a;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error1");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("error2");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("error3");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static User fetchOneUser(String Id)/*use id to find a user, return that user*/
	{
		int tracker=0;
		User chosen = new User();
		ArrayList<User> temp=fetchAllUsers();
		for(User find : temp)
		{
			//System.out.println("test");
			if((find.getId().equals(Id))==true)
			{
				chosen=find;
				//temp.remove(tracker);
				return chosen;
			}
			tracker=tracker+1;/*find the location of specific user*/
		}
		
		return null;
		
	}
	
	public static void writeFile(ArrayList<User> a)/*receive an arraylist, write it into file*/
	{
		try {
			FileOutputStream fs= new FileOutputStream("UserInfor.ser");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			for(User b:a)
			{
				os.writeObject(b);
			}
			os.flush();
			os.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deleteUser(User del)/*use id to find a user, delete that user*/
	{
		int i=0;
		ArrayList<User> a= new ArrayList<User>();/**/
		try {
			FileInputStream fileStream= new FileInputStream("UserInfor.ser");
			ObjectInputStream os= new ObjectInputStream(fileStream);
			User head =null;
			try {
				
					while((head=(User)os.readObject())!=null) {
						a.add(head);
					}/**/
					
					
					
				}
			catch(EOFException e) {}
					os.close();
					
					for (User find:a) {
						if(find.getId().equals(del.getId()))
						{
							a.remove(find);
							break;
						}
						i++;
						//System.out.println(i);
					}
					writeFile(a);
//					for(User b: a)
//					{
//						System.out.println("id="+ b.getId()+"\nemail="+b.getEmail()+"\nstate="+b.getAcState());
//					}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error1");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("error2");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("error3");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static boolean checkUniqueId(String Id)/*judge the uniqueness of user id*/
	{
		ArrayList<User> temp=fetchAllUsers();
		
		for(User newS : temp)
		{
			//System.out.println("test");
			if((newS.getId().equals(Id))==true)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkUniqueEmail(String email)/*judge the uniqueness of user email*/
	{
		ArrayList<User> temp=fetchAllUsers();
		
		for(User newS : temp)
		{
			if((newS.getEmail().equals(email))==true)
			{
				return false;
			}
		}
		return true;
	}
	
	
	public static void updateUser(User a)/*update a user's information in file*/
	{
		
		deleteUser(a);/*delete user a*/
		ArrayList<User> temp= fetchAllUsers();
		temp.add(a);/*add user a to arraylist*/
		writeFile(temp);/*write the arraylist to file*/
		
		
		
	}
	
	/*public static void main(String[] args)
	{
		User a=new User();
		
		a.setId("csc");
		a.setEmail("csc@bupt");
		a.setAcState(true);
		a.setUsState(true);
		User b=new User();

		b.setId("4asd");
		b.setEmail("asd@bupt");
		b.setAcState(true);
		b.setUsState(true);
		//reg(a);
		fetchUser();
	}*/
}
