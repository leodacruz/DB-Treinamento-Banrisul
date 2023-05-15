package framework.Utils;

import java.util.Locale;

import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

public class FakersGeneration {

	private Faker faker;

	private String firstName;

	private String lastName;

	private String zipCode;

	public FakersGeneration(WebDriver driver) {

		faker = new Faker(new Locale("en-US"));

	}

	public String getFirstName() {

		firstName = faker.name().firstName();

		return firstName;

	}

	public String getLastName() {

		lastName = faker.name().lastName();

		return lastName;

	}

	public String getZipCode() {

		zipCode = faker.address().zipCode();

		return zipCode;

	}
	
	public String getEmail() {
		return faker.internet().emailAddress();
	}
	
	public String getSenha() {
		return faker.internet().password();
	}
	
}
