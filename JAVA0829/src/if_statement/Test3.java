package if_statement;

public class Test3 {

	public static void main(String[] args) {
		// 연습문제
		// 1. 정수형 변수 num 에 대한 양수, 음수, 0 판별 ("num은 000")
		
	
	// 1.
	int num = 98;
	if (num > 0) {
		System.out.println(num + " : 양수!");
	} else if (num < 0) {
		System.out.println(num + " : 음수!");
	} else {
		System.out.println(num + " : 0!");
	}
	
	System.out.println("=====================================================");
	
	// 2. 정수형 변수 num 에 대한 홀수, 짝수, 0 판별
	num = 0;
	if (num % 2 == 1) { // 홀수 
		System.out.println(num + " : 홀수!");
	} else if (num % 2 == 0) { // 짝수
		System.out.println(num + " : 짝수!");
	} else if (num == 0){ // 홀수도 짝수도 아닌 수 = 0
		System.out.println(num + " : 0!");
	}
	
	// -> 주의! 위의 코드는 0도 짝수에 해당하는 블럭문이 실행됨
	// 	  따라서, 최소한 짝수 판별 코드와 0판별 코드가 먼저 실행되어야함
	// 	  단, 홀수 판별 순서는 무관함
	
	if (num % 2 == 1) { // 홀수 
		System.out.println(num + " : 홀수!");
	} else if (num == 0) { // 0
		System.out.println(num + " : 0!");
	} else { // 홀수도 짝수도 아닌 수 = 짝수
		System.out.println(num + " : 짝수!");
	}
	
	System.out.println("========================================================");
	
	// 문자 ch 에 대해 영문 대소문자 판별
	// 1) 영문 대문자 : 'A'(65) ~ 'Z'(90)
	// 2) 영문 소문자 : 'a'(97) ~ 'z'(122)
	
	// char 타입 변수 ch에 영문자 'A' 저장
	
	char ch = 'ㄱ';
	
	// 문자 ch가 대문자인가?
//	if(ch >= 'A' && ch <= 'Z') { // 대문자 판별 (ch >= 65 && ch <= 90)
//		System.out.println(ch + " : 대문자!");
//	} else {
//		System.out.println(ch + " : 대문자 아님!");
//	}
	
	if(ch >= 'A' && ch <= 'Z') { // 대문자 판별 (ch >= 65 && ch <= 90)
		System.out.println(ch + " : 대문자!");
	} else if(ch >= 'a' && ch <= 'z') { // 소문자 판별 (ch >= 97 && ch <= 122)
		System.out.println(ch + " : 소문자!");
	} else { // 영문 대문자도 아니고 소문자도 아닐 경우
		System.out.println(ch + " : 영문자 아님!");
	}
	
	
	System.out.println("===============================================");
	
	ch = 'A';
	System.out.println("원본 문자 ch = " + ch);
	
	// 대문자가 입력이 되면 대문자 > 소문자로 출력 
	// 소문자가 입력이 되면 소문자 > 대문자로 출력
	
	
	if(ch >= 'A' && ch <= 'Z') {
		ch += 32;
		System.out.println("소문자 변환 후 ch = " + ch );
	} else if(ch >= 'a' && ch <= 'z') { 
		ch -=32;
		System.out.println("대문자 변환 후 ch = " + ch);
	} else {
	System.out.println(ch + " : 영문자 아님!");
	}
	
	// <내가 한 것>
	if(ch >= 'A' && ch <= 'Z') { 
			System.out.println( (char)(ch+32) + " : 대문자 > 소문자");
	} else if(ch >= 'a' && ch <= 'z') { // 소문자 판별 (ch >= 97 && ch <= 122)
			System.out.println( (char)(ch-32) + " : 소문자 > 대문자");
	} else {
		System.out.println(ch + " : 영문자 아님!");
	}
	
	
	System.out.println("===========================================");
	
	int pee = 50000; // 기본 입장료
	int age = 65; // 나이
	
	// 나이에 따른 입장료 할인 조건 판별하여 최종 입장료 계산
	// 조건 1. 만약, 5세 미만이거나 65세 이상일 경우 입장료 50% 할인 ("xx세 : 50% 할인") 
	// 조건 2. 5세 이상 ~ 19세 이하일 경우 입장료 30% 할인("xx세 : 30% 할인")
	// 조건 3. 그 외 입장료 할인 없음("xx세 : 할인 없음" 출력)
	
	if(age < 5 || age >= 65) { // 이거나 OR 연산자 ||
		// 입장료 50% 할인 적용
		pee *= 0.5;  // 형변환 없이 사용 가능
		System.out.println(age +" 세 : 50% 할인");
	} else if(age >= 5 && age <= 19) { // 이상이고  AND 연산자
		// 입장료 30% 할인 적용
		pee *= 0.7; 
		System.out.println(age +" 세 : 30% 할인");
	} else {
		System.out.println(age + " 세 : 할인 없음");
	}
	
	System.out.println("놀이동산 입장료 : " + pee + "원");
	
	
	System.out.println("====================================================");
	/*
	 *  학생 점수 (score) 에 대한 학점 (grade) 판별
	 *  A학점 : 90 ~ 100점
	 *  B학점 : 80 ~ 89점
	 *  C학점 : 70 ~ 79점
	 *  D학점 : 60 ~ 69점
	 *  F학점 : 50 ~ 59점
	 *  그 외 : "점수 입력 오류"
	 */
		
	int score = 35;
	String grade = ""; // 학점 ("", Null String)
	
//	// if ~ else if 문을 사용하여 점수에 따른 학점을 계산 후 grade 변수에 저장
//	
//	if(score >= 90 && score <= 100) {
//		grade = "A";
//	}else if (score >= 80 && score <= 89){
//		grade = "B";
//	}else if (score >= 70 && score <= 79){
//		grade = "C";
//	}else if (score >= 60 && score <= 69){
//		grade = "D";
//	}else if (score >= 50 && score <= 59){
//		grade = "F";
//	}else {
//		grade = "점수 입력 오류!";
//	}
//		
	
//	System.out.println("점수 : " + score + ", 학점 : " + grade);
	
	// 점수가 정상 범위 (0 ~ 100) 일 때와 오류일 때를 판별하는 코드
	 score = 99;
	// 중첩 if 문을 사용하는 경우 
	if (score >= 0 && score <=100) {
		// if ~ else if 문을 사용하여 점수에 따른 학점을 계산 후 grade 변수에 저장
		// 첫번째 if 문에서 0 ~ 100 사이를 판별했으므로
		// if문 블록 내의 A학점은 90점 이상만 판별해도 자동으로 100점 이하가 적용됨
		if(score >= 90) {
			grade = "A";
		}else if (score >= 80){
			grade = "B";
		}else if (score >= 70){
			grade = "C";
		}else if (score >= 60){
			grade = "D";
		}else {
			// 기본 0 ~ 100 사이, A ~ D 학점 판별 후 남은 점수는
			// 자동으로 0 ~ 59 사이가 되므로 마지막 else if 문은 else 문으로 대체 가능!
			grade = "F";
		}
		
		
		System.out.println("점수 : " + score + ", 학점 : " + grade);
		
	} else {
		System.out.println(score + "점 : 점수 입력 오류!");
	}
	
	
	
	
	
	
	
	}

}
