package com.sirheadless.EffectiveJava.Item18.negativeExample;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by
 * User: creuter
 * Date: 7/26/2018
 * Time: 5:22 PM
 * Test
 */
public class InstrumentedHashSet<E> extends HashSet<E> {
	private int addCount = 0;

	public InstrumentedHashSet() {
	}

	public InstrumentedHashSet(int initialCapacity, float loadFactor) {
		super(initialCapacity, loadFactor);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

//	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}
}
