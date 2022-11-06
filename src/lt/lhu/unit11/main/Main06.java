package lt.lhu.unit11.main;

import lt.lhu.unit11.enity.Time;

public class Main06 {

	public static void main(String[] args) {
		  Time a = new Time(7, 15, 50);
		  Time b = new Time(45, 19, 3);
		  Time c = new Time(11, 11, 12);
		  
		  a.print();
		  b.print();
		  c.print();
		  System.out.println("-----------------");
		  
		  a.set_hh(12);
		  a.set_mm(18);
		  a.set_ss(56);
		  
		  a.print();
		  b.print();
		  c.print();		  
		  System.out.println("-----------------");
		  
		  a.add_minutes(20);
		  b.add_hours(3);
		  c.add_hours(33);
		  
		  a.print();
		  b.print();
		  c.print();
		  System.out.println("-----------------");
	}

}
