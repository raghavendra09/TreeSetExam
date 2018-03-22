package basic;

import java.util.Comparator;

public class CustomComparator2 implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		
		int idCompare = c1.getId().compareTo(c2.getId());
		if(c1.getAge()==c2.getAge()) {
			int firstCompare = c1.getFirstName().compareTo(c2.getFirstName());
			if(c1.getFirstName()==c2.getFirstName()) {
				int lastCompare = c1.getLastName().compareTo(c2.getLastName());
				return lastCompare;
				}
			return firstCompare;
			}
		return idCompare;
		}
		
/*		if(idCompare<0) {
			return -1;
		}
		else if(idCompare>0) {
			return 1;
		}
		else {
			return -1;
		}
}*/
}