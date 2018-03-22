package basic;

import java.util.Comparator;

public class CustomComparator3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Customer c1=(Customer) o1;
		Customer c2=(Customer) o2;
		
		int idCompare=c1.getId().compareTo(c2.getId());
		if(c1.getAge().equals(c2.getAge())) {
			int fnameCompare=c1.getFirstName().compareTo(c2.getFirstName());
			if(c1.getFirstName().equals(c2.getFirstName())) {
				int lnameCompare=c1.getLastName().compareTo(c2.getLastName());
					return lnameCompare;					
			}
			return fnameCompare;
		}
		return idCompare;
}
}