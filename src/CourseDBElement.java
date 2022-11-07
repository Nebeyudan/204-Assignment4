
public class CourseDBElement implements Comparable<CourseDBElement> {
	// Attributes
	private String ID;
	private int CRN;
	private int credits;
	private String roomNum;
	private String name;
	//constructors
	public CourseDBElement(String courseID, int CRN, int credits, String roomNum, String name) {
		this.ID = courseID;
		this.credits = credits;
		this.CRN=CRN;
		this.roomNum = roomNum;
		this.name = name;
	}
	public CourseDBElement() {
		// TODO Auto-generated constructor stub
	}
	//getters and setters
	public void setCourseID(String courseID) {
		this.ID = courseID;
	}
	public int getCRN() {
		return CRN;
	}
	public void setCRN(int cRN) {
		CRN = cRN;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
		
	}
	
	public int hashCode() {
		String crn = Integer.toString(CRN);
		return crn.hashCode();
	}
	public int compareTo(CourseDBElement o) {
		// TODO Auto-generated method stub
		if(o.getCRN() > this.getCRN()) {
			return 1;
			}
			else if(o.getCRN() < this.getCRN()) {
				return -1;
			}
			else return 0;
	}
	
	@Override
	public String toString() {
		return "CourseDBElement [ID=" + ID + ", CRN=" + CRN + ", credits=" + credits + ", roomNum=" + roomNum
				+ ", name=" + name + "]";
	}
	public void setID(String iD) {
		ID = iD;
	}


	
	
	

}
