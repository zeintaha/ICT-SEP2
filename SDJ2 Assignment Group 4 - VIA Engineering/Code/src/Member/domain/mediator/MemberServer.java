package Member.domain.mediator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import Member.Controler.MemberControler;
import Member.View.MemberConsol;
import Member.View.MemberView;
import Member.domain.model.Member;
import Member.domain.model.MemberList;

public class MemberServer extends UnicastRemoteObject implements RemoteMemberModel {
	private RemoteMemberModel memberList;
	private static MemberServer instance;

	private MemberServer() throws RemoteException {
		try {
			Registry reg = LocateRegistry.createRegistry(1099);
			Naming.rebind("MemberServer", this);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		memberList = new MemberModelManager();
		System.out.println("Starting server...");
	}

   @Override
   public MemberList getAll() throws RemoteException {
      // TODO Auto-generated method stub
      return memberList.getAll();
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


	

	public static MemberServer getInstance() throws RemoteException {
		if (instance == null) {
			instance = new MemberServer();
			return instance;
		}
		return instance;
	}
}
