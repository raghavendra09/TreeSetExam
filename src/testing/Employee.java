package testing;

public class Employee{
	private String firstName;
	private String lastName;
	private String accountType;
	private Long mobileNum;
	private Integer age;
	

	public Employee(String firstName, String lastName, Long mobileNum, Integer age,String accountType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNum = mobileNum;
		this.age = age;
		this.accountType = accountType;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public Long getMobileNum() {
		return mobileNum;
	}


	public void setMobileNum(Long mobileNum) {
		this.mobileNum = mobileNum;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", mobileNum=" + mobileNum + ", age="
				+ age + ", accountType=" + accountType + "]";
	}




}
