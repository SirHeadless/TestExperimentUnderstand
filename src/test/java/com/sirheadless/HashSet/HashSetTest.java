package com.sirheadless.HashSet;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by
 * User: creuter
 * Date: 7/26/2018
 * Time: 5:52 PM
 * Test
 */
public class HashSetTest {

	@Test
	public void superAndSubClassInHashSet(){
		Set<SuperClass> s = new HashSet<SuperClass>();
		s.add(new SuperClass("Test"));
		List<SubClass> list = Arrays.asList(new SubClass("ptest", "btest"), new SubClass("test2",""));
		s.addAll(list);
		s.add(new SubClass("sdsfd","dsdf"));
		System.out.println("bla");
	}


}
