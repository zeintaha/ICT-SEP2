package domain.model.staff;

import java.util.Date;

abstract public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private Date dob;
	private Date startDate;
	private String telNumber;
	private String email;
	private String gender;
	private String employeeType;
	private String userName;
	private String password;


	public Employee(int id, String firstName, String lastName, Date dob, Date startDate, String telNumber, String email,
			String gender, String employeeType, String userName, String password) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.startDate = startDate;
		this.telNumber = telNumber;
		this.email = email;
		this.gender = gender;
		this.employeeType = employeeType;
		this.userName = userName;
		this.password = password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public void setEamil(String email) {
		this.email = email;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getId() {
		return id;
	}

	public Date getDob() {
		return dob;
	}

	public Date getStartDate() {
		return startDate;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public String getEamil() {
		return email;
	}

	public String getGender() {
		return gender;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", dob=" + dob
				+ ", startDate=" + startDate + ", telNumber=" + telNumber + ", eamil=" + email + ", gender=" + gender
				+ ", type=" + "]";
	}

}
