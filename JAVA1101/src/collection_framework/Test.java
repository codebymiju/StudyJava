package collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		/*
		 *  Set 계열 객체를 활용하여 로또 번호 생성기 작성(정렬은 선택)
		 *  1. Set 타입 객체 myLotto 생성
		 *  2. 1 ~ 45 사이의 중복되지 않는 난수(로또번호) 6개를 Set 객체에 저장
		 *     -> ex) "나의 로또 번호 : 1 10 11 23 41 12 40 " 출력
		 * ---------------------------------------------------------------------
		 *  3. 이번주 로또 1등 당첨 번호를 Set 객체 thisWeekLotto 에 저장
		 *     -> ex) "이번주 1등 당첨 번호 : 7 8 11 13 15 23 " 출력
		 *  4. 기존의 myLotto에 저장된 번호와 1등 당첨번호를 비교하여
		 *     일치하는 번호 개수와 등수 출력
		 *     -> ex) 번호가 3개 (11, 15, 23) 일치 시 "일치하는 번호 개수 : 3개(4등)
		 *     -> 6개 일치 : 1등, 3개 : 4등, 나머지 : 꽝
		 *     
		 */
		
		Set<Integer> thisWeekLotto = new TreeSet<Integer>();
		thisWeekLotto.add(7);
		thisWeekLotto.add(8);
		thisWeekLotto.add(11);
		thisWeekLotto.add(13);
		thisWeekLotto.add(15);
		thisWeekLotto.add(23);
		
//		Set<Integer> thisWeekLotto = new TreeSet<Integer>(Arrays.asList(7, 8, 11, 13, 15, 23));
		System.out.println("이번주 1등 당첨번호 : " + thisWeekLotto);
		
		// myLotto 생성
		Set<Integer> myLotto = new TreeSet();
		Random r = new Random(); // static이 아니라 인스턴스 생성해야함!
		
		while(myLotto.size() < 6) { // myLotto.size() != 6
			myLotto.add(r.nextInt(45) + 1);
		}
		System.out.println("나의 로또 번호 : " + myLotto);
		
//		for(int i =1; i <= 7; i++) {
//			int rNum = r.nextInt(45) + 1;
//			
//			if(myLotto.contains(rNum)) {
//				System.out.println("중복되는 번호 발생! : " + rNum);
//				// 중복 번호가 발생했으므로 카운팅을 하지 않도록 i를 1감소
//				i--;
//			} else {
//				myLotto.add(rNum);
//			}
//		}
		
		//===========================================================================
		// 당첨번호와 일치하는 개수 카운팅
		int count = 0; 
		
		// 1. 향상된 for문 사용시
//		for(int num : myLotto) {
//			
//			if(thisWeekLotto.contains(num)) {
//				 count++;
//			}
//		}
//		
		// 2. Iterator 사용 시 
		Iterator<Integer> ite = myLotto.iterator();
		while(ite.hasNext()) {
			int num = ite.next();
			
			// 꺼낸 번호와 1등 당첨 번호를 비교
			if(thisWeekLotto.contains(num)) {
				count++;
			}
		}
		
		System.out.println(count + "개 일치!");
		
		if(count == 6) {
			System.out.println( count + "개 일치 : 1등!");
		} else if(count == 5) {
			System.out.println( count + "개 일치 : 2등!");
		} else if (count == 4) {
			System.out.println( count + "개 일치 : 3등!");
		} else if (count == 3) {
			System.out.println( count + "개 일치 : 4등!");
		} else {
			System.out.println( count + "개 일치 : 꽝!");
		}
		
		
		switch (count) {
		case 6 : System.out.println(count + "개 일치 : 1등!"); break;
		case 5 : System.out.println(count + "개 일치 : 2등!"); break;
		case 4 : System.out.println(count + "개 일치 : 3등!"); break;
		case 3 : System.out.println(count + "개 일치 : 4등!"); break;
		default : System.out.println(count + "개 일치 : 꽝!"); 
		} // switch
		
		
		
		
	}

}
