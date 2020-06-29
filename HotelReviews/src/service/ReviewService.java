package service;
import java.util.HashMap;
import java.util.List;

import model.Hotel;

public interface ReviewService {
	
	
	double averageReviewScore(Hotel hotel);
	
	List<Hotel> hotelsWithScore(List<Hotel> hotels, HashMap<String, Integer> sentiments);

}
