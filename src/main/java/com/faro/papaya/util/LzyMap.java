package com.faro.papaya.util;

import static com.faro.papaya.util.Objects.isNull;

import java.util.Map;

/**
 * A lazy map that will load the value in the map in the case get is called with
 * a factory and the underlying map does not have any value associated with a
 * key.
 * 
 * The ideal use of this class is to prime the map with a container so you can avoid code like:
 * <code>
 * if(!map.contains(key) {
 *   map.put(new Container());
 * }
 * map.get(key).add(value);
 * </code>
 * 
 * and to provide a similar semantic to using a ConcurrentHashMap without locking and extraneous object creation:
 * <code>
 * concurrentHashMap.putIfAbsent(key, new Container());
 * concurrentHashMap.get(key).add(value);
 * </code>
 * 
 * instead, both situations would be replaced by:
 * <code>
 * lzyMap.get(key, containerFactory).add(value);
 * </code>
 * 
 * @param <K>
 * @param <V>
 */
public class LzyMap<K, V> extends AbstractMapDecorator<K, V> {

	public LzyMap(Map<K, V> underlying) {
		super(underlying);
	}

	/**
	 * Get a value from the map.  If the map doesn't contain the key, it will load the value built in the factory.
	 * 
	 * @param key
	 * @param factory
	 * @return the value
	 */
	public V get(K key, ValueFactory<K, V> factory) {
		V value = super.get(key);

		if (isNull(value) && !super.containsKey(key)) {
			value = factory.build(key);
			super.put(key, value);
		}

		return value;
	}

}
