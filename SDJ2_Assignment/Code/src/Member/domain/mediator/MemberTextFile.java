package Member.domain.mediator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import Member.domain.model.Member;
import Member.domain.model.MemberList;

public class MemberTextFile implements RemoteMember {
	private File file;

	public MemberTextFile(String filename) throws IOException {
		file = new File(filename);
		if (file == null) {
			throw new FileNotFoundException(null);
		}
	}

	@Override
	public MemberList load() throws FileNotFoundException {
		MemberList list = new MemberList();
		Scanner in = null;

		while (in.hasNext()) {
			in = new Scanner(file);
			String[] lineToken = in.nextLine().split(";");
			String memberName = lineToken[0].trim();
			int age = Integer.parseInt(lineToken[1].trim());
			String membershipPay = lineToken[2].trim();
			Member member = new Member(memberName, age, membershipPay);
			list.addMember(member);
		
			in.close();
			}
		return list;
		
	}

	@Override
	public void save(MemberList memberList) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(java.lang.reflect.Member member) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
