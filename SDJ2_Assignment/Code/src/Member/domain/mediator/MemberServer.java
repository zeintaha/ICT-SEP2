package Member.domain.mediator;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MemberServer {
	private MemberModel memberList;
	public MemberServer() throws RemoteException
	{
		memberList=new MemberModelManager();
	}
	public static void main(String[] args) {
		try {
			MemberTextFile server = new MemberTextFile("src/member.txt");
			RemoteMember stub = (RemoteMember) UnicastRemoteObject.exportObject(server, 0);
			Registry reg = LocateRegistry.createRegistry(321);
			reg.rebind("members", stub);
			System.out.println("Starting server...");
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
