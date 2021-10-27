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
}
