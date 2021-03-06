package view.manager.searchemployee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import controller.employee.maneger.ManegerController;

public class ButtonHandler implements ActionListener
{
   private SearchEmployeeGUI searchEmployeeGUI;
   private ManegerController manegerController;

   public ButtonHandler(SearchEmployeeGUI searchEmployeeGUI,
         ManegerController manegerController)
   {
      this.searchEmployeeGUI = searchEmployeeGUI;
      this.manegerController = manegerController;
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      if (!(e.getSource() instanceof JButton))
         return;
      System.out.println("I�m here");
      String name = searchEmployeeGUI.getName();
      manegerController.executes(name);
   }

}
