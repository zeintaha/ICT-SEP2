package Member.domain.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MemberTest {

	private Member member1;
	private Member member2;
	private Member member3;

	@Before
	public void setUp() throws Exception {
		member1 = new Member("Taha", 26, "paid");
		member2 = new Member("Alex", 24, "not paid");
		member3 = new Member("Oskar", 22, "not paid");
	}

	@Test
	public void getName_GetsTheNameFromConstructor() {
		assertEquals("Taha", member1.getName());
		assertEquals("Alex", member2.getName());
		assertEquals("Oskar", member3.getName());
		
	}
	@Test
	public void getAge_GetsTheAgeFromConstructor() {
		assertEquals(26, member1.getAge());
		assertEquals(24, member2.getAge());
		assertEquals(22, member3.getAge());
		
	}
	@Test
	public void getMembershipPay_GetsTheMembershipPayFromConstructor() {
		assertEquals("paid", member1.getMembershipPay());
		assertEquals("not paid", member2.getMembershipPay());
		assertEquals("not paid", member3.getMembershipPay());
	}
	@Test(expected=IllegalArgumentException.class)
	public void MembershipFeesIsRequired() {
		new Member("Taha",26, null);
	}
}
