package json;
import org.json.JSONObject;

public class Ex {

	public static void main(String[] args) {
		// org.JSON 라이브러리 활용한 JSON 데이터 다루기
		
		// 1. 기본 생성자 호출 (JSONobject 객체 생성)
		JSONObject jo = new JSONObject();   
		
		// 2. put() 호출하여 데이터 생성(추가)
		jo.put("name", "홍길동");
		jo.put("age", 20);
		
		// 3. toString() 호출하여 JSON 데이터를 문자열로 변환
		System.out.println(jo.toString());
		
		
		
	}// main()
	
}
