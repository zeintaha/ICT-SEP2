package view.manager.searchemployee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import controller.employee.maneger.ManegerController;

public class ButtonHandler implements ActionListener
{
   private SearchEmployeeGUI search;
   private ManegerController manegerController;

   public ButtonHandler(SearchEmployeeGUI search,
         ManegerController manegerController)
   {
      this.search = search;
      this.manegerController = manegerController;
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      if (!(e.getSource() instanceof JButton))
         return;
      System.out.println("I´m here");
      manegerController.executes();
   }

}
