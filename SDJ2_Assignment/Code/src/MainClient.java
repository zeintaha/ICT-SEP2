import java.rmi.RemoteException;

import Member.domain.mediator.MemberClient;

public class MainClient
{

   public static void main(String[] args) throws RemoteException
   {
      MemberClient client = new MemberClient();
      client.getMembershipNotPaid("not paid");
     System.out.println(client.getAll()); 

   }

}
