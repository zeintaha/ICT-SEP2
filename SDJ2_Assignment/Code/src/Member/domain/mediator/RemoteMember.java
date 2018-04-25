package Member.domain.mediator;
import java.lang.reflect.Member;
import java.rmi.Remote;

import Member.domain.model.MemberList;
public interface RemoteMember extends Remote {
public MemberList load()throws Exception;

public void save(MemberList memberList) throws Exception;

public void save (Member member) throws Exception;
}
