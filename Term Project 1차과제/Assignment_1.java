import java.util.Random;
import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		System.out.println("N과 구간 a,b를 입력받고, 출력을 내는 프로그램 작성\n");
		System.out.print("N : ");
		int n=sc.nextInt();
		System.out.print("a : ");
		int a=sc.nextInt();
		System.out.print("b : ");
		int b=sc.nextInt();
		System.out.println();
		
		int[] array=new int [n];
		
		
		for(int i=0;i<array.length;i++) {
			array[i]=r.nextInt(10000)+1;
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.println((i+1)+"번째 값\t"+array[i]);
		}
		System.out.println();
		
		int sum=array[a-1];
		int max=array[a-1];
		int min=array[a-1];
		
		for(int i=a;i<b;i++) {
			if(max<array[i]) {
				max=array[i];
			}
			if(min>array[i]) {
				min=array[i];
			}
			sum+=array[i];
		}
		
		
		System.out.println("최대값\t\t"+max);
		System.out.println("최소값\t\t"+min);
		System.out.println("합계\t\t"+sum);
		
		
		


	}

}
