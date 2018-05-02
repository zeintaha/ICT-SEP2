package Member.domain.mediator;

import java.rmi.Remote;

import Member.domain.model.MemberList;

public interface PersistanceMember extends Remote
{
   public MemberList load() throws Exception;
}
