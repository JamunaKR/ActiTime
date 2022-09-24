package Demo;

public class PrimeNum {
	public static void main(String[] args) {
		int num=5,count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(num+ " is a composite no.");
		}
		else
		{
			System.out.println(num+ " is a prime no.");
		}
	}

}
