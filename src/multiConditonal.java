/*
 * if문을 사용하여 입력받은 값이 2~9사이일 때만 해당되는 구구단 출력
 */
import java.util.Scanner;

public class multiConditonal {
	public static void main(String[] args)
	{
		int result[] = new int[9];
		
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(number >= 2 && number <= 9)
		{
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
		else
		{
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		}
	}
}
