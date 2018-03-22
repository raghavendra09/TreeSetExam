package basic;

import java.util.TreeSet;

public class Client {

	public static void main(String[] args) {

		TreeSet<Customer> ts = new TreeSet(new CustomComparator());
	    ts.add(new Customer(1034,25, "Rajesh", "Kathi"));
		ts.add(new Customer(1032,26, "Abhilash", "Suhan"));
		ts.add(new Customer(1033,26, "Mujeeb", "Md"));
		ts.add(new Customer(1039,36, "Sirish", "Vadhwa"));
		ts.add(new Customer(1025,25, "Abhilash", "Suhan"));
		ts.add(new Customer(1028,20, "Sonal", "Gadwe"));
		ts.add(new Customer(1029,26, "Mujeeb", "Mohammed"));
		ts.add(new Customer(1034,25, "Rajesh", "Kathi"));
		ts.add(new Customer(1032,260, "Abhilash", "Suhan"));
		ts.add(new Customer(1033,260, "Mujeeb", "Md"));
		ts.add(new Customer(1039,360, "Sirish", "Vadhwa"));
		ts.add(new Customer(1025,250, "Abhilash", "Suhan"));
		ts.add(new Customer(1028,200, "Sonal", "Gadwe"));
		ts.add(new Customer(1029,260, "Mujeeb", "Mohammed"));
		
		for(Customer c:ts) {
			System.out.println(c);
		}
	}
}