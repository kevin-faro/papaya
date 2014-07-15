package com.faro.papaya.lang;

/**
 * Extra math utilities
 */
public final class Math {
	private Math() {
	}

	/**
	 * Max of many integers
	 * 
	 * @param h
	 *            head
	 * @param t
	 *            tail
	 * @return max
	 */
	public static int max(int h, int... t) {
		int m = h;
		for (int i : t) {
			m = java.lang.Math.max(m, i);
		}
		return m;
	}

	/**
	 * Min of many integers
	 * 
	 * @param h
	 *            head
	 * @param t
	 *            tail
	 * @return min
	 */
	public static int min(int h, int... t) {
		int m = h;
		for (int i : t) {
			m = java.lang.Math.min(m, i);
		}
		return m;
	}

	/**
	 * Max of many longs
	 * 
	 * @param h
	 *            head
	 * @param t
	 *            tail
	 * @return max
	 */
	public static long max(long h, long... t) {
		long m = h;
		for (long i : t) {
			m = java.lang.Math.max(m, i);
		}
		return m;
	}

	/**
	 * Min of many longs
	 * 
	 * @param h
	 *            head
	 * @param t
	 *            tail
	 * @return min
	 */
	public static long min(long h, long... t) {
		long m = h;
		for (long i : t) {
			m = java.lang.Math.min(m, i);
		}
		return m;
	}

	/**
	 * Max of many floats
	 * 
	 * @param h
	 *            head
	 * @param t
	 *            tail
	 * @return max
	 */
	public static float max(float h, float... t) {
		float m = h;
		for (float i : t) {
			m = java.lang.Math.max(m, i);
		}
		return m;
	}

	/**
	 * Min of many floats
	 * 
	 * @param h
	 *            head
	 * @param t
	 *            tail
	 * @return min
	 */
	public static float min(float h, float... t) {
		float m = h;
		for (float i : t) {
			m = java.lang.Math.min(m, i);
		}
		return m;
	}

	/**
	 * Max of many doubles
	 * 
	 * @param h
	 *            head
	 * @param t
	 *            tail
	 * @return max
	 */
	public static double max(double h, double... t) {
		double m = h;
		for (double i : t) {
			m = java.lang.Math.max(m, i);
		}
		return m;
	}

	/**
	 * Min of many doubles
	 * 
	 * @param h
	 *            head
	 * @param t
	 *            tail
	 * @return min
	 */
	public static double min(double h, double... t) {
		double m = h;
		for (double i : t) {
			m = java.lang.Math.min(m, i);
		}
		return m;
	}
}
