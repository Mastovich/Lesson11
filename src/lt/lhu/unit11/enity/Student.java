package lt.lhu.unit11.enity;
//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
//Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих 
//оценки, равные только 9 или 10.

import java.util.Arrays;
import java.util.Objects;

public class Student {

	private String name;
	private String familyName;
	private String numberOfGroup;
	private int[] marks;
	
	public Student() {
		super();
	}
	
	public Student(String name, String familyName, String numberOfGroup, int[] marks) {
		super();
		this.name = name;
		this.familyName = familyName;
		this.numberOfGroup = numberOfGroup;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getNumberOfGroup() {
		return numberOfGroup;
	}

	public void setNumberOfGroup(String numberOfGroup) {
		this.numberOfGroup = numberOfGroup;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\nStudent [name=" + name + ", familyName=" + familyName + ", numberOfGroup=" + numberOfGroup + ", marks=" + Arrays.toString(marks);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + Objects.hash(familyName, name, numberOfGroup);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(familyName, other.familyName) && Arrays.equals(marks, other.marks)
				&& Objects.equals(name, other.name) && Objects.equals(numberOfGroup, other.numberOfGroup);
	}

	public boolean otLichnik() {
	    for(Integer mark : marks) {
	        if(mark < 9) {
  	            return false;
	        }  	        
	    }
	    
	    return true;
	}
	

}
