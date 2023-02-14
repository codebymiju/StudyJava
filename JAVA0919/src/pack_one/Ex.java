package pack_one;

import java.util.Random;

import pack_two.ExPack;

import pack_three.*;

public class Ex {

	public static void main(String[] args) {
		/*
		 * package(패키지)
		 * - 윈도우의 폴더, 리눅스의 디렉토리에 해당하는 개념
		 * - 자바의 클래스 파일들을 모아놓는 공간
		 * 	 -> 서로 다른 패키지는 같은 이름의 클래스가 각각 존재 가능
		 *     (= 같은 이름의 파일이 서로 다른 폴더에 존재할 수 있는 것과 동일)
		 *     (= 같은 이름의 클래스가 같은 패키지에 위치할 수 없음)
		 * - 특정 클래스 파일은 하나의 패키지에'만' 소속될 수 있음
		 * - 자바의 모든 클래스는 클래스명 앞에 패키지명을 기술하여 표기
		 * 	 -> 상위패키지명.하위패키지명.클래스명 형태로 지정
		 * 
		 * package 키워드
		 * - 패키지 키워드 사용 기본 문법
		 *   소스코드 첫 번째 라인에서 
		 *   package 패키지명;
		 *   
		 * import 키워드
		 * - java.lang 패키지는 유일하게 import 없어도 생략 가능한 패키지
		 *   -> 그 외의 모든 패키지는 반드시 위치 정보가 필요함
		 * - import문은 package문과 달리 여러번 작성 가능
		 * - 자동 import 단축키 : Ctrl + Shift + O 
		 * 
		 * < import 키워드 사용 기본 문법 >
		 * 1. import 패키지명.클래스명;
		 * 2. import 패키지명.*;
		 */
		
		// java.lang 패키지에 String 클래스를 지정하는 방법(정석)
		// -> 패키지명을 명시하고 마침표(.)를 붙인 뒤 클래스명을 지정함
 		java.lang.String str; // java.lang 패키지의 String 클래스 선언
 		// -> java.lang 패키지는 생략 가능한 패키지 이름이므로 클래스명만 지정 가능
 		String str2;
 		
 		str2 = "Bye";
 		System.out.println(str2);
 		
 		// java.lang 패키지 외의 나머지 패키지명을 생략할 경우
// 		Random r; // 컴파일 에러 발생! 
 		//java.util 패키지의 Random 클래스는 생략 불가능한 패키지명이므로
 		// 1. 클래스명 앞에 java.util 패키지명을 명시
// 		java.util.Random r;
 		
 		// 2. 클래스가 포함된 패키지를 import 문으로 지정할 경우
 		//	  패키지명을 생략하고 클래스명만 사용 가능
 		Random r2;
 		
 		Ex ex = new Ex(); // pack_one 패키지라 가능
 		
 		// 만약, 서로 다른 패키지에 동일한 이름의 클래스가 존재할 경우
 		// import 문을 통해 포함시키더라도 각 클래스 구분을 위해
 		// 최소 하나의 클래스는 패키지명까지 명시해야 한다!
 		// -> 단, 실제 작성 시 명확한 구분을 위해 둘 다 패키지명을 명시하는게 좋음
 		ExPack ex2 = new ExPack(); // pack_two 패키지의 ExPack 클래스
 		ExPack ex3 = new ExPack(); 
 		pack_three.ExPack ex4;
 		
 		
	}

}
