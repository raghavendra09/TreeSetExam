package testing;

import java.util.TreeSet;

public class Client {

	public static void main(String[] args) {
TreeSet ts=new TreeSet(new CustomComparator());
ts.add(new Employee("Anudeep","Challa",9700489109l,24,"Savings"));
ts.add(new Employee("Manideep","Challa",9700489109l,24,"Savings"));
ts.add(new Employee("Anudeep","Challa",9700489109l,25,"Savings"));
ts.add(new Employee("Anudeep","Anu",9700487107l,24,"Current"));
ts.add(new Employee("Anudeep","deep",8700489109l,24,"Savings"));
ts.add(new Employee("Raghavendra","Tirunagari",8790596865l,34,"Current"));
ts.add(new Employee("Kranthi","Kumar",9948469094l,26,"Savings"));
ts.add(new Employee("Sarath","Potluri",1234567890l,22,"Current"));
ts.add(new Employee("Raghavendra","Adeep",8700489145l,21,"Savings"));
ts.add(new Employee("Raghavendra","Adeep",8700489146l,21,"Savings"));
ts.add(new Employee("Kranthi","Kumar",9948469094l,26,"Current"));

System.out.println(ts.first());
System.out.println(ts.last());

for(Object x:ts)
	System.out.println(x);
	}

}
