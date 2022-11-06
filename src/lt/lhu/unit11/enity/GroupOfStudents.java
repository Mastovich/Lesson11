package lt.lhu.unit11.enity;

import java.util.ArrayList;
import java.util.List;

public class GroupOfStudents {

	private List<Student> students = new ArrayList<Student>();
    private int currentSize = 0;
    
    public GroupOfStudents(){
    
    }
       
    public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getCurrentSize() {
		return currentSize;
	}

	public void setCurrentSize(int currentSize) {
		this.currentSize = currentSize;
	}

	public void add(Student st){
    	students.add(st);
    }
        
    public List<Student> aLevelStudents(){

    	List<Student> result = new ArrayList<Student>();
      		int i = 0;
      		for(Student st : students){
      			if(st.otLichnik()){
      				result.add(st);
      			}      
      		}
      
      return result;
  
    }
    
    
		

	

}
