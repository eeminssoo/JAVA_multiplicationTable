/*
 * 2개의 숫자를 입력받아 해당되는 단을 출력하는 프로젝트
 */
import java.util.Scanner;

public class multipleMisson {
	
	public static int[][] calc(int numberone, int numbertwo)
	{
		int[][] result = new int[numberone][numbertwo];
		
		for(int i=0; i<numberone; i++)
		{
			for(int j=0; j<numbertwo; j++)
			{
				result[i][j] = (i+1) * (j+1);
			}
		}
		
		return result;
	}
	
	public static void print(int[][] result)
	{
		for(int i=0; i<result.length; i++)
		{
			for(int j=0; j<result[0].length; j++)
			{
				System.out.println(result[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("출력할 단을 입력하세요(ex.8,7) : ");
		Scanner scanner = new Scanner(System.in);
		String inputVal = scanner.nextLine();
		String[] splitesVal = inputVal.split(",");
		
		int first = Integer.parseInt(splitesVal[0]);
		int second = Integer.parseInt(splitesVal[1]);
		System.out.println("출력되는 단은 "+inputVal+"단 입니다.");
		
		print(calc(first,second));
	}
}
