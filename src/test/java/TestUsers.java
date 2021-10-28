import static org.junit.Assert.*;

import org.junit.Test;

public class TestUsers {

	UserValidation testing = new UserValidation();

	@Test
	public void testingUsers() {
		
		testing.validFirstName("Shubham");
		testing.validLastName("Bhele");
		testing.validEmail("shubhambhele95@gmail.com");
		testing.validMobile("91 8698348143");
		testing.validPassword("Password#1");
		
	}

}
