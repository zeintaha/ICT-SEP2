
package Member.Controler;

import java.rmi.RemoteException;

import Member.View.ClientMemberView;
import Member.View.MemberView;
import Member.domain.mediator.RemoteMemberModel;
import Member.domain.mediator.ClinetMemberModel;

public class ClientMemberController
{
   private ClientMemberView view;
   private ClinetMemberModel modelManager;

   public ClientMemberController(ClientMemberView view,
         ClinetMemberModel modelManager)
   {

      this.view = view;
      this.modelManager = modelManager;
   }

   public void execute(String what) throws RemoteException
   {
      switch (what)
      {
         case "1":
            view.show("" + modelManager.getAll());
            break;
         case "2":
            view.show("" + modelManager.getMembershipNotPaid());
         case "3":
            System.out.println("Quit");
            break;
         default:
            view.show("Wrong input");
            break;
      }

   }
}
