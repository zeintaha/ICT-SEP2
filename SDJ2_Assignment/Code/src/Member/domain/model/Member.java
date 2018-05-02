package Member.domain.model;

import java.io.Serializable;

public class Member implements Serializable
{
   private String name;
   private int age;
   private String membershipPay;

   public Member(String name, int age, String membershipPay)
   {
	   if ( membershipPay== null) {
			throw new IllegalArgumentException("Membership Fees Paid or not Paid is required");
		}
      this.name = name;
      this.age = age;
      this.membershipPay = membershipPay;
   }

   public String getName()
   {
      return name;
   }

   public int getAge()
   {
      return age;
   }

    public String getMembershipPay()
   {
      return membershipPay;
   }

   public String toString()
   {
      return "Name: " + name + "; Age: " + age + "; MemberShip Payment: "
            + membershipPay;

   }
}
