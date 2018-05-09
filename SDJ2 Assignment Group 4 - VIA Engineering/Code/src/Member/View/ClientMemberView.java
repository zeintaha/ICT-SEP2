package Member.View;

import java.rmi.RemoteException;

import Member.Controler.ClientMemberController;
import Member.Controler.MemberControler;

public interface ClientMemberView
{
   void start(ClientMemberController controler) throws RemoteException;

   void show(String value);

}