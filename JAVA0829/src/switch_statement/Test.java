package switch_statement;

public class Test {

	public static void main(String[] args) {
		
		int score = 35;
		String grade = ""; // 학점 ("", Null String)
		
		// if ~ else if 문을 사용하여 점수에 따른 학점을 계산 후 grade 변수에 저장
		
		if(score >= 90 && score <= 100) {
			grade = "A";
		}else if (score >= 80 && score <= 89){
			grade = "B";
		}else if (score >= 70 && score <= 79){
			grade = "C";
		}else if (score >= 60 && score <= 69){
			grade = "D";
		}else if (score >= 50 && score <= 59){
			grade = "F";
		}else {
			grade = "점수 입력 오류!";
		}
		

		System.out.println("점수 : " + score + ", 학점 : " + grade);
		
		System.out.println("===================================================");
		
		// switch ~ case 문을 사용하여 학점 계산을 수행할 경우 문제점
		// -> case 문에서 값 지정 시 범위 지정이 불가능!
		// -> 각 case 문에 필요한 점수를 각각 별도로 기술하여 학점 계산 해야함 -> 비효율적
		score = 90;
		
		if (score >= 0 && score <= 100) {
			switch(score/10) { // int / int -> int , 대입은 하지 않았기에 원래 값은 변하지 않는다. 
				case 10 : grade = "A"; break;
				case 9 : grade = "A"; break;
				case 8 : grade = "B"; break;
				case 7 : grade = "C"; break;
				case 6 : grade = "D"; break;
				default : grade = "F";
			
			}
			
			System.out.println("점수 : " + score + ", 학점 : " + grade);
		} else {
			System.out.println(score + " : 점수 입력 오류!");
		}
		
	}

}
