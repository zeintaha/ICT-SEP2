
import Member.Controler.MemberControler;
import Member.View.MemberConsol;
import Member.View.MemberView;
import Member.domain.mediator.MemberModelManager;
import Member.domain.mediator.MemberServer;
import Member.domain.mediator.RemoteMemberModel;

public class MainServer
{
   

   public static void main(String[] args)
   {
      try
      {
          MemberServer server1= MemberServer.getInstance();
          MemberServer server2= MemberServer.getInstance();
          System.out.println("sever1 = " +server1);
          System.out.println("sever2 = " +server2);
          System.out.println(".........");
          
          RemoteMemberModel model= new MemberModelManager();
          MemberView view=new MemberConsol();
          MemberControler controler= new MemberControler(view,model);
          view.start(controler);

      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }
   }
}
