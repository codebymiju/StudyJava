package io_2;

import java.io.OutputStream;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 모니터로 데이터를 출력하는 방법
		 * 1. 기본 출력스트림인 OutputStream 사용(Byte 단위로 처리)
		 * - write() 메서드를 호출하여 byte 단위 출력
		 */

		// OutputStream 객체를 연결하기 위해서는 System.out 사용
//		OutputStream os = System.out;
		
//		char ch = 'A';
//		
//		try (OutputStream os = System.out){
//			os.write(ch);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//-------------------------------------------------------------
		// String 타입 데이터(문자열)를 OutputStream으로 출력
		String str = "Hello, 자바";
		try (OutputStream os = System.out;) {
			// write(byte[] b) 메서드 호출하여 출력할 데이터를 배열로 전달
			os.write(str.getBytes()); // 한글, 한자 등의 문자열로 출력 가능
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} // main()

}// class
