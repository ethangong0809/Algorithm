
public class lambdaExpression {

	static String s = "Hello!";
	
	public static void main(String[] args) {
		HelloNiannian helloNiannian = message -> System.out.println(s + message);
		helloNiannian.sayMessage(" World");
	}
	interface HelloNiannian {
		void sayMessage(String asd);
	}
	
}
