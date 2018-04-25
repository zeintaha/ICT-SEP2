package Member.domain.mediator;

import Member.domain.model.Member;

import Member.domain.model.MemberList;

public interface MemberModel {
	public MemberList getAll();
	public MemberList getMembershipPaid(String membershipPay);
	public Member getMember(int index);
	public int getNumberOfMembers();
	public void addMember(Member member);
	
}
