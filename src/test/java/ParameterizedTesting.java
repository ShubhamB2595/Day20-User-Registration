import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTesting {
	
	UserValidation emailTesting = new UserValidation();
	@Parameter
    public String emailID;
	
	@Parameters(name = "{index}: testEmails = {0}")
	public static Object[] data() {
		return new Object[] { 
				// Valid emails
				"abc@yahoo.com",
				"abc-100@yahoo.com",
				"abc.100@yahoo.com",
				"abc111@abc.com",
				"abc-100@abc.net",
				"abc.100@abc.com.au",
				"abc@1.com",
				"abc@gmail.com.com",
				"abc+100@gmail.com",
			 
				//	Invalid emails
				"abc",
				"abc@.com.my",
				"abc123@gmail.a",
				"abc123@.com",
				"abc123@.com.com",
				".abc@abc.com",
				"abc()*@gmail.com",
				"abc@%*.com",
				"abc..2002@gmail.com",
				"abc.@gmail.com",
				"abc@abc@gmail.com",
				"abc@gmail.com.1a",
				"abc@gmail.com.aa.au",
	    };
	}
  
    @Test
    public void testingEmials() {
    	
    	emailTesting.validEmail(emailID);
    	
    }


}
