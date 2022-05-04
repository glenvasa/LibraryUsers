/**
 * 
 */
package com.glenvasa.library_users;

/**
 * @author glenv
 *
 */
public class LibraryInterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		KidUser k1 = new KidUser(10, "Kids");
		k1.registerAccount();
		k1.requestBook();

		KidUser k2 = new KidUser(18, "Fiction");
		k2.registerAccount();
		k2.requestBook();

		AdultUser a1 = new AdultUser(5, "Kids");
		AdultUser a2 = new AdultUser(23, "Fiction");
		a1.registerAccount();
		a1.requestBook();
		a2.registerAccount();
		a2.requestBook();

	}

}
