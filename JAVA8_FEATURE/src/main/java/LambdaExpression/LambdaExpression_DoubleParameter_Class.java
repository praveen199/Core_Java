package LambdaExpression;

public class LambdaExpression_DoubleParameter_Class {

	public static void main(String[] args) {

		//LambdaExpression_DoubleParameter_Interface s = (x,y) -> System.out.println(x+y);
		//s.say(10, 15);
		
		LambdaExpression_DoubleParameter_Interface s = (x,y) -> {
			return x*y;
		};
		System.out.println(s.say(10,15));
	}
}

