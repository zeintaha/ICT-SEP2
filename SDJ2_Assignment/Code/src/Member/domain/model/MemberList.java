package Member.domain.model;

import java.io.Serializable;
import java.util.ArrayList;

public class MemberList implements Serializable {
	private ArrayList<Member> members;

	public MemberList() {
		this.members = new ArrayList<Member>();
	}

	public void addMember(Member member) {
		members.add(member);
	}

	public int getNumberOfMembers() {
		return members.size();
	}

	public Member getMember(int index) {
		return members.get(index);
	}

	public MemberList getMembershipNotPaid() {
		MemberList list = new MemberList();
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getMembershipPay().equalsIgnoreCase("not paid")) {
				list.addMember(members.get(i));

			}
		}
		return list;
	}

	public String toString() {
		String all = "";
		for (int i = 0; i < members.size(); i++) {
			all += members.get(i);
			all += "\n";

		}
		return all;
	}

}
