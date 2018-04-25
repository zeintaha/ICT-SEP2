package Member.domain.mediator;

import java.rmi.Remote;

import Member.domain.model.Member;

import Member.domain.model.MemberList;

public interface RemoteMemberModel extends Remote
{
   public MemberList getAll();

   public MemberList getMembershipNotPaid(String membershipNotPaid);

   public Member getMember(int index);

   public int getNumberOfMembers();

   public void addMember(Member member);

}
