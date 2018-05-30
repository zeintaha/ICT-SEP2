package view.manager.searchemployee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import controller.employee.manager.SearchEmployeeController;



public class SearchEmployeeButtonHandler implements ActionListener
{
   
   private SearchEmployeeController searchEmployeeController;

   public SearchEmployeeButtonHandler(
		   SearchEmployeeController searchEmployeeController)
   {
      
      this.searchEmployeeController = searchEmployeeController;
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      if (!(e.getSource() instanceof JButton))
         return;
      System.out.println("I´m here");
      searchEmployeeController.executes();
   }

}
