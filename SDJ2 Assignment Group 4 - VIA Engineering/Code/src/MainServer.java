
import Member.domain.mediator.ServerMemberModel;

public class MainServer {

	public static void main(String[] args) {
		try {
			ServerMemberModel server1 = ServerMemberModel.getInstance();
			ServerMemberModel server2 = ServerMemberModel.getInstance();
			System.out.println("sever1 = " + server1);
			System.out.println("sever2 = " + server2);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
