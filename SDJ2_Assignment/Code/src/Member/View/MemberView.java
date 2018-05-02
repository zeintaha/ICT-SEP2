package Member.View;

import java.rmi.RemoteException;

import Member.Controler.MemberControler;

public interface MemberView
{
   void start(MemberControler controler) throws RemoteException;

   void show(String value);

}