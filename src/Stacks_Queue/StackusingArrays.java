package Stacks_Queue;

public class StackusingArrays {
		public int []data;
		public int top;
		public  static final int DEFAULT_CAPACITY=10;
		public StackusingArrays() throws Exception {
			this(DEFAULT_CAPACITY);
		}
		public StackusingArrays(int capacity) throws Exception {
			if(capacity<0) {
				throw new Exception("");
			}
			this.data=new int[capacity];
			this.top=-1;
		}
		
}
