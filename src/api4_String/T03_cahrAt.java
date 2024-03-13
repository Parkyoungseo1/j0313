package api4_String;

public class T03_cahrAt {
	public static void main(String[] args) {
		// 성별코드가 '1'또는 '3'이면 '남자'로, '2'또는 '4'이면 '여자'로 출력해 주시오.
		//              012345678901234
		String jumin = "123456-1234567";
		char gender = jumin.charAt(7);
		String strGender = "";
		
		if(gender == '1' || gender == '3') strGender = "남자";
		else if(gender == '2' || gender == '4') strGender = "여자";
		else strGender = "주민번호 오류";
		
		System.out.println("주민번호 : "+jumin+" , 성별은 : " +strGender);
	}
}
