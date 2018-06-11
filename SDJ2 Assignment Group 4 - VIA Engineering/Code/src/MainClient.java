import java.rmi.RemoteException;

import Member.Controler.MemberController;
import Member.View.MemberConsol;
import Member.View.MemberView;
import Member.domain.mediator.MemberClient;

public class MainClient
{

   public static void main(String[] args) throws RemoteException
   {
      
       MemberClient client = new MemberClient();
    
      MemberView view = new MemberConsol();
      MemberController controler = new MemberController(view, client);
      view.start(controler);
   }
   

}
