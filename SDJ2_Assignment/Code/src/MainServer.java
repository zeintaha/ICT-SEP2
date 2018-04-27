import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import Member.Controler.MemberControler;
import Member.View.MemberConsol;
import Member.View.MemberView;
import Member.domain.mediator.MemberModelManager;
import Member.domain.mediator.MemberServer;
import Member.domain.mediator.MemberTextFile;
import Member.domain.mediator.PersistanceMember;
import Member.domain.mediator.RemoteMemberModel;

public class MainServer
{
   

   public static void main(String[] args)
   {
      try
      {
          MemberServer memberServer= new MemberServer();
          RemoteMemberModel model= new MemberModelManager();
          MemberView view=new MemberConsol();
          MemberControler controler= new MemberControler(view,model);
          view.start(controler);
//         MemberTextFile server = new MemberTextFile("src/member.txt");

      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }
   }
}
