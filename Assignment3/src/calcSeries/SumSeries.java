package calcSeries;

public class SumSeries 
{
	public int sumSeriesOfNatureNos(int n)
	{
		int sum = 0;
		for(int i = 1; i<=n ; ++i)
			sum = sum+i;
		return sum;
	}
}
