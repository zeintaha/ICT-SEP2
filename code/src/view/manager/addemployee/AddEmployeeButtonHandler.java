package view.manager.addemployee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import controller.employee.maneger.AddEmployeeController;
import controller.employee.maneger.ManegerController;


public class AddEmployeeButtonHandler implements ActionListener
{
   private AddEmployeeGUI addEmployeeGUI;
   private AddEmployeeController addEmployeeController;



   public AddEmployeeButtonHandler(AddEmployeeGUI addEmployeeGUI,
         AddEmployeeController addEmployeeController)
   {

      this.addEmployeeGUI = addEmployeeGUI;
      this.addEmployeeController = addEmployeeController;
   }



   @Override
   public void actionPerformed(ActionEvent e)
   {
      if (!(e.getSource() instanceof JButton))
         return;
      System.out.println("I´m here AddEmployee");
//      String name = searchEmployeeGUI.getName();
    
//      AddEmployeeController.executes(name);
   }
}
