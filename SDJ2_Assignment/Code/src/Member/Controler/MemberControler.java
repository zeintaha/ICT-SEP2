package Member.Controler;

import java.rmi.RemoteException;

import Member.View.MemberView;
import Member.domain.mediator.RemoteMemberModel;

public class MemberControler
{
   private MemberView view;
   private RemoteMemberModel modelManager;

   public MemberControler(MemberView view, RemoteMemberModel modelManager)
   {
      super();
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