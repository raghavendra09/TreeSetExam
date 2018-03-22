package testing;

import java.util.Comparator;

public class CustomComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		
		int firstCompare=e1.getFirstName().compareTo(e2.getFirstName());
		int lastCompare=e1.getLastName().compareTo(e2.getLastName());
		int mobileCompare=e1.getMobileNum().compareTo(e2.getMobileNum());
		int ageCompare=e1.getAge().compareTo(e2.getAge());
		int accountCompare=e1.getAccountType().compareTo(e2.getAccountType());
		
		if(firstCompare==0) {
			if(lastCompare==0) {
				if(mobileCompare==0) {
					if(ageCompare==0) {
						if(accountCompare>0) {
							return 1;
						}
						return -1;
					}
					else if(ageCompare>0) {
						return 1;
					}
					return -1;
				}
				else if(mobileCompare>0) {
					return 1;
				}
				return -1;
			}
			else if(lastCompare>0) {
				return 1;
			}
			return -1;
		}
		/*<--------------------------------->
		<--------------------------------->
		<--------------------------------->
		*/
		
		else if(firstCompare>0) {
			return 1;
		}
		
		/*<--------------------------------->
		<--------------------------------->
		<--------------------------------->
		*/
		else {
			return -1;
		}	
	}
}