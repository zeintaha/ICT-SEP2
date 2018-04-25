import Member.domain.mediator.MemberClient;

public class MainClient
{

   public static void main(String[] args)
   {
      MemberClient client = new MemberClient();
      client.getMembershipNotPaid("not paid");
      client.getAll();

   }

}
