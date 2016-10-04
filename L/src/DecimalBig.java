import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DecimalBig
{
	static double rate;
	
	public static void main(String[] args)
	{
		/*
		 * List<Integer> list = Arrays.asList(1, 2, 3, 4 , 5); Double result = list.stream().collect(Collectors.averagingInt(v -> v * Integer.parseInt("2.5")) ); System.out.println(
		 * "Average: " + result); 123456
		 */
		
		int years = 3;
		int loanamount = 50000;
		
		double EMI;
		int n;
		
		n = years * 12;
		rate = 12.95 / 1200;		
		
		EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanamount;
		
		System.out.println(EMI);
		
	}
}
