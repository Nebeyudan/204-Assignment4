import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseDBManager implements CourseDBManagerInterface {
		CourseDBStructure s =  new CourseDBStructure(20);
		CourseDBElement temp;
	@Override
	public void add(String id, int crn, int credits, String roomNum, String instructor) {
		// TODO Auto-generated method stub
		temp = new CourseDBElement(id,crn,credits,roomNum,instructor);
		s.add(temp);
	}

	@Override
	public void readFile(File input) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(input); //obtains all values and adds it to a new element
		while(s.hasNextLine()) {
			String ID = s.next();
			int crn = s.nextInt();
			int credit = s.nextInt();
			String roomNum = s.next();
			String professor = s.nextLine();
			temp = new CourseDBElement(ID,crn,credit,roomNum,professor);
		}
		s.close();
	}

	@Override
	public ArrayList<String> showAll() {
		// TODO Auto-generated method stub
		return s.showAll();
	}

	@Override
	public CourseDBElement get(int crn) {
		// TODO Auto-generated method stub
		try {
			return s.get(crn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
