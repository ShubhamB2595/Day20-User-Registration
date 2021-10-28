import static org.junit.Assert.*;

import org.junit.Test;
/*
 * class for testing the users data
 */
public class TestUsers {
	
	//declaration
	String result;

	UserValidation testing = new UserValidation();

	@Test
	public void testingUsers() {
		
		result = testing.validFirstName("Shubham");
		assertEquals(result, "Valid");
		
		result = testing.validLastName("Bhele");
		assertEquals(result, "Valid");
		
		testing.validEmail("shubhambhele95@gmail.com");
		assertEquals(result, "Valid");
		
		testing.validMobile("91 8698348143");
		assertEquals(result, "Valid");
		
		testing.validPassword("Password#1");
		assertEquals(result, "Valid");
		
	}

}
