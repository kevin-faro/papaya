package com.faro.papaya.lang;

import static com.faro.papaya.lang.Math.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {
	@Test
	public void testIntMax2() {
		assertEquals(5, max(3, 5));
	}

	@Test
	public void testIntMax3() {
		assertEquals(5, max(3, 4, 5));
	}

	@Test
	public void testIntMin2() {
		assertEquals(3, min(3, 5));
	}

	@Test
	public void testIntMin3() {
		assertEquals(3, min(3, 4, 5));
	}

	@Test
	public void testLongMax2() {
		assertEquals(5L, max(3L, 5L));
	}

	@Test
	public void testLongMax3() {
		assertEquals(5L, max(3L, 4L, 5L));
	}

	@Test
	public void testLongMin2() {
		assertEquals(3L, min(3L, 5L));
	}

	@Test
	public void testLongMin3() {
		assertEquals(3L, min(3L, 4L, 5L));
	}

	@Test
	public void testFloatMax2() {
		assertEquals(5.0F, max(3.0F, 5.0F), .000001F);
	}

	@Test
	public void testFloatMax3() {
		assertEquals(5.0F, max(3.0F, 4.0F, 5.0F), .000001F);
	}

	@Test
	public void testFloatMin2() {
		assertEquals(3.0F, min(3.0F, 5.0F), .000001F);
	}

	@Test
	public void testFloatMin3() {
		assertEquals(3.0F, min(3.0F, 4.0F, 5.0F), .000001F);
	}

	@Test
	public void testDoubleMax2() {
		assertEquals(5.0D, max(3.0D, 5.0D), .000001D);
	}

	@Test
	public void testDoubleMax3() {
		assertEquals(5.0D, max(3.0D, 4.0D, 5.0D), .000001D);
	}

	@Test
	public void testDoubleMin2() {
		assertEquals(3.0D, min(3.0D, 5.0D), .000001D);
	}

	@Test
	public void testDoubleMin3() {
		assertEquals(3.0D, min(3.0D, 4.0D, 5.0D), .000001D);
	}
}
