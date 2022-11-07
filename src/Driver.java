import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		CourseDBStructure cds = new CourseDBStructure(20);
//		
		CourseDBElement cde1 = new CourseDBElement("CMSC500", 39999, 4, "SC100", "Nobody InParticular");
//		
		cds.add(cde1);  //add to data structure
		cds.add(cde1);
//		
//		CourseDBElement cde1Update = new CourseDBElement("CMSC500-updated", 39999, 4, "SC100", "updated");
//		
//		ArrayList<String> courseList = cds.showAll();
//		
//		try {
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
		
		CourseDBStructure testStructure = new CourseDBStructure("Testing", 20); 
		ArrayList<String> courseList = cds.showAll();
		
		testStructure.add(cde1); 
		courseList = testStructure.showAll(); 
		System.out.print(courseList.size());

}
}
