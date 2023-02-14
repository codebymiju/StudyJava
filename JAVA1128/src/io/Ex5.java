package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. byte 단위 처리
//		InputStream is = System.in;
//		
//		// 2. char 단위 처리
//		InputStreamReader reader = new InputStreamReader(is);
//		
//		// 3. String 단위 처리
//		BufferedReader buffer = new BufferedReader(reader);
		
		// --------------1 + 2 + 3----- 세문장을 하나로 결합
//		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("데이터를 입력하세요 : ");
		
		try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));) {
			// 입력스트림에서 한 줄의 데이터(문자열) 
			String str = buffer.readLine();
			System.out.println("입력된 데이터 : " + str);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//======================================================
		// 
		
//		System.out.println("데이터를 입력하세요 : ");
//		
//		try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));) {
//			// 입력스트림에서 한 줄의 데이터(문자열) DLFRDJDHRL
//			
//			String str = buffer.readLine();
//			
//			while(str != null) {
//				System.out.println("입력된 데이터 : " + str);
//				str = buffer.readLine();
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		
	}

}
