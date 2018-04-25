import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import Member.domain.mediator.MemberTextFile;
import Member.domain.mediator.PersistanceMember;

public class MainServer
{

   public static void main(String[] args)
   {
      try
      {
         MemberTextFile server = new MemberTextFile("src/member.txt");
         PersistanceMember stub = (PersistanceMember) UnicastRemoteObject
               .exportObject(server, 0);
         Registry reg = LocateRegistry.createRegistry(321);
         reg.rebind("members", stub);
         System.out.println("Starting server...");
      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }
   }
}
