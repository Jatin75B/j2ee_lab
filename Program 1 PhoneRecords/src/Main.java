import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long ll; String str;
		DatabasECaller con = new DatabasECaller();
		LinkedList<MissedCallDetails> miss = new LinkedList<MissedCallDetails>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Do you want pre made contact:(y/n)");
		String pre=sc.nextLine();
		if(pre.equals("y"))
			con.createBasic();
		System.out.println("Do you want to add contacts:(y/n)");
		String addc=sc.nextLine();
		if(addc.equals("y")){
			System.out.println("how many you want to add contacts:(y/n)");
			int addn=sc.nextInt();
			for (int i = 0; i < addn; i++) {
				System.out.print("Enter the No.: ");
			ll=sc.nextLong();sc.nextLine();
			System.out.print("Enter the Name: ");
			String n=sc.nextLine();
			con.phBook.put(ll, n);
			}
		}
		System.out.println("Contact List:");
		System.out.println(con.phBook);
		
		System.out.println("Menu:");
		System.out.println("1.Missed Call\n2.Display missed call\n3.Delete\n4.exit\n5.Display Number\n");
		
		
		
		
		while(true){
			System.out.println();
			int Choice=sc.nextInt();
			switch (Choice) {
			case 1:
				System.out.print("Enter the Phone No.: ");
				ll = sc.nextLong();
				String c=con.find(ll);
				MissedCallDetails aaa = new MissedCallDetails(ll,c);
				miss.add(aaa);
				System.out.println("Missed call by "+c+" is added to missed call list");
				if(miss.size()==5){
					miss.remove();
					System.out.println("Memory Full... deleting eariler contacts");
				}
				
				break;
				
			case 2:
				int i1=0;
				System.out.println("Missed call Details: ");
				for (Iterator i = miss.iterator(); i.hasNext();) {
					MissedCallDetails missed = (MissedCallDetails) i.next();
					System.out.println(missed);
				}
				break;
				
			case 3:
				
				System.out.print("Deleting the number...\nEnter the Phone No.: ");
				ll = sc.nextLong();
				con.del(ll);
				break;
				
			case 4:
				System.out.println("Ending...");
				System.exit(0);
				
			case 5:
				System.out.println(con.phBook);
			default:
				break;
			}
		}
	}

}
