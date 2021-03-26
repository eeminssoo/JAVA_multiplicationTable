/*
 * 숫자 입력시 해당되는 구구단 출력
 */
import java.util.Scanner;

public class fourthFifth {
	public static void main(String[] args)
	{
		int result[] = new int[9];
		
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("출력되는 구구단은"+number+"단 입니다.");
		
		for(int i=0; i<9; i++)
		{
			result[i] = number * (i+1);
		}
		for(int i=0; i<9; i++)
		{
			System.out.println(number+"*"+(i+1)+"="+result[i]);
		}
		
	}
}
