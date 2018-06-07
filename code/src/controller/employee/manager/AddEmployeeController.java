package controller.employee.manager;

import java.io.IOException;
import java.rmi.RemoteException;

import clients.Client;
import view.manager.addemployee.AddEmployeeView;

public class AddEmployeeController {
	private Client clientStaff;
	private AddEmployeeView view;

	public AddEmployeeController(Client staffClinicModel, AddEmployeeView view)
			throws ClassNotFoundException, IOException {
		
		this.clientStaff = staffClinicModel;
		this.view = view;
	}

	public String[] setComboboxValue() throws RemoteException {
		return clientStaff.reachType();
	}

	public void executes() throws RemoteException {
      String[] data = view.getTextFieldValues();


      boolean error = false;
      for (int i = 0; i < data.length; i++) {
          if (data[i].isEmpty()) {
              view.showError();
              error = true;
              break;
          }
      }
      if (error == false) {
         clientStaff.addOneEmployee(data);
          view.showConfirmation();
          view.cleanInput();
      }

  }
}
