package service;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import model.Hotel;

public class HotelServiceImpl implements HotelService {

	@Override
	public List<Hotel> hotelsSortedOnReviewScore(List<Hotel> hotels, HashMap<String, Integer> sentiments) {
		
		ReviewService reviewService = new ReviewServiceImpl();
		List<Hotel> hotelsSortedOnReviewScore = reviewService.hotelsWithScore(hotels, sentiments);
		
		Collections.sort(hotelsSortedOnReviewScore);
		return hotelsSortedOnReviewScore;	
	}
}
