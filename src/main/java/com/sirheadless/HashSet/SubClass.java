package com.sirheadless.HashSet;

/**
 * Created by
 * User: creuter
 * Date: 7/26/2018
 * Time: 5:53 PM
 * Test
 */
public class SubClass extends SuperClass {

	private final String subTest;

	public SubClass(String superTest, String subTest) {
		super(superTest);
		this.subTest = subTest;
	}

	public String getSubTest() {
		return subTest;
	}
}
