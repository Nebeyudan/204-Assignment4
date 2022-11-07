import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class CourseDBStructure implements CourseDBStructureInterface{
	int size;
	LinkedList<CourseDBElement>[] CBS;
	public CourseDBStructure(String testing, int n) {
		size =n;
		CBS= new LinkedList[size];
		
	}
	public CourseDBStructure(int n) {
		//method used to find the 4k+3 prime number
		boolean k = false;
		boolean isPrime = false;
		int prime;
		int highD;
		int d;
		prime = (int) (n/1.5);
		if(prime % 2==0) {
			prime = prime+1;
		}
		while(k==false){
			while(isPrime==false) {
				highD=(int)(Math.sqrt(prime)+.5);
				for(d=highD;d>1;d--) {
					if(prime % d==0) {
						break;
					}
				}
					if(d!=1) {
						prime = prime+2;
					}
					else {
						isPrime =true;
					}
				
			}
			if((prime-3)%4==0) {
				k=true;
			}
			else {
				prime = prime +2;
				isPrime = false;
			}
		}
		CBS = new LinkedList[prime];
	}
	@Override
	public void add(CourseDBElement element) {
		LinkedList<CourseDBElement> temp;
		int i = element.hashCode(); //use hashcode
		int key =i% CBS.length; //mod for the key
		if(CBS[key]== null) { //check if array is null
			CBS[key] = new LinkedList<CourseDBElement>(); //add a linkedList
			
		}
		else {
			for(int j=0; j< CBS[key].size(); j++) { // check linkedlist for duplicate
				CourseDBElement e = CBS[key].get(j);
				if(e.compareTo(element)!= 0) {
					CBS[key].add(element);
				}
			}
		}
		CBS[key].add(element);//add e to the list
	}

	@Override
	public CourseDBElement get(int crn) throws IOException {
		String temp = Integer.toString(crn);
		int key = temp.hashCode() % CBS.length;
		if(CBS[key] == null) {
			throw new IOException();
		}
		return CBS[key].get(0);
	}

	@Override
	public ArrayList<String> showAll() {
		ArrayList<String > show = new ArrayList<String>();
		LinkedList<CourseDBElement> temp;
		for(int i =0; i < CBS.length; i++) {// run thru the array
			 if(CBS[i]!=null) {
				 temp = CBS[i];
				 for(int j=0; j< temp.size();j++) {
					 show.add(temp.get(j).toString());
				 }
			 }
			
			
		}
		return show;
	}

	@Override
	public int getTableSize() {
		
		return CBS.length;
	}
	
}
