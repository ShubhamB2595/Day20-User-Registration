
public class UserRegistration {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to User registration System Day20");
		
		UserValidation validate = new UserValidation();
		validate.validFirstName("Shubham");
		validate.validLastName("Bhele");
		validate.validEmail("shubhambhele95@gmail.com");
		validate.validMobile("91 8698348143");
	}

}
