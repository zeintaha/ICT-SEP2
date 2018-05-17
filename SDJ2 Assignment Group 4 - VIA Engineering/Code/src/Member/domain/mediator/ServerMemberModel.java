package Member.domain.mediator;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import Member.domain.model.Member;
import Member.domain.model.MemberList;

public class ServerMemberModel extends UnicastRemoteObject implements RemoteMemberModel {
	private MemberList memberList;
	 private PersistanceMember textFile;
	private static ServerMemberModel instance;

	public ServerMemberModel() throws Exception {
		try {
			Registry reg = LocateRegistry.createRegistry(1099);
			reg.rebind("MemberServer", this);
			this.textFile = new MemberAdopter();
			memberList = textFile.load();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println("Starting server...");
	}

   @Override
   public MemberList getAll() throws RemoteException {
      // TODO Auto-generated method stub
      return memberList;
   }

   @Override
   public MemberList getMembershipNotPaid() throws RemoteException {

      return memberList.getMembershipNotPaid();
   }

   @Override
   public Member getMember(int index) throws RemoteException {
      // TODO Auto-generated method stub
      return memberList.getMember(index);
   }

   @Override
   public int getNumberOfMembers() throws RemoteException {
      // TODO Auto-generated method stub
      return memberList.getNumberOfMembers();
   }

   @Override
   public void addMember(Member member) throws RemoteException {
      memberList.addMember(member);

   }


	

	public static ServerMemberModel getInstance() throws Exception {
		if (instance == null) {
			instance = new ServerMemberModel();
			return instance;
		}
		return instance;
	}
}