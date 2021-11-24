
public class UserRegistration {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to User registration System Day20");
		
		//obj
		UserValidation validate = new UserValidation();
		
		System.out.println("Shubham : " + validate.name.test("Shubham"));
		System.out.println("Bhele : " + validate.name.test("Bhele"));
		System.out.println("shubhambhele95@gmail.com : " + validate.email.test("shubhambhele95@gmail.com"));
		System.out.println("91 8698348143 : " + validate.mobile.test("91 8698348143"));
		System.out.println("Pass9@word : " + validate.password.test("Pass9@word"));
		
	
		//Obj
		SampleEmailValidation sampleEmail = new SampleEmailValidation();
		System.out.println("\nChecking all email samples: \n");
		sampleEmail.validateEmail();
	}

}
