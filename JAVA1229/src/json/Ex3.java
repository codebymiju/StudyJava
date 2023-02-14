package json;

import org.json.JSONArray;
import org.json.JSONObject;

public class Ex3 {

	public static void main(String[] args) {
		// 1과 2 조합하여 사용
		// 1. JSONArray 객체 생성
		JSONArray ja = new JSONArray();
		
		// 2. JSONObject 객체 생성
		JSONObject jo = new JSONObject();   
		jo.put("name", "홍길동");
		jo.put("age", 20);
		
		// 1 + 2
		ja.put(jo);
		//---------------------------------------------
		jo = new JSONObject();   
		jo.put("name", "이순신");
		jo.put("age", 44);
		
		ja.put(jo);

		//---------------------------------------------
		System.out.println(ja);
		//---------------------------------------------
		// 2.
		JSONObject jo2 = new JSONObject();
		
		jo2.put("name", "홍길동");
		jo2.put("age", 20);
		
		JSONArray ja2 = new JSONArray();
		ja2.put("부산광역시 부산진구 동천로 109");
		ja2.put("7층 아이티윌 부산교육센터");
		
		jo2.put("address", ja2);
		
		System.out.println(jo2);
	}

}
