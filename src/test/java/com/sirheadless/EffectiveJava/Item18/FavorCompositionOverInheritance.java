package com.sirheadless.EffectiveJava.Item18;

import com.sirheadless.EffectiveJava.Item18.WrapperExample.InstrumentedSet;
import com.sirheadless.EffectiveJava.Item18.negativeExample.InstrumentedHashSet;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by
 * User: creuter
 * Date: 7/26/2018
 * Time: 5:21 PM
 * Test
 */
public class FavorCompositionOverInheritance {

	@Test
	public void extendedHashSet() {
		InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();
		s.addAll(Arrays.asList("BLA", "blus", "Blab"));
		System.out.println(s.getAddCount());
	}

	@Test
	public void wrapperExample(){
		Set<String> hashSet = new HashSet<String>();
		InstrumentedSet<String> s = new InstrumentedSet<String>(hashSet);
		s.addAll(Arrays.asList("BLA", "blus", "Blab"));
		System.out.println(s.getAddCount());
	}
}
