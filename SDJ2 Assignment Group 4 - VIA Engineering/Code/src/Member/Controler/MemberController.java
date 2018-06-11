
package Member.Controler;

import java.rmi.RemoteException;

import Member.View.MemberView;
import Member.domain.mediator.MemberClient;

public class MemberController
{
   private MemberView view;
   private MemberClient client;

   public MemberController(MemberView view,
         MemberClient modelManager)
   {

      this.view = view;
      this.client = modelManager;
   }

   public void execute(String what) throws RemoteException
   {
      switch (what)
      {
         case "1":
            view.show("" + client.getAll());
            break;
         case "2":
            view.show("" + client.getMembershipNotPaid());
         case "3":
            System.out.println("Quit");
            break;
         default:
            view.show("Wrong input");
            break;
      }

   }
}
