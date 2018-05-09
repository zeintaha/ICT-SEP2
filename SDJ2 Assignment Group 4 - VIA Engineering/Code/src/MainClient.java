import java.rmi.RemoteException;

import Member.Controler.ClientMemberController;
import Member.Controler.MemberControler;
import Member.View.ClientMemberConsol;
import Member.View.ClientMemberView;
import Member.View.MemberConsol;
import Member.View.MemberView;
import Member.domain.mediator.ClinetMemberModel;
import Member.domain.mediator.MemberModelManager;
import Member.domain.mediator.RemoteMemberModel;

public class MainClient
{

   public static void main(String[] args) throws RemoteException
   {
      
       ClinetMemberModel model = new ClinetMemberModel();
    
      ClientMemberView view = new ClientMemberConsol();
      ClientMemberController controler = new ClientMemberController(view, model);
      view.start(controler);
   }
   

}
