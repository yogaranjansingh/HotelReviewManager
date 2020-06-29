import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import model.Hotel;
import persistence.Store;
import service.HotelService;
import service.HotelServiceImpl;
import service.ReviewService;
import service.ReviewServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		
		ReviewService service = new ReviewServiceImpl();
		HotelService hotelService = new HotelServiceImpl();
		Store store = new Store();
		Hotel hotelWithScores = store.getHotelWithReviewScores();
		Hotel hotelWithCommnets = store.getHotelWithReviewComments();
		
		HashMap<String, Integer> sentiments = store.getSentiments();
		List<Hotel> hotels = store.getHotels();
		
		System.out.println(service.averageReviewScore(hotelWithScores));
		
		System.out.println(hotelService.hotelsSortedOnReviewScore(hotels, sentiments));
		
		//System.out.println(service.averageReviewScore(hotelWithCommnets,sentiments));
		
		
		ExecutorService executorService=  Executors.newFixedThreadPool(5);
		executorService.execute(new Runnable() {
			
			@Override
			public void run() {
				
				service.averageReviewScore(hotelWithScores);
			}
		});
		
	
	}

}
