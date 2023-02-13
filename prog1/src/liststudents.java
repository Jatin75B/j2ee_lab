import java.util.*;

public class liststudents {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		LinkedList<student> ll =new LinkedList<student>();
		System.out.print("Enter the number of students: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Student "+(i+1)+" Details: ");
			System.out.print("Name: ");
			String nam =sc.next();
			System.out.print("USN: ");
			String usn =sc.next();
			System.out.print("Age: ");
			int age =sc.nextInt();
			System.out.print("CGPA: ");
			float f =sc.nextFloat();
			
			student obj = new student(nam,usn,age,f);
			ll.add(obj);
		}
		System.out.println();
		int q=1;
		System.out.println("Student Details: ");
		for (Iterator i = ll.iterator(); i.hasNext();) {
			student s = (student) i.next();
			System.out.println(q+" "+ s);q++;
		}
		
		System.out.println();
		
		q=1;
		System.out.println("Student cgpa>8: ");
		for (Iterator i = ll.iterator(); i.hasNext();) {
			student s = (student) i.next();
			if(s.cgpa>8)
				System.out.println(q+" "+ s);
			q++;
		}
		System.out.println();
		
		q=1;
		System.out.println("Student name with a : ");
		for (Iterator i = ll.iterator(); i.hasNext();) {
			student s = (student) i.next();
			if(s.Name.startsWith("a"))
				System.out.println(q+" "+ s);
			q++;
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Do you want to change the students name:(y /n) ");
		String b=sc.next();
		
		if(b.equals("y")){
			System.out.print("Enter the index of the studnet: ");
			int a= sc.nextInt();
			System.out.print("Enter the name of the student: ");
			ll.get(a).Name=sc.next();
			
	}
		q=1;
		System.out.println("Student Details: ");
		for (Iterator i = ll.iterator(); i.hasNext();) {
			student s = (student) i.next();
			System.out.println(q+" "+ s);q++;
		}
		
	}

}
