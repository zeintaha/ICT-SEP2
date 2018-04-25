package Member.View;

import Member.Controler.MemberControler;

public interface MemberView {
	void start(MemberControler controler);

	void show(String value);

	String get(String what);

}