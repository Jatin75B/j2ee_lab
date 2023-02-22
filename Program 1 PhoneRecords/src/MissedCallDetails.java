import java.util.Calendar;

public class MissedCallDetails {

	Calendar cal;
	long telno;
	String name;
	public MissedCallDetails( long telno, String name) {
		cal = Calendar.getInstance();
		this.telno = telno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "MissedCallDetails [cal=" + cal.getTime() + ", telno=" + telno + ", name=" + name + "]";
	}
	
}
