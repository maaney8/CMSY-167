package planets;

import java.util.Comparator;

public class CompareByMass implements Comparator<Planet> {

	@Override
	public int compare(Planet o1, Planet o2) {
		if(o1.getMass() < o2.getMass())
			{
        			return -1;
        	}else if(o1.getMass() == o2.getMass())
        		{
        			return 0;
        		}else
        			{
        			return 1;
        			}
        	}
    }