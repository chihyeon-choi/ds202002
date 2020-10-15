package 자료구조과제;
import java.util.Scanner;
class Stack<E>{
	E[] data;					
	int top;						
	
	Stack(){
		data=(E[])new Object[1024];   
		top=-1;

	}
	public void push(E v) {
		top++; 
		data[top]=v;
		
		
	}
	public void pop() {
		data[top]=null;
		top--;
	}
	public E top() {
		return data[top];
	}
	public boolean empty(){
		return top==-1;
	}
	public int size() {
		return top+1;
	}
	
}

public class assignment_1874 {

	public static void main(String[] args) {
		Stack<Integer> stack_n = new Stack();
		Stack<Integer> stack=new Stack();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("n 값을 입력하세요 : ");
		int n=scan.nextInt();
		int k; // 몇번쨔 input과 output이 일치하지 않는가
		
		System.out.println("수열을 입력하세요");
		int[] input=new int[n];
		int[] output=new int[n];
		String[] result=new String[1024];
		int index=0;
		// n을 제외한 input 값을 넣어줌
		for(int i=0;i<n;i++) {
			input[i]=scan.nextInt();
		}
		
		// 1부터 n까지 값을 stack_n에 넣어줌
		for(int i=n;i>0;i--) {
			stack_n.push(i);
		}
		
		// 첫번째 input값에 대응한 코딩
		for(int i=0;i<input[0];i++) {
			stack.push(stack_n.top());
			result[index]="+";
			index++;
			//System.out.println("+");
			stack_n.pop();
		}
		output[0]=stack.top();
		stack.pop();
		result[index]="-";
		index++;
		
		for(int i=1;i<n;i++) {
			if(input[i-1]>input[i]) {
				output[i]=stack.top();
				stack.pop();
				result[index]="-";
				index++;
			}
			else {
				while(true) {
					stack.push(stack_n.top());
					result[index]="+";
					index++;
					stack_n.pop();
					if(stack.top()==input[i]) {
						output[i]=stack.top();
						stack.pop();
						result[index]="-";
						index++;
						break;
					}
				}
			}
			if(input[i]!=output[i]) {
				System.out.println("NO");
				return;
			}
		}
		for(int i=0;i<index;i++)
			System.out.println(result[i]);
	}

}
