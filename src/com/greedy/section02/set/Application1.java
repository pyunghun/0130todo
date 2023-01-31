package com.greedy.section02.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {

	public static void main(String[] args) {

		/* Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
		 * 1. 요소의 저장 순서를 유지하지 않는다.
		 * 2. 같은 요소의 중복 저장을 허용하지 않는다.(null갑도 중복하지 않게 하나의 null만 지정) 
		 * */
		
		/* HashSet 클래스
		 * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나
		 * JDK 1.2부터 제공되고 있으며 해시 알고리즘을 사용하여 빠르다는 장점
		 *  */
		
//		HashSet<Sting> hset = new HashSet<>();
		Set<String> hset = new HashSet<>();
//		Collection<String> cset = new HashSet<>();
		
		/* 저장 순서가 유지 안된다 */
		hset.add("java");
		hset.add("oracle");
		hset.add("jdbc");
		hset.add("html");
		hset.add("css");
		
		System.out.println("hset : " + hset);
		
		/* 중복 허용 안함 */
		hset.add("java");
		System.out.println("hset : " + hset);
		System.out.println("저장된 요소의 수 : " + hset.size());
		System.out.println("포함 확인 :  " + hset.contains(new String("oracle")));
		
		
		/* Set은 별도로 요소를 연속처리 할 수 있는 기능이 없다
		 * 인덱스를 사용하지 않기 때문이다.
		 *  */
		
		/* 1. toArray() 배열로 바꿔서 사용 */
		Object[] arr = hset.toArray();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
		/* 2. iterator()로 목록을 만들어서 처리 */
		Iterator<String> iter = hset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		hset.clear();
		System.out.println("empty? :" + hset.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
