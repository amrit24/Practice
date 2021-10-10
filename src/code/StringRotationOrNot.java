package code;

public class StringRotationOrNot {

	public static void main(String[] args) {
		String s1 = "ABACD";
		String s2 = "CABAD";
		int res = rotationOrNot(s1, s2);
		
		if(res>-1) {
			System.out.println("Yes");	
		} else {
			 System.out.println("No");	
		}
		
	}

	private static int rotationOrNot(String s1, String s2) {
		String nstr = s1+s1;
		
		return nstr.indexOf(s2);
	}

}
