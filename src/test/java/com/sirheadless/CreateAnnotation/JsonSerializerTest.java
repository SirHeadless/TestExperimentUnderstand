package com.sirheadless.CreateAnnotation;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by
 * User: creuter
 * Date: 8/6/2018
 * Time: 12:37 PM
 * Test
 */
public class JsonSerializerTest {

	@Test
	public void checkSerialize() {

		Car car = new Car("Ford", "F150", "2018");
		System.out.println(JsonSerializer.serialize(car));
	}

}