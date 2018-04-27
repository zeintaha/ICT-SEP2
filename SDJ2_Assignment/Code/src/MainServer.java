import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import Member.domain.mediator.MemberServer;
import Member.domain.mediator.MemberTextFile;
import Member.domain.mediator.PersistanceMember;

public class MainServer
{
   

   public static void main(String[] args)
   {
      try
      {
          MemberServer memberServer= new MemberServer();
         MemberTextFile server = new MemberTextFile("src/member.txt");

      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }
   }
}
