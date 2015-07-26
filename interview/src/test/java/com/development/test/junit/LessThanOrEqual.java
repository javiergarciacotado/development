package com.development.test.junit;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

public class LessThanOrEqual<T> extends BaseMatcher<T> {

	private final Comparable<T> expValue;

	public LessThanOrEqual(Comparable<T> expValue) {
		this.expValue= expValue;
	}
	
	@SuppressWarnings("unchecked")
	public boolean matches(Object object) {
		
		int compareTo = expValue.compareTo((T)object);
		return compareTo > -1;
	}

	public void describeTo(Description desc) {
		
		desc.appendText(" less than or equal(<=)" + expValue);
		
	}

	
}
