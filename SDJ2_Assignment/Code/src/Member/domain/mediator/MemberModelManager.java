package Member.domain.mediator;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import Member.domain.model.Member;
import Member.domain.model.MemberList;

public class MemberModelManager implements RemoteMemberModel
{
   private MemberList list;
   private PersistanceMember textFile;
   private RemoteMemberModel stub;
   

   public MemberModelManager()
   {
      try
      {

//         RemoteMemberModel stub = (RemoteMemberModel) UnicastRemoteObject.exportObject(this, 0);
//         Registry reg = LocateRegistry.createRegistry(1099);
//         reg.rebind("members", stub);
         
         this.textFile = new MemberTextFile("member.txt");
         this.list = textFile.load();
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      catch (Exception e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   @Override
   public MemberList getAll()
   {
      // TODO Auto-generated method stub
      return list;
   }
   
   @Override
   public MemberList getMembershipNotPaid(String membershipNotPaid) throws RemoteException
   {
      // TODO Auto-generated method stub
      return stub.getMembershipNotPaid(membershipNotPaid);
   }
   
   @Override
   public Member getMember(int index)
   {
      // TODO Auto-generated method stub
      return list.getMember(index);
   }
   
   @Override
   public int getNumberOfMembers()
   {
      // TODO Auto-generated method stub
      return list.getNumberOfMembers();
   }

   @Override
   public void addMember(Member member)
   {
      list.addMember(member);

   }




}
