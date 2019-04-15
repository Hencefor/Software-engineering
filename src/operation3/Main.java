package operation3;
import java.io.*;
public class Main {
	public static void main(String[] args)
	{
		
		User b=new User();
		User test=new User();
		b.setId("2016213515");
		b.setEmail("caoshencheng@");
		b.setAcState(false);
		b.setUsState(false);
		b.counter=0;
		b.setName("csc");
		//FileOpe.addUser(b);
		//FileOpe.deleteUser(b);
		test=FileOpe.fetchOneUser("2016213515");
		System.out.println(test.getId());
		//FileOpe.temptest();
		//FileOpe.viewUser();
		//Select a = new Select();
		
		
		
		
		
	}
}
