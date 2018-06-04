package view.manager.removeemployee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import controller.employee.manager.RemoveEmlployeeController;


public class RemoveEmployeeButtonHandler  implements ActionListener {
	
	private RemoveEmlployeeController removeEmlployeeController;
	public	RemoveEmployeeButtonHandler(RemoveEmlployeeController removeEmlployeeController) {
		this.removeEmlployeeController = removeEmlployeeController;
	}
	
	 
	   public void actionPerformed(ActionEvent e)
	   {
		 
	      if (!(e.getSource() instanceof JButton))
	         return;
	      if (((JButton) e.getSource()).getText().startsWith("Search"))
		     {
	    	  removeEmlployeeController.executes("Search");
		     }if (((JButton) e.getSource()).getText().startsWith("Remove"))
		     {
		    	 removeEmlployeeController.executes("Remove");
			     }
	      
	   }
}
