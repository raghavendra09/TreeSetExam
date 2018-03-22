package basic;

import java.util.Comparator;

public class CustomComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		
		int idCompare = c1.getId().compareTo(c2.getId());
		int ageCompare = c1.getAge().compareTo(c2.getAge());
		int firstCompare = c1.getFirstName().compareTo(c2.getFirstName());
		int lastCompare = c1.getLastName().compareTo(c2.getLastName());
		
		if(idCompare<0) {
			
			if(ageCompare==0) {
				
				if(firstCompare==0) {
					
					if(lastCompare==0) {
						return -1;	
					}
					else if(lastCompare<0) {
						return -1;
					}
					else if(lastCompare>0) {
						return 1;
					}
					return -1;
				}
				else if(firstCompare<0) {
					return -1;
				}
				else if(firstCompare>0){
					return 1;
				}
				return -1;
			}
			return -1;
		}
		/*------------------------------------*/
		/*------------------------------------*/
		/*------------------------------------*/
		else if(idCompare>0) {
			
					if(ageCompare==0) {
				
						if(firstCompare==0) {
					
							if(lastCompare==0) {
								return 1;
							}
							else if(lastCompare<0) {
								return -1;
							}
							else if(lastCompare>0) {
								return 1;
							}
							return 1;
						}
						else if(firstCompare<0) {
							return -1;
						}
						else if(firstCompare>0) {
							return 1;
						}
						return 1;
					}
			return 1;
		}
		/*------------------------------------*/
		/*------------------------------------*/
		/*------------------------------------*/
		else {
			return -1;
		}
	}
}