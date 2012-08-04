package org.nohope.typetools;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Map;

/**
 * Date: 04.08.12
 * Time: 17:35
 */
public class TMap {
    private TMap() {
    }

    public static <V> V get(final Map<String, V> map, final String key) {
        return map.get(key);
    }

    public static <V> V get(final Map<String, V> map, final Enum key) {
        return map.get(key.toString());
    }

    public static <V, T extends V> T safeGet(final Map<String, V> map, final String key, final Class<T> clazz) {
        return Cast.as(map.get(key), clazz);
    }
    public static <V, T extends V> T safeGet(final Map<String, V> map, final Enum key, final Class<T> clazz) {
        return Cast.as(map.get(key.toString()), clazz);
    }

    public static <V, T extends V> T safeGet(final Map<String, V> map, final String key, final TypeReference<T> ref) {
        return Cast.as(map.get(key), ref);
    }
    public static <V, T extends V> T safeGet(final Map<String, V> map, final Enum key, final TypeReference<T> ref) {
        return Cast.as(map.get(key.toString()), ref);
    }

}