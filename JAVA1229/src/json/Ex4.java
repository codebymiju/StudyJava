package json;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class Ex4 {

	public static void main(String[] args) {
		// 1. DTO 객체 생성
		MemberBean member = new MemberBean("홍길동", 20);
		
		JSONObject jo = new JSONObject(member);
//		System.out.println(jo.toString());
		
		System.out.println("============================");
		
		List<MemberBean> memberList = new ArrayList<MemberBean>();
		memberList.add(new MemberBean("홍길동", 20));
		memberList.add(new MemberBean("이순신", 44));
		memberList.add(new MemberBean("강감찬", 30));
		
		JSONArray ja = new JSONArray(memberList);
//		System.out.println(ja.toString());
		
		
		List<MemberBean2> memberList2 = new ArrayList<MemberBean2>();
		memberList2.add(new MemberBean2("홍길동", 20, new AddressBean("부산", "아이티윌")));
		memberList2.add(new MemberBean2("이순신", 44, new AddressBean("서울", "네이버")));
		memberList2.add(new MemberBean2("강감찬", 30, new AddressBean("제주", "한라산")));
		
		JSONArray ja2 = new JSONArray(memberList2);
//		System.out.println(ja.toString());
		System.out.println(ja2.toString());
		
	}
	
}
