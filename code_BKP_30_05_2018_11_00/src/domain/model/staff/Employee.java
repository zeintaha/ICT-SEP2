package domain.model.staff;

import java.util.Date;

abstract public class Employee {
//	private String userName;
//	private String password;
	private String firstName;
	private String lastName;
	private String id;
	private Date dob;
	
	private Date startDate;
	private String telNumber;
	private String eamil;
	private String gender;
	


	// this constructor for earchEmployeeView I did not add the userName and the
	// Password to it since we did not finalise them
	// either on the database side or on the GUI

	public Employee(String firstName, String lastName, String id, Date dob, Date startDate, String telNumber,
			String eamil, String gender) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.dob = dob;
		this.startDate = startDate;
		this.telNumber = telNumber;
		this.eamil = eamil;
		this.gender = gender;

	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setId(String id) {
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

	public void setEamil(String eamil) {
		this.eamil = eamil;
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

	public String getId() {
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
		return eamil;
	}

	public String getGender() {
		return gender;
	}

	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", dob=" + dob
				+ ", startDate=" + startDate + ", telNumber=" + telNumber + ", eamil=" + eamil + ", gender=" + gender
				+ ", type=" + "]";
	}

}
