package LambdaExpression;

public class LambdaExpression_SingleParameter_Class {

	public static void main(String[] args) {

		LambdaExpression_SingleParameter_Interface s = (String str) -> System.out.println(str);
		s.say("W SINGH");
		
		/*LambdaExpression_SingleParameter_Interface s = (str) -> {
			return "Rivansh Singh : " + str;
		};
		System.out.println(s.say("W SINGH"));*/

		
	}
}
