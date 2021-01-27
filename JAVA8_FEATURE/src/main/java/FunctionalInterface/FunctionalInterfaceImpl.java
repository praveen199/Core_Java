package FunctionalInterface;


public class FunctionalInterfaceImpl {

	public static void main(String[] args) {
		
		//Zero Argument
		/*FunctinalInterface itr = () -> {
			return "zero argument";
		};
		System.out.println(itr.callMe());*/
		
		//One Argument
		/*FunctinalInterface cal = (x,y) -> x+y;
		System.out.println(cal.addNumber(10, 15));*/
		
		//Two Argument
		FunctinalInterface cal = (x) -> x*x;
		System.out.println(cal.calculate(10));
		
		
		
		
		
		
	}
}
