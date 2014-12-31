public class StringRotation {
	public static void main(String[] args) {
		System.out.println(checkRotation("california", "niacalifor"));
	}

	public static boolean checkRotation(String s1, String s2){
		if(s1.length() == s2.length()){
			return s1.concat(s1).toLowerCase().contains(s2.toLowerCase());
		}
		return false;
	}
}