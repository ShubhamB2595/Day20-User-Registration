import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
	
	//Constructor
	public UserValidation() {
		
	}

	//method for first name
	public void validFirstName(String firstName) {
		
		String regexFN = "^[A-Z]{1}[a-zA-Z]{2,}";
        Pattern p = Pattern.compile(regexFN);
        Matcher matcher = p.matcher(firstName);
        boolean result = matcher.matches();
        if(result) {
        	System.out.println("Valid First Name: " + firstName);
        }
        else {
        	System.out.println("Invalid First Name: " + firstName);
        }
	}
	
	//method for last name
		public void validLastName(String lastName) {
			
			String regexLN = "^[A-Z]{1}[a-zA-Z]{2,}";
	        Pattern p = Pattern.compile(regexLN);
	        Matcher matcher = p.matcher(lastName);
	        boolean result = matcher.matches();
	        if(result) {
	        	System.out.println("Valid Last Name: " + lastName);
	        }
	        else {
	        	System.out.println("Invalid Last Name: " + lastName);
	        }
		}
		
		//method for Email ID 
		public void validEmail(String email) {
					
			String regexemail = "^[0-9a-zA-Z]+([_+-.][0-9a-zA-Z]+)*+" + "@[0-9a-zA-Z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2})?$";
			Pattern p = Pattern.compile(regexemail);
			Matcher matcher = p.matcher(email);
			boolean result = matcher.matches();
			if(result) {
				System.out.println("Valid Email ID: " + email);
			}
	        else {
	        	System.out.println("Invalid Email ID: " + email);
	        }
		}
		
		//method for mobile number as Country code follow by space and 10 digit number
		public void validMobile(String mobile) {
							
			String regexmobile = "^[0-9]{1,2}[' '][0-9]{10}$";
			Pattern p = Pattern.compile(regexmobile);
			Matcher matcher = p.matcher(mobile);
			boolean result = matcher.matches();
			if(result) {
				System.out.println("Valid Mobile Number: " + mobile);
			}
	        else {
	        	System.out.println("Invalid Mobile Number: " + mobile);
	        }
		}
		
		//method for password as Rules 
		/*
		 * Rule1 – minimum 8 Characters
		 */
		public void validPassword(String password) {
									
			String regexPass = "^[a-zA-Z]{8,}$";
			Pattern p = Pattern.compile(regexPass);
			Matcher matcher = p.matcher(password);
			boolean result = matcher.matches();
			if(result) {
				System.out.println("Valid Password: " + password);
			}
	        else {
		       	System.out.println("Invalid Password: " + password);
	       }
		}
}
