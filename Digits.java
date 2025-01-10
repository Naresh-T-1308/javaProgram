public class Digits {

	public static void main(String[] args) {
System.out.println(" digit count program");
		int i=123
		int j;
		int count=0;
		while(i>0)
		{
			j=i%10;
			i=i/10;
			count++;
		}
		System.out.println(count);
	}

}
