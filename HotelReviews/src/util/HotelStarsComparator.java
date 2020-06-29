package util;
import java.util.Comparator;

import model.Hotel;

public class HotelStarsComparator implements Comparator<Hotel>{

	@Override
	public int compare(Hotel o1, Hotel o2) {
		if(o1.getReviews().size() > o1.getReviews().size())
		{
			return -1;
		}
		else if(o1.getReviews().size() == o1.getReviews().size())
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

}
