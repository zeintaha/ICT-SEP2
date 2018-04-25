package Member.domain.model;

import java.util.ArrayList;

public class MemberList
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

   public MemberList searchMembershipNotPaid(String membershipNotPaid)
   {
      MemberList list = new MemberList();
      for (int i = 0; i < members.size(); i++)
      {
         if (members.get(i).getMembershipPay().equalsIgnoreCase(membershipNotPaid))
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
   
   public static void main(String[] args)
   {
      Member mem1 = new Member("oskars", 2, "paid");
      Member mem2 = new Member("Taha", 3, "not Paid");
      Member mem3 = new Member("Taha11", 13, "not Paid");
      
      MemberList list = new MemberList();
      
      list.addMember(mem1);
      list.addMember(mem2);
      list.addMember(mem3);
     System.out.println(list.searchMembershipNotPaid("not Paid"));
     
   }
}
