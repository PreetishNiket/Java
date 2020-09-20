package Stacks_Queue;

public class StackClient {

	public static void main(String[] args) throws Exception {
		StackusingArrays stack=new StackusingArrays(5);
		for(int i=0;i<5;i++) {
			stack.push(i*10);
			stack.display();
		}

	}

}
