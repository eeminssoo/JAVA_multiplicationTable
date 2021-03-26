/*
 * 배열을 이용한 구구단 출력
 */
public class multipleArray {
	public static void main(String[] args)
	{
		int[][] result = new int[9][9];
		
		for(int i=0; i<9; i++)
		{
			System.out.println((i+1)+"단 입니다.");
			for(int j=0; j<9; j++)
			{
				result[i][j] = (i+1)*(j+1);
				System.out.println((i+1)+"*"+(j+1)+"="+result[i][j]);
			}
			System.out.println(" ");
		}
	}
}
