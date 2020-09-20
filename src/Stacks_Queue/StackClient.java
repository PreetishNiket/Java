package Stacks_Queue;

public class StackClient {

	public static void main(String[] args) throws Exception {
		StackusingArrays stack=new StackusingArrays(5);
		for(int i=1;i<=5;i++) {
			stack.push(i*10);
			stack.display();
		}
		stack.pop();
		stack.display();
		System.out.println(stack.top());
		if(stack.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		else {
			stack.display();
		}
	}

}
