package Member.View;

import java.rmi.RemoteException;

import Member.Controler.MemberController;

public interface MemberView
{
   void start(MemberController controler) throws RemoteException;

   void show(String value);

}