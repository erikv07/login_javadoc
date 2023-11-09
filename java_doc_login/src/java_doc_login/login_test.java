package java_doc_login;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class login_test {
	@Test
	public void testSuccesfulLogin() {
		login loginScreen = new login();
		assertTrue(loginScreen.login("john","password123"));
	}
	
	@Test
	public void testFailedLogin() {
		login loginScreen = new login();
		assertFalse(loginScreen.login("john","wrongPassowrd123"));
	}
	
	@Test
	public void testAddUser() {
		login loginScreen = new login();
		loginScreen.addUser("testuser","testpassword");
		assertTrue(loginScreen.login("testuser","testpassword"));
	}
}

