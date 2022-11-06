package lt.lhu.unit11.main;

import java.util.List;

import lt.lhu.unit11.enity.GroupOfStudents;
import lt.lhu.unit11.enity.Student;

public class MainStudent {

	public static void main(String[] args) {
		
		Student st1 = new Student("Oleg", "Potapov", "6", new int[] {7, 9, 4, 6, 7});
		Student st2 = new Student("Aleksandr", "Ovechkin", "5", new int[] {8, 9, 9, 8, 10});
		Student st3 = new Student("Fedor", "Prostokvashin", "6", new int[] {10, 9, 10, 10, 9});
		Student st4 = new Student("Nikolai", "Gavrilov", "6", new int[] {6, 8, 7, 9, 8});
		Student st5 = new Student("Arsenii", "Popov", "4", new int[] {5, 9, 8, 8, 5});
		Student st6 = new Student("Nikita", "Zonov", "5", new int[] {9, 9, 9, 10, 9});
		Student st7 = new Student("Michail", "Gureev", "6", new int[] {8, 9, 9, 8, 5});
		Student st8 = new Student("Andrei", "Gaidulian", "4", new int[] {7, 9, 4, 6, 7});
		Student st9 = new Student("Sergei", "Stilov", "4", new int[] {5, 9, 9, 6, 6});
		Student st10 = new Student("Roman", "Kolotovski", "5", new int[] {6, 9, 4, 6, 7});
		Student st11 = new Student("Aleksandr", "Strom", "6", new int[] {9, 9, 10, 10, 9});
		Student st12 = new Student("Aleksei", "Garanin", "4", new int[] {7, 5, 10, 9, 7});
		Student st13 = new Student("Kirill", "Kolotov", "5", new int[] {8, 9, 4, 6, 7});
		Student st14 = new Student("Oleg", "Tarasiuk", "6", new int[] {4, 7, 4, 6, 7});
		Student st15 = new Student("Igor", "Azotov", "5", new int[] {7, 9, 4, 6, 7});
		
	GroupOfStudents gr = new GroupOfStudents();
	gr.add(st1);
	gr.add(st2);
	gr.add(st3);
	gr.add(st4);
	gr.add(st5);
	gr.add(st6);
	gr.add(st7);
	gr.add(st8);
	gr.add(st9);
	gr.add(st10);
	gr.add(st11);
	gr.add(st12);
	gr.add(st13);
	gr.add(st14);
	gr.add(st15);
	
	System.out.println("List" + gr.getStudents());
	System.out.println();
	
	List<Student> otLichnik = gr.aLevelStudents();
	System.out.println("The best" + gr.aLevelStudents());
	
	
	
	}
}
