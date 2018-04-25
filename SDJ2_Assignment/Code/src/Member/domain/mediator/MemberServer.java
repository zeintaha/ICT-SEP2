package Member.domain.mediator;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MemberServer
{
   private RemoteMemberModel memberList;

   public MemberServer() throws RemoteException
   {
      memberList = new MemberModelManager();
   }


}
