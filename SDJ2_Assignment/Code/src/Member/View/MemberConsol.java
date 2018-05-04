package Member.View;

import java.rmi.RemoteException; 
import java.util.Scanner;

import Member.Controler.MemberControler;
import Member.domain.model.MemberList;

public class MemberConsol implements MemberView
{
   private Scanner in;
   private MemberControler controler;
   private MemberList memberList;

   public MemberConsol()
   {
      in = new Scanner(System.in);
      memberList = null;
   }

   private int menu()
   {
      System.out.println("Welcome to Member Application");
      System.out.println("--------------");
      System.out.println("1) List all Member's");
      System.out.println("2) Search Members by Membership not Paid");
      System.out.println("3) Quit");
      System.out.println();
      System.out.print("Select an item by pressing number 1-3: ");
      int selection = in.nextInt();
      in.nextLine();
      return selection;
   }

   @Override
   public void start(MemberControler controler) throws RemoteException
   {
      this.controler = controler;
      int menuSelection;
      do
      {
         menuSelection = menu();
         controler.execute(String.valueOf(menuSelection));
         System.out.println("\nPress enter to continue ...");
         in.nextLine();
      }
      while (menuSelection != 3);

   }

   @Override
   public void show(String value)
   {
      System.out.println(value);

   }

}
