package operation3;
import java.io.*;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args)
	{
		
		//User b=new User();
		//User test=new User();
		//b.setId("2016213515");
		//b.setEmail("caoshencheng@");
		//b.setAcState(false);
		//b.setUsState(false);
		//b.counter=0;
		//b.setName("csc");
		//FileOpe.addUser(b);
		//FileOpe.deleteUser(b);
		//test=FileOpe.fetchOneUser("2016213515");
		//System.out.println(test.getId());
		//FileOpe.temptest();
		//FileOpe.viewUser();
		//Select a = new Select();
		
		Dock A= new Dock();
		A.dockId="A";
		Dock B= new Dock();
		B.dockId="B";
		Dock C= new Dock();
		C.dockId="C";
		
		ArrayList<Dock> create = new ArrayList<Dock>();
		create.add(A);
		create.add(B);
		create.add(C);
		FileOpeDock.writeFileDock(create);
		
//		Dock test;
//		test=FileOpeDock.fetchOneDock("A");
//		test.latch[0]=true;
//		//FileOpeDock.updateDock("A",test);
//		create=FileOpeDock.fetchAllDocks();
//		
		for(Dock temp:create)
		{
			System.out.println(temp.dockId+""+temp.isFull());
//			System.out.println(temp.isFull());
			
		}
		
		
		
	}
}
