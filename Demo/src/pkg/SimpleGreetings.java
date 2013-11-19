package pkg;

public class SimpleGreetings {

		public static void main(String[] args) {
			GetGreetings getGreetings = new GetGreetings();
			getGreetings.setGreetingMessage("This is a simple greeting msg");
			System.out.println(getGreetings.getGreetingMessage());
			System.out.println("Hi");
			System.out.println("Hello");
	}

}
