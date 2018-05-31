package domain.model.staff;

import java.util.Date;

public class Secretary extends Employee {

	public Secretary(int id, String firstname, String lastname, Date dob, Date startdate, String telnumber,
			String email, String gender, String username, String employeepassword) {
		super(id,firstname , lastname, dob, startdate, telnumber, email,gender,username,employeepassword);
	}
	@Override
	public String toString() {
		return "FirstName" + getFirstName() + "LastName" + getLastName() 
				+ ", getDob()=" + getDob() + ", StartDate()=" + getStartDate() + ", tTelNumber" + getTelNumber()
				+ ", Eamil" + getEamil() + ",Gender" + getGender() + ", Email=" + getEmail()
				+ "Name :" + getUserName() + "Password()=" + getPassword()  + "type " + getClass().getSimpleName() + "]";
	}

}
