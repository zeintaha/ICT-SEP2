package Member.domain.mediator;

import java.io.IOException;
import Member.domain.model.Member;
import Member.domain.model.MemberList;


public class MemberModelManager implements MemberModel {
private MemberList list;
private RemoteMember textFile;
public MemberModelManager() {
	try {
		this.textFile= new MemberTextFile("src/member.txt");
		this.list= textFile.load();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	@Override
	public MemberList getAll() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public MemberList getMembershipPaid(String membershipPay) {
		// TODO Auto-generated method stub
		return list.searchMembershipPaid(membershipPay);
	}

	@Override
	public int getNumberOfMembers() {
		// TODO Auto-generated method stub
		return list.getNumberOfMembers();
	}



	@Override
	public void addMember(Member member) {
		list.addMember(member);
		
	}

	@Override
	public Member getMember(int index) {
		// TODO Auto-generated method stub
		return list.getMember(index);
	}
}
