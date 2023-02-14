package io_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 자바의 기본 데이터 입출력
		 * - DataInputStream, DataOutputStream 사용
		 *   -> 메모리에 저장된 0, 1 상태를 그대로 읽거나 쓸 때 사용
		 * - 자바의 기본데이터 타입 8가지 + 문자열(String) 타입 처리 가능
		 *   -> readXXX(), writeXXX() 메서드 사용하여 XXX은 기본 데이터 이름 사용
		 * - 주의! String 타입은 XXX 부분에 String 대신 UTF 사용
		 *   ex) readString() X / readUTF() O 
		 * 
		 *  < 기본 문법 >
		 * 1. 기본 데이터 출력
		 *    Data  
		 *  
		 */
		
		// 자바 기본 데이터를 파일로 출력하기
		
//		FileOutputStream fos = new FileOutputStream("c:\\temp\\data.txt");
		
//		DataOutputStream dos = new DataOutputStream(fos);
		
		try (DataOutputStream dos = new DataOutputStream(
				new FileOutputStream("C:\\temp\\data.txt"))){
			
			dos.writeInt(100);
			dos.writeDouble(3.14);
			dos.writeUTF("잠와");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("--------------------------------------------");

		// 파일에 출력된 자바 기본데이터를 읽어와서 화면에 출력하기
		try(DataInputStream dis = new DataInputStream(
				new FileInputStream("C:\\temp\\data.txt"))) {
			// dis.readXXX() 메서드 호출하여 데이터 읽어오기(입력)
			// 읽어들일 데이터는 반드시 출력된 데이터 순으로 읽어야 한다!
			// => 출력 순서 : int -> double -> String 이므로, 입력 순서도 동일해야 함
			// => 순서가 바뀔 경우 EOFException 예외가 발생사므로 주의!
			int num = dis.readInt(); 
//			double dNum = dis.readDouble(); 
			double dNum = dis.readDouble(); 
			String str = dis.readUTF(); 
			// => readXXX 사용시 순서를 잘 지켜야 함!!
			
			
			
			// 입력받은 데이터 출력
			System.out.println("int 형 전수 : " + num);
			System.out.println("dobule 형 전수 : " + dNum);
			System.out.println("문자열 : " + str);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}






