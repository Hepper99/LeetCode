package cn.zyy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class LRUCache {
	private int capacity;
	private LinkedList<HashMap> queue;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.queue = new LinkedList<HashMap>();
    }
    
    public int get(int key) {
    	int index;
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i=0;i<queue.size();i++)
    	{
    		map = queue.get(i);
    		if(map.containsKey(key))
    		{
    			return map.get(key);
    		}
    	}
    	return -1;
    }
    
    public void set(int key, int value) {
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(key,value);
    	int index;
    	if((index = queue.indexOf(map)) != -1)
    	{
    		queue.remove(index);
    		queue.addLast(map);
    	}
    	else if(queue.size() >= capacity)
        {
        	queue.removeFirst();
        	queue.addLast(map);
        }
    	else{
    		queue.addLast(map);
    	}
    }
}

class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		LRUCache lruCache = new LRUCache(4);
		for(int i=0;i<n;i++)
		{
			int key = s.nextInt();
			int value = s.nextInt();
			lruCache.set(key, value);
			System.out.println(lruCache.get(1));
		}
		
	}
}