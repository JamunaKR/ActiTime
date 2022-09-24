package Demo;

public class Reverse {
	public static int i=0;
	
	public static void main(String[] args) {
		reverse();
	}
	public static void reverse()
	{
		String s="ram";
		char[] arr=s.toCharArray();
		String rev="";
		if(i<s.length()) {
			rev=arr[i]+rev;
			reverse();
			i++;
		}
		System.out.println(rev);
	}

}
