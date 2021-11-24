import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserValidation {

	// Constructor
	public UserValidation() {

	}

	// declaration
	private static String REGEX_NAME = "^[A-Z]{1}[a-zA-Z]{2,}";
	private static String REGEX_MAIL = "^[0-9a-zA-Z]+([_+-.][0-9a-zA-Z]+)*+"
			+ "@[0-9a-zA-Z]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2})?$";
	private static String REGEX_MOBILE = "^[0-9]{1,2}[' '][0-9]{10}$";
	private static String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}";

	// method for checking name, re-factored using lambda
	Predicate<String> name = i -> {
		Pattern p = Pattern.compile(REGEX_NAME);
		return p.matcher(i).matches();
	};
	
	// method for checking email, re-factored using lambda
	Predicate<String> email = i -> {
		Pattern p = Pattern.compile(REGEX_MAIL);
		return p.matcher(i).matches();
	};
	
	// method for checking mobile, re-factored using lambda
	Predicate<String> mobile = i -> {
		Pattern p = Pattern.compile(REGEX_MOBILE);
		return p.matcher(i).matches();
	};

	// method for checking password, re-factored using lambda
	Predicate<String> password = i -> {
		Pattern p = Pattern.compile(REGEX_PASSWORD);
		return p.matcher(i).matches();
	};
	
/*
	// method for first name
	public boolean validFirstName(String firstName) {

		Pattern p = Pattern.compile(REGEX_NAME);
		return p.matcher(firstName).matches();
	}

	// method for last name
	public boolean validLastName(String lastName) {

		Pattern p = Pattern.compile(REGEX_NAME);
		return p.matcher(lastName).matches();
	}

	// method for Email ID
	public boolean validEmail(String email) {

		Pattern p = Pattern.compile(REGEX_MAIL);
		return p.matcher(email).matches();
	}

	// method for mobile number as Country code follow by space and 10 digit number
	public boolean validMobile(String mobile) {

		Pattern p = Pattern.compile(REGEX_MOBILE);
		return p.matcher(mobile).matches();
	}

//	  Rule1 – minimum 8 Characters Rule2 - at least 1 upper case Rule3 - at least 1
//	  numeric number Rule4 - should have 1 special character
 
	// method for password as Rules 
	public boolean validPassword(String password) {

		Pattern p = Pattern.compile(REGEX_PASSWORD);
		return p.matcher(password).matches();
	}
*/	

}
