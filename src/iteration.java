/*
 * while, for문을 사용한 6,7단 출력
 */
public class iteration {
	public static void main(String[] args)
	{
		int i = 1;
		while(i<10)
		{
			System.out.println("6*"+i+"="+(6*i));
			i = i+1;
		}
		
		System.out.println(" ");
		
		for(int j=1; j<10; j++)
		{
			System.out.println("7*"+j+"="+(7*j));
		}
	}
}
