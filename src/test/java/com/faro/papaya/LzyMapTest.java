package com.faro.papaya;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Assert;
import org.junit.Test;

import com.faro.papaya.util.LzyMap;
import com.faro.papaya.util.ValueFactory;

public class LzyMapTest {

	@Test
	public void testLoad() {
		LzyMap<String, AtomicInteger> map = new LzyMap<>(new HashMap<String, AtomicInteger>());
		ValueFactory<String, AtomicInteger> aIntFactory = new ValueFactory<String, AtomicInteger>() {
			@Override
			public AtomicInteger build(String key) {
				return new AtomicInteger(0);
			}
		};
		
		Assert.assertNull(map.get("abc"));
		Assert.assertEquals(0, map.get("abc", aIntFactory).intValue());
		Assert.assertNotNull(map.get("abc"));
	}
	
	@Test
	public void testNullNotLoad() {
		LzyMap<String, AtomicInteger> map = new LzyMap<>(new HashMap<String, AtomicInteger>());
		ValueFactory<String, AtomicInteger> aIntFactory = new ValueFactory<String, AtomicInteger>() {
			@Override
			public AtomicInteger build(String key) {
				return new AtomicInteger(0);
			}
		};
		
		map.put("abc", null);
		Assert.assertNull(map.get("abc", aIntFactory));
	}
}
