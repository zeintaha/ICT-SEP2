package view.manager.searchemployee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import controller.employee.maneger.SearchEmployeeController;

public class ButtonHandler implements ActionListener
{
<<<<<<< HEAD
   private SearchEmployeeGUI search;
   private SearchEmployeeController manegerController;

   public ButtonHandler(SearchEmployeeGUI search,
         SearchEmployeeController manegerController)
=======
   private SearchEmployeeGUIOld searchEmployeeGUI;
   private ManegerController manegerController;

   public ButtonHandler(SearchEmployeeGUIOld searchEmployeeGUI,
         ManegerController manegerController)
>>>>>>> 90ecc797ccbe4f3f05982b488a98ac9f760655ec
   {
      this.search = search;
      this.manegerController = manegerController;
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      if (!(e.getSource() instanceof JButton))
         return;
      System.out.println("I�m here");
      manegerController.executes();
   }

}
