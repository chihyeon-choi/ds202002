package 자료구조과제;
import java.util.Scanner;
public class assignment_9012 {
	
	public static boolean isValid(String pp) {
		char[] stack=new char[1024];
		int top=-1;
		
		for(int i=0;i<pp.length();i++) {
			char ch=pp.charAt(i);
			
			if(ch=='(') {
				stack[++top]=ch;
			}
			else if(ch==')') {
				if(top==-1||stack[top]!='(') return false;
				top--;
			}
		}
		return top==-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		
		System.out.print("몇번 시행할지 입력하세요 : ");
		int n=scan.nextInt();

		String pp;
		for(int i=0;i<n;i++) {
			while(true) {
				System.out.println("2개 이상 50개 이하의 괄호쌍을 입력하세요");
				pp=scan.next();
				if (pp.length()>=2 && pp.length()<=50) break;
				}
			if(isValid(pp)) System.out.println("YES");
			else System.out.println("NO");
			
			}
		
	}
}
