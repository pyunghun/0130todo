package com.greedy.section02.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {

	public static void main(String[] args) {

		
		/* LinkedHashSet 클래스
		 * HashSet이 가지고 있는 기능을 모두 가지고 있고
		 * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다
		 * jdk 1.4부터 제공한다.
		 *  */
		
		LinkedHashSet<String> lhset = new LinkedHashSet<>();
		lhset.add("java");
		lhset.add("oracle");
		lhset.add("jdbc");
		lhset.add("html");
		lhset.add("css");
		
		System.out.println("lhset : " + lhset);
		
		/* 기본적으로 오름차순 정렬이 되어 있다. */
		TreeSet<String> test = new TreeSet<>(lhset);
		System.out.println("test : " + test);
		
	}

}
