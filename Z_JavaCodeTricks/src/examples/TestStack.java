package examples;

public class TestStack {
	public static void main(String[] args) {
		Stack myStack1 = new Stack();
		Stack myStack2 = new Stack(); 
		
		// Push some numbers onto stack
		for (int i = 0; i < 10; i++) myStack1.push(i);
		for (int i = 10; i < 20; i++) myStack2.push(i);
		
		// Pop those numbers off the stack
		System.out.println("Stack 1");
		for (int i = 0; i < 11; i++) 
			System.out.println(myStack1.pop());

		System.out.println("Stack 2");
		for (int i = 0; i < 11; i++) 
			System.out.println(myStack2.pop());
	}
}
