package Member.domain.mediator;

import java.io.IOException;
import java.rmi.RemoteException;

import Member.domain.model.Member;
import Member.domain.model.MemberList;

public class MemberModelManager implements RemoteMemberModel
{
   private MemberList list;
   private PersistanceMember textFile;
   

   public MemberModelManager()
   {
      try
      {         
         this.textFile = new MemberAdopter();
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
   public MemberList getMembershipNotPaid() throws RemoteException
   {
      // TODO Auto-generated method stub
      return list.getMembershipNotPaid();
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
