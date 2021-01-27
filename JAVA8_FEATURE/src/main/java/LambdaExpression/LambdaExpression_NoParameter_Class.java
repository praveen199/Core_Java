package LambdaExpression;

public class LambdaExpression_NoParameter_Class {

	public static void main(String[] args) {

		LambdaExpression_NoParameter_Interface s = () -> {
			return "I am no paraemter lambda";
		};
		System.out.println(s.say());
		
	}
}
