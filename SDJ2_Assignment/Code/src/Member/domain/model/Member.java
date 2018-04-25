package Member.domain.model;

public class Member {
	private String name;
	private int age;
	private String membershipPay;

	public Member(String name, int age, String membershipPay) {
		this.name = name;
		this.age = age;
		this.membershipPay = membershipPay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMembershipPay() {
		return membershipPay;
	}

	public void setMembershipPay(String membershipPay) {
		this.membershipPay = membershipPay;
	}

	public String toString() {
		return name + age + membershipPay;

	}
}
