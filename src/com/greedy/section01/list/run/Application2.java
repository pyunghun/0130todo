package com.greedy.section01.list.run;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.greedy.section01.list.comparator.AscendingPrice;
import com.greedy.section01.list.dto.BookDTO;

public class Application2 {

	public static void main(String[] args) {

		List<BookDTO> bookList = new ArrayList<>();
		
		bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
		bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
		bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
		bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
		bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));
//		
//		for(int i = 0; i < bookList.size(); i++) {
//			System.out.println(bookList.get(i));
//		}
		/* 향상된 for문 */
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		/*  */
//		bookList.forEach(System.out::println);
		
		bookList.sort(new AscendingPrice());
		System.out.println("가격 순 오름차순 정렬===============");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 익명 클래스는 {}를 만들어서 마치 Comparator 인터페이스를 상속받은 클래스를 작성하는 것과 같이 사용 */
		bookList.sort(new Comparator<BookDTO>() {
		
		@Override
		public int compare(BookDTO o1, BookDTO o2) {
			return o1.getPrice() >= o2.getPrice()? -1: 1;
		}
	});
	/* 람다식 활용 */
//	bookList.sort((BookDTO b1, BookDTO b2) -> b1.getPrice() >= b2.getPrice()? -1:1); 	
		
		
	System.out.println("가격 순 내림차순 정렬===============");
	for(BookDTO book : bookList) {
		System.out.println(book);
	}
	
	/* 제목 순 오름 */
	bookList.sort(new Comparator<BookDTO>() {

		@Override
		public int compare(BookDTO o1, BookDTO o2) {
			/* */
			return o1.getTitle().compareTo(o2.getTitle());
		}
		
		
	
	
	});
	
	System.out.println("제목순 오름차순============");
	for(BookDTO book : bookList) {
		System.out.println(book);
	}
	
	/* 제목 순 내림차순 정렬 */
	bookList.sort(new Comparator<BookDTO>() {

		@Override
		public int compare(BookDTO o1, BookDTO o2) {
			return o1.getTitle().compareTo(o2.getTitle()) * -1;
		}
		
		
	});
	
	System.out.println("제목순 내림차순=========");
	for(BookDTO book : bookList) {
		System.out.println(book);
	}
	
	/*작가 와 넘버로 오름, 내림차순*/
	bookList.sort(new Comparator<BookDTO>() {

		@Override
		public int compare(BookDTO o1, BookDTO o2) {
			
			return o1.getNumber() >= o2.getNumber()? 1:-1;
		}
	});
	System.out.println("넘버 순 오름차순 정렬==========");
	for(BookDTO book : bookList) {
		System.out.println(book);
	}
	
	bookList.sort(new Comparator<BookDTO>() {

		@Override
		public int compare(BookDTO o1, BookDTO o2) {
			
			return o1.getNumber() >= o2.getNumber()? -1:1;
		}
	});
	System.out.println("넘버 순 내림차순 정렬==========");
	for(BookDTO book : bookList) {
		System.out.println(book);
	}
	
	bookList.sort(new Comparator<BookDTO>() {

		@Override
		public int compare(BookDTO o1, BookDTO o2) {
			return o1.getAuthor().compareTo(o2.getAuthor())* -1;
		}
	});
	System.out.println("작가 순 내림차순 정렬==========");
	for(BookDTO book : bookList){
		System.out.println(book);
	}
	}
}
