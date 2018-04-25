package Member.Controler;

import Member.View.MemberView;
import Member.domain.mediator.MemberModel;
import Member.domain.model.MemberList;

public class MemberControler {
	private MemberView view;
	private MemberModel modelManager;
	public MemberControler(MemberView view, MemberModel modelManager) {
		super();
		this.view = view;
		this.modelManager = modelManager;
	}
	public void execute(String what) {
	    switch (what)
	    {
	        case "1":
	            view.show("" + modelManager.getAll());
	            break;
	        case "2":
	        	String input=view.get("MembershipPaid");
	        	if (input == null)
	                return;
	            String msg = "";
	            
	            MemberList list= modelManager.getMembershipPaid(input);
	            for (int i = 0; i < list.getNumberOfMembers(); i++)
	            {
	                msg += list.getMember(i) + "\n";
	            }
	            if (list.getNumberOfMembers() == 0)
	            {
	                msg = "No CD with title: \"" + input + "\" found";
	            }
	            
	            view.show(msg);
	            break;
	        case "3":  
	        	System.out.println("Quit");
	            break;
	        default:
	            view.show("Wrong input");
	            break;
	    }

}
}