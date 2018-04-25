package Member.domain.model;

import java.io.Serializable;
import java.util.ArrayList;

public class MemberList implements Serializable 
{
   private ArrayList<Member> members;

   public MemberList()
   {
      this.members = new ArrayList<Member>();
   }

   public void addMember(Member member)
   {
      members.add(member);
   }

   public Member getMember(int index)
   {
      return members.get(index);
   }

   public int getNumberOfMembers()
   {
      return members.size();
   }

   public MemberList getMembershipNotPaid(String membershipNotPaid)
   {
      MemberList list = new MemberList();
      for (int i = 0; i < members.size(); i++)
      {
         if (members.get(i).getMembershipPay()
               .equalsIgnoreCase(membershipNotPaid))
         {
            list.addMember(members.get(i));

         }
      }
      return list;
   }

   public String toString()
   {
      String all = "";
      for (int i = 0; i < members.size(); i++)
      {
         all += "\nMember #" + (i + 1) + "\n" + members.get(i);
         if (i < members.size() - 1)
            all += "\n";
      }
      return all;
   }

}
