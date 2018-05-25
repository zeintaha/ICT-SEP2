package view.manager.searchemployee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import controller.employee.maneger.SearchEmployeeController;



public class ButtonHandler implements ActionListener
{
   private SearchEmployeeGUI search;
   private SearchEmployeeController searchEmployeeController;

   public ButtonHandler(SearchEmployeeGUI search,
		   SearchEmployeeController searchEmployeeController)
   {
      this.search = search;
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
