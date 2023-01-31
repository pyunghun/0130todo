package com.greedy.section01.list.run;

import java.util.Stack;

public class Application4 {

	public static void main(String[] args) {

		/* Stack
		 * Stack은 리스트 계열 클래스의 Vector 클래스를 상속받아 구현한다.
		 * 후입선출(LIFO - Last Input First Out) 방식
		 * 
		 *  */
		Stack<Integer> integerStack = new Stack<>();
		
		/* Stack에 값을 넣을 때 push()를 이용한다. */
		integerStack.push(1);
		integerStack.push(2);
		integerStack.push(3);
		integerStack.push(4);
		integerStack.push(5);
		
		System.out.println(integerStack);
		
		/* Stack에서 요소를 찾을 때는 search()를 사용한다 */
		/* 정보가 저장 된 순서대로 위에서부터 1번 */
		System.out.println(integerStack.search(5));
		
		/* Stack에서 값을 꺼내는 메소드는 크게 2가지 
		 * 1. peek() : 해당 스택의 가장 마지막에 있는(상단) 요소 반환
		 * 2. pop() : 해당 스택의 가장 마지막에 있는(상단) 요소 반환 후 제거
		 * */
		
		System.out.println("peek() : " + integerStack.peek());
		System.out.println(integerStack);
		System.out.println("peek() : " + integerStack.peek());
		
		
		System.out.println("pop() : " + integerStack.pop());
		System.out.println(integerStack);
		System.out.println("pop() : " + integerStack.pop());
		System.out.println(integerStack);
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
		System.out.println("pop() : " + integerStack.pop());
//		System.out.println("pop() : " + integerStack.pop()); EmptyStackException 발생 (값이 없다)
		
	}

}
