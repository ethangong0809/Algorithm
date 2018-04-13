
public class test {

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
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
		
	}
	
	public static void main(String[] args) {
	
		String s = "hello world xiao nian nian";
		System.out.println(reverseWords(s));
	}

}
