package org.example.service.collections;

/*
   Least Recently Used (LRU) Cache - Implement LRU Cache that puts a (key, value) pair and gets the value corresponding to the key, in O(1) avg time. Example -
   If we have a cache of size 3, and we do the following operations -
   - put(1,1)
   - put(2, 2)
   - get(1) --> returns 1
   - put(3, 3)
   - put(4, 4) --> deletes (2, 2) as its the one which is least recently used
   - get(2) --> -1 (as its deleted)
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {

        LRUCache<Integer, String> lruCache = new LRUCache<>(3);

        lruCache.put(1, "One");
        lruCache.put(2, "Two");
        lruCache.put(3, "Three");

        System.out.println("Initial LRU Cache: " + lruCache);

        lruCache.get(1); // Accessing key 1 moves it to the most recently used position
        lruCache.put(4, "Four"); // Adding a new entry, which will trigger removal of the least recently used entry (key 2)

        System.out.println("Updated LRU Cache: " + lruCache);
    }
}

