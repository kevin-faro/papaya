package com.faro.papaya.util;

/**
 * Some Utilities for working with objects
 */
public final class Objects {
	private Objects() {/* noop */}
	
	/**
	 * Simple check for null
	 * 
	 * @param o
	 * @return true if o is null
	 */
	public static boolean isNull(Object o) {
		return null == o;
	}
}
