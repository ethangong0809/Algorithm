
public class reverseWords1 {

	public static String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
		
		String[] array = s.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for (int i = array.length - 1; i >= 0; i--) {
			
			if (!array[i].equals(" ")) {
				sb.append(array[i]).append(" ");
			}
			
		}
		
		return array.length == 0 ? "" : sb.substring(0, sb.length() - 1);
	}
	
	public static void main(String[] args) {
		String src = "nian nian da ma ma";
		System.out.println(reverseWords(src));
	}

}
