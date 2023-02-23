package Collection;

public class Test {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String("marker");
		String str2 = "marker";
		String str3 = str1.concat("500");
		String str4 = str1.concat("500");
		
		//return str1 == str2;
		
		//System.out.println(str2.equals(str1));
		
		return str3 == str4;
	}

}
