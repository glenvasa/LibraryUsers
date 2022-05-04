/**
 * 
 */
package com.glenvasa.library_users;

/**
 * @author glenv
 *
 */
public class AdultUser implements LibraryUser {

	private int age;
	private String bookType;

	AdultUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if (age > 12) {
			System.out.println("You have successfully registered under an Adult Account.");
		} else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
		}

	}

	@Override
	public void requestBook() {
		if (bookType == "Fiction") {
			System.out.println("Book Issued successfully, please return the book within 7 days.");
		} else {
			System.out.println("Oops, you are allowed to take only adult Fiction books.");
		}

	}

}
