import java.rmi.RemoteException;

import Member.Controler.MemberControler;
import Member.View.MemberConsol;
import Member.View.MemberView;
import Member.domain.mediator.MemberClient;
import Member.domain.mediator.MemberModelManager;
import Member.domain.mediator.RemoteMemberModel;

public class MainClient
{

   public static void main(String[] args) throws RemoteException
   {
      MemberClient client = new MemberClient();
      RemoteMemberModel model= new MemberModelManager();
      MemberView view=new MemberConsol();
      MemberControler controler= new MemberControler(view,model);
      view.start(controler);
   }

}
