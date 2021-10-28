import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
	
	//Constructor
	public UserValidation() {
		
	}

	//method for first name
	public String validFirstName(String firstName) {
		
        try {
        	String regexFN = "^[A-Z]{1}[a-zA-Z]{2,}";
            Pattern p = Pattern.compile(regexFN);
            Matcher matcher = p.matcher(firstName);
            boolean result = matcher.matches();
        	if(result) {
        		System.out.println("Valid First Name: " + firstName);
            	return "Valid";
            }
        	else {
        		System.out.println("Invalid First Name: " + firstName);
            	return "Invalid";
        	}
        }
        catch(Exception e) {
        	System.out.println("Something went wrong");
        }
		return firstName; 
	}
	
	//method for last name
		public String validLastName(String lastName) {
			
			try {
				String regexLN = "^[A-Z]{1}[a-zA-Z]{2,}";
		        Pattern p = Pattern.compile(regexLN);
		        Matcher matcher = p.matcher(lastName);
		        boolean result = matcher.matches();
		        if(result) {
		        	System.out.println("Valid Last Name: " + lastName);
		        	return "Valid";
		        }
		        else {
		        	System.out.println("Invalid Last Name: " + lastName);
		        	return "Invalid";
		        }
			}
			catch(Exception e) {
				System.out.println("Something went wrong");
			}
			return lastName;
		}
		
		//method for Email ID 
		public String validEmail(String email) {
			
			try {
				String regexemail = "^[0-9a-zA-Z]+([_+-.][0-9a-zA-Z]+)*+" + "@[0-9a-zA-Z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2})?$";
				Pattern p = Pattern.compile(regexemail);
				Matcher matcher = p.matcher(email);
				boolean result = matcher.matches();
				if(result) {
					System.out.println("Valid Email ID: " + email);
					return "Valid";
				}
		        else {
		        	System.out.println("Invalid Email ID: " + email);
		        	return "Invalid";
		        }
			}
			catch(Exception e) {
				System.out.println("Something went wrong");
			}
			return email;
		}
		
		//method for mobile number as Country code follow by space and 10 digit number
		public String validMobile(String mobile) {
			
			try {
				String regexmobile = "^[0-9]{1,2}[' '][0-9]{10}$";
				Pattern p = Pattern.compile(regexmobile);
				Matcher matcher = p.matcher(mobile);
				boolean result = matcher.matches();
				if(result) {
					System.out.println("Valid Mobile Number: " + mobile);
					return "Valid";
				}
		        else {
		        	System.out.println("Invalid Mobile Number: " + mobile);
		        	return "Invalid";
		        }
			}
			catch(Exception e) {
				System.out.println("Something went wrong");
			}
			return mobile;
		}
		
		//method for password as Rules 
		/*
		 * Rule1 – minimum 8 Characters
		 * Rule2 - at least 1 upper case
		 * Rule3 - at least 1 numeric number
		 * Rule4 - should have 1 special character
		 */
		public String validPassword(String password) {
			
			try {
				String regexPass = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}";
				Pattern p = Pattern.compile(regexPass);
				Matcher matcher = p.matcher(password);
				boolean result = matcher.matches();
				if(result) {
					System.out.println("Valid Password: " + password);
					return "Valid";
				}
		        else {
			       	System.out.println("Invalid Password: " + password);
			       	return "Invalid";
		       }
			}
			catch(Exception e) {
				System.out.println("Something went wrong");
			}
			return password;
		}
}
