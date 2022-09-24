package Demo;

public class Palindrome {
	public static void main(String[] args) {
		int num=19991, temp=num;
		int r, sum=0;
		while(num!=0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is a Palindrome");
		}
		else
		{
			System.out.println(temp+" is not a Palindrome");
		}
	}

}
