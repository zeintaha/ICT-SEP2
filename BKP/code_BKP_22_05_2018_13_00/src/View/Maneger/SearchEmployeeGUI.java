package View.Maneger;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.INITIALIZE;

import controller.employee.maneger.ManegerController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SearchEmployeeGUI extends JFrame implements ManegerView
{

   private JPanel contentPane;
   private JTextField textField;
   private JButton button;
   private ManegerController manegerController;
   private ButtonHandler listener;

   public SearchEmployeeGUI()
   {
      initializeComponents();
      addComponentsToFrame();
      createComponents();
   }

   private void initializeComponents()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);

   }

   private void addComponentsToFrame()
   {
      JLabel lbl = new JLabel("Employee Name");
      lbl.setBounds(10, 20, 89, 20);
      contentPane.add(lbl);

      textField = new JTextField();
      textField.setBounds(179, 17, 86, 20);
      contentPane.add(textField);
      textField.setColumns(10);

   }

   private void createComponents()
   {
      JButton btn = new JButton("Search");
      btn.setBounds(26, 210, 89, 23);
      contentPane.add(btn);
   }

   @Override
   public void strat(ManegerController manegerController)
   {
     
      
     this.manegerController= manegerController;
     this.listener = new ButtonHandler(this,this.manegerController);
     button.addActionListener( listener);
     setVisible(true);
   }
     

   @Override
   public void show(String value)
   {

      
   }

   @Override
   public String getName()
   {
      String name = textField.getText();
      return name;
   }
}
