package api2_String;

public class T1_trim {
	public static void main(String[] args) {
		String str1 = "  안   녕  ";
		String res;
		
		res = "1234" + str1 + "opq";
		System.out.println("1.res : " + res);
		
		res = "1234" + str1.trim() + "opq";
		System.out.println("2.res : " + res);
	}
}
