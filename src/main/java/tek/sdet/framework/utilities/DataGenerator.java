package tek.sdet.framework.utilities;

import com.github.javafaker.Faker;

public class DataGenerator {
	
	
	public static String addressGenerator(String input) {
		
		Faker faker = new Faker();
		
		String output ="";
		
		if(input.equalsIgnoreCase("countryValue")) {
			output = "United States";
		}else if (input.equalsIgnoreCase("fullnameValue")) {
			output = faker.name().fullName();
		}else if(input.equalsIgnoreCase("PhoneValue")) {
			output = faker.phoneNumber().cellPhone();
		}else if(input.equalsIgnoreCase("stAddress")) {
			output = faker.address().streetAddress();
		}else if(input.equalsIgnoreCase("aptValue")) {
			output = faker.address().secondaryAddress();
		}else if(input.equalsIgnoreCase("cityValue")) {
			output = faker.address().city();
		}else if(input.equalsIgnoreCase("stateValue")) {
			output = faker.address().state();
		}else if(input.equalsIgnoreCase("zipCodeValue")) {
			output = faker.address().zipCode();
		}
		
		return output;
	}
	
	public static void main(String[]arg){
		
		System.out.println(addressGenerator("countryValue"));
		System.out.println(addressGenerator("fullnameValue"));
		System.out.println(addressGenerator("PhoneValue"));
		System.out.println(addressGenerator("stAddress"));
		System.out.println(addressGenerator("aptValue"));
		System.out.println(addressGenerator("cityValue"));
		System.out.println(addressGenerator("stateValue"));
		System.out.println(addressGenerator("zipCodeValue"));
		
		
	}

}
