package Member.domain.mediator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Member.domain.model.Member;
import Member.domain.model.MemberList;

public class MemberClient
{

   private RemoteMemberModel server;

   public MemberClient()
   {
      try
      {
         server = (RemoteMemberModel) Naming
               .lookup("rmi://localhost:1099/MemberServer");
      }
      catch (MalformedURLException e)
      {
         e.printStackTrace();
      }
      catch (RemoteException e)
      {
         e.printStackTrace();
      }
      catch (NotBoundException e)
      {
         e.printStackTrace();
      }
   }

   public MemberList getAll() throws RemoteException
   {
      // TODO Auto-generated method stub
      return server.getAll();
   }

   public MemberList getMembershipNotPaid() throws RemoteException
   {

      return server.getMembershipNotPaid();
   }

   public Member getMember(int index) throws RemoteException
   {
      // TODO Auto-generated method stub
      return server.getMember(index);
   }

   public int getNumberOfMembers() throws RemoteException
   {
      // TODO Auto-generated method stub
      return server.getNumberOfMembers();
   }

   public void addMember(Member member) throws RemoteException
   {
      server.addMember(member);

   }

}
