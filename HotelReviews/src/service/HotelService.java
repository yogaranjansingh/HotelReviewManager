package service;
import java.util.HashMap;
import java.util.List;

import model.Hotel;

public interface HotelService {
	
	
	public List<Hotel> hotelsSortedOnReviewScore(List<Hotel> hotels, HashMap<String, Integer> sentiments);
	

}
