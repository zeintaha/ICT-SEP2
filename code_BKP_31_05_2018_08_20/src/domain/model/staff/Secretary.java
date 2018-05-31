package domain.model.staff;

import java.util.Date;

public class Secretary extends Employee {

	public Secretary(int id, String firstname, String lastname, Date dob, Date startdate, String telnumber,
			String email, String gender, String employeetype, String username, String employeepassword) {
		super(id,firstname , lastname, dob, startdate, telnumber, email,gender,employeetype,username,employeepassword);
	}

}
