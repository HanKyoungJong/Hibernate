package chap01.crud;

import static org.junit.Assert.assertEquals;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import util.HibernateUtil;

public class MemberTest {

	SessionFactory factory = HibernateUtil.getSessionFactory();

	@Test
	public void test() {
		System.out.println("»ğÀÔÀÛ¾÷");

		Member member = new Member("1", "22");

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(member);
		session.getTransaction().commit();
		assertEquals(1, 1);
	}
}
