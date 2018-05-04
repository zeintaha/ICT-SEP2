package Member.domain.mediator;

import java.rmi.Remote;
import java.rmi.RemoteException;

import Member.domain.model.Member;

import Member.domain.model.MemberList;

public interface RemoteMemberModel extends Remote
{
   public MemberList getAll() throws RemoteException;

   public MemberList getMembershipNotPaid()throws RemoteException;

   public Member getMember(int index) throws RemoteException;

   public int getNumberOfMembers() throws RemoteException;

   public void addMember(Member member) throws RemoteException;

}
