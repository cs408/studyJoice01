package org.joice.cache.test.own;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

/** 
 * @author lxw 
 * @describe
 * @date 2017年11月2日 下午4:02:51 
 */
public class ConcurrentHashMapTest {

	@Test
	public void test() {
		ConcurrentHashMap<String, String> a = new ConcurrentHashMap<String, String>();
        
        for (int i = 0; i < 10; i++) {
            a.put("" + i, "v" + i);
        }
        System.out.println("map所有的key" + Arrays.toString(a.keySet().toArray()));
         
        for (String key : a.keySet()) {
            System.out.println(Arrays.toString(a.keySet().toArray()));
            a.remove(key);
        }
        System.out.println("最终map的key" + Arrays.toString(a.keySet().toArray()));
	}
	
	@Test
	public void test02(){
		ConcurrentHashMap<String, String> a = new ConcurrentHashMap<String, String>();
        
        for (int i = 0; i < 10; i++) {
            a.put("" + i, "v" + i);
        }
        System.out.println("map所有的key" + Arrays.toString(a.keySet().toArray()));
         
        int i = 9;
        for (String key : a.keySet()) {
            a.remove("" + i);
            i--;
            System.out.println(Arrays.toString(a.keySet().toArray()));
        }
        System.out.println("最终map的key" + Arrays.toString(a.keySet().toArray()));
	}
	
	@Test
	public void test03(){
		Collection<String> books = new HashSet<String>();
		books.add("1");
		books.add("2");
		books.add("3");
		System.out.println(books);
		Iterator<String> it = books.iterator();
		while(it.hasNext()){
			String book = it.next();
//			System.out.println(book);
			if(book.equals("2")){
//				books.remove(book);
				it.remove();
			}
		}
		System.out.println(books);
		
	}
	
	@Test
	public void test04(){
//		System.out.println(0.1f/0);
//		System.out.println(-0.1f/0);
//		System.out.println(0.1/0);
//		System.out.println(-0.1/0);
		System.out.println(1_1234_5678);
	}

}

