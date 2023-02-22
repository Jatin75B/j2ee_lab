import java.util.HashMap;

public class DatabasECaller {
	HashMap<Long,String> phBook=new HashMap<Long, String>();
	void createBasic()
	{
		phBook.put(4451151511l, "Person 1");
		phBook.put(4455684211l, "Person 2");
		phBook.put(4853125350l, "Person 3");
		phBook.put(4111211241l, "Person 4");
		
	}
	void del(Long ll){
		String name = phBook.get(ll);
		if(name==null)
			System.out.println("Number not found");
		else{
			phBook.remove(ll);
			System.out.println("Deleted!");
		}
	}
	String find(Long ll){
		String name;
		name=phBook.get(ll);
		if(name==null)
			name="Private Caller";
		return name;
	}
}
