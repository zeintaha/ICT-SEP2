package Member.domain.mediator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Member.domain.model.Member;
import Member.domain.model.MemberList;

public class MemberClient implements RemoteMemberModel
{

   private RemoteMemberModel server;
   
   public MemberClient()
   {
      try
      {
         server = (RemoteMemberModel) Naming.lookup("rmi://localhost:1099/MemberServer");
      }
      catch (MalformedURLException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      catch (RemoteException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      catch (NotBoundException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   @Override
   public MemberList getAll() throws RemoteException
   {
      // TODO Auto-generated method stub
      return server.getAll();
   }

   @Override
   public MemberList getMembershipNotPaid(String membershipNotPaid) throws RemoteException
   {
      
      return server.getMembershipNotPaid(membershipNotPaid);
   }

   @Override
   public Member getMember(int index) throws RemoteException
   {
      // TODO Auto-generated method stub
      return server.getMember(index);
   }

   @Override
   public int getNumberOfMembers() throws RemoteException
   {
      // TODO Auto-generated method stub
      return server.getNumberOfMembers();
   }

   @Override
   public void addMember(Member member) throws RemoteException
   {
      server.addMember(member);
      
   }

}
