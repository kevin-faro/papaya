package com.faro.papaya.util;

/**
 * Build a value based on a key.
 *
 * @param <K>
 * @param <V>
 */
public interface ValueFactory<K, V> {
	V build(K key);
}
