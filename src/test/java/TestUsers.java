import org.junit.Assert;
import org.junit.Test;

/*
 * class for testing the users data
 */
public class TestUsers {

	UserValidation userTesting = new UserValidation();

	@Test
	public void givenFirstName_WhenProper_ShouldReturn_True() {
		
		Assert.assertEquals(true, userTesting.name.test("Shubham"));
	}

	@Test
	public void givenFirstName_WhenNotProper_ShouldReturn_False() {
		
		Assert.assertEquals(false, userTesting.name.test("Sh"));
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturn_True() {
		
		Assert.assertEquals(true, userTesting.name.test("Bhele"));
	}

	@Test
	public void givenLastName_WhenNotProper_ShouldReturn_False() {
		;
		Assert.assertEquals(false, userTesting.name.test("Bh"));
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturn_True() {
		
		Assert.assertEquals(true, userTesting.email.test("abc.xyz@bl.co.in"));
	}

	@Test
	public void givenEmail_WhenNotProper_ShouldReturn_False() {
	
		Assert.assertEquals(false, userTesting.email.test("shubham@.com"));
	}

	@Test
	public void givenPhone_WhenProper_ShouldReturn_True() {
		
		Assert.assertEquals(true, userTesting.mobile.test("91 8055956680"));
	}

	@Test
	public void givenPhone_WhenNotProper_ShouldReturn_False() {
		
		Assert.assertEquals(false, userTesting.mobile.test("8055956680"));
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturn_True() {
	
		Assert.assertEquals(true, userTesting.password.test("abcdfdA@fg0"));
	}

	@Test
	public void givenPassword_WhenNotProper_ShouldReturn_False() {
	
		Assert.assertEquals(false, userTesting.password.test("adasdas0daS"));
	}

}
