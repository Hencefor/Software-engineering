package operation3;

/**

 * This class contains static method to save and fetch user's information
 */
import java.io.*;
import java.util.ArrayList;


public class FileOpe{/*传一个user对象，把它存入文件UserInfor*/
	
	public static void temptest()/*用于最开始加入种子用户，后期可改善*/
	{
		User b=new User();
		b.setId("123");
		b.setEmail("123@qq");
		b.setAcState(false);
		b.setUsState(false);
		b.counter=0;
		try {
			FileOutputStream fs= new FileOutputStream("UserInfor.ser");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			
				os.writeObject(b);
			
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
	
	
	public static void viewUser() /*查看所有用戶信息*/
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
					System.out.println("id="+ b.getId()+"\nemail="+b.getEmail()+"\nstate="+b.getAcState()+"\nus="+b.getUsState()+"\nac="+b.getAcState()+"\n"+b.counter);
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
	
	public static void addUser(User a) /*注册一个用户*/
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
		ArrayList<User> a= new ArrayList<User>();/*将文件中所有对象存入链表*/
		try {
			FileInputStream fileStream= new FileInputStream("UserInfor.ser");
			ObjectInputStream os= new ObjectInputStream(fileStream);
			User head =null;
			try {
				
					while((head=(User)os.readObject())!=null) {
						a.add(head);
					}/*ATTENTION！！！！！ You can not write anything between this line and catchEOF*/
					
					
					
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
						System.out.println(i);
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
		ArrayList<User> temp= fetchAllUsers();
		deleteUser(a);/*delete user a*/
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
