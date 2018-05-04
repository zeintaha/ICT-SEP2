package Member.domain.mediator;

import java.io.IOException;

import Member.domain.model.MemberList;

public class MemberAdopter implements PersistanceMember  {
private MemberTextFile file;

public MemberAdopter() {
	super();
	try {
		this.file = new MemberTextFile("member.txt");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Override
public MemberList load() throws Exception {
	// TODO Auto-generated method stub
	return file.load();
}

}
