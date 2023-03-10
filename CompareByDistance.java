package planets;

import java.util.Comparator;

public class CompareByDistance implements Comparator<Planet> {
	@Override
	public int compare(Planet o1, Planet o2)
	{
		if(o1.getDistance() < o2.getDistance())
		{
			return -1;
		}else if(o1.getDistance() == o2.getDistance())
		{
			return 0;
		}else
		{
			return 1;
		}
	}

}
