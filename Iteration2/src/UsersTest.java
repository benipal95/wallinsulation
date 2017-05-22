import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Test;

public class UsersTest {

	String FN = "Sean";
	String LN = "Raghed";
	int state = 1; //customer
	String UN = "seanraghed01";
	String pass = "qwerty12345";
	String email = "sean.raghed@yahoo.com";
	Users seanTest = new Users(FN, LN, email, state,
			UN, pass);
	
	ObjectOutputStream objout;
	FileOutputStream fout;
	@Before
	public void setUp() throws Exception {
		String FN = "Sean";
		String LN = "Raghed";
		int state = 1; //customer
		String UN = "seanraghed01";
		String pass = "qwerty12345";
		String email = "sean.raghed@yahoo.com";
		Users beforeTest = new Users(FN, LN, email, state,
				UN, pass);
	}

	@Test
	public void testUsers() {
		assertNotNull(seanTest);
	}

	@Test
	public void testGetUsername() {
		assertNotNull(seanTest.getUsername());
	}

	@Test
	public void testGetPassword() {
		assertNotNull(seanTest.getPassword());
	}

	@Test
	public void testGetFName() {
		assertNotNull(seanTest.getFName());
	}

	@Test
	public void testGetLName() {
		assertNotNull(seanTest.getLName());
	}

	@Test
	public void testGetState() {
		assertNotNull(seanTest.getState());
	}

	@Test
	public void testGetEmail() {
		assertNotNull(seanTest.getEmail());
	}

	@Test
	public void testSetUserName() {
		Users beforeTest = new Users(FN, LN, email, state,
				"Potato", pass);
		seanTest.setUserName("Potato");
		assertEquals(beforeTest.getUsername(), seanTest.getUsername());
	}

	@Test
	public void testSetPassword() {
		Users beforeTest = new Users(FN, LN, email, state,
				UN, "Potato");
		seanTest.setPassword("Potato");
		assertEquals(beforeTest.getPassword(), seanTest.getPassword());
	}

	@Test
	public void testSetEmail() {
		Users beforeTest = new Users(FN, LN, "Potato@squad.com", state,
				UN, pass);
		seanTest.setEmail("Potato@squad.com");
		assertEquals(beforeTest.getEmail(), seanTest.getEmail());
	}

	@Test
	public void testExportData() throws IOException {

		String FN = "Sean";
		String LN = "Raghed";
		int state = 1; //customer
		String UN = "seanraghed01";
		String pass = "qwerty12345";
		String email = "sean.raghed@yahoo.com";
		Users beforeTest = new Users(FN, LN, email, state,
				UN, pass);
		
	seanTest.exportData();
	beforeTest.exportData();
	assertNotNull(seanTest.exportData());
	}

	@Test 
	public void testImportData() {

		String FN = "Sean";
		String LN = "Raghed";
		int state = 1; //customer
		String UN = "seanraghed01";
		String pass = "qwerty12345";
		String email = "sean.raghed@yahoo.com";
		Users beforeTest = new Users(FN, LN, email, state,
				UN, pass);
		
	seanTest.importData();
	beforeTest.importData();
	assertNotNull(seanTest.importData());
	}
}
