package json;

import org.json.JSONArray;

public class Ex2 {
	
	public static void main(String[] args) {
		
		// JSONArray 클래스를 활용하여 JSON 배열 생성
		JSONArray ja = new JSONArray();
		
		ja.put("홍길동");
		ja.put("이순신");
		ja.put("강감찬");
		
		System.out.println(ja.toString());
	}
}
