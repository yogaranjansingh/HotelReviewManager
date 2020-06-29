package persistence;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Hotel;
import model.Review;

public class Store {
	
	public Hotel getHotelWithReviewScores()
	{
		ArrayList<Review> reviews = new ArrayList<Review>();
		
		Review review1 = new Review(0, 4.3, "", 0);
		Review review2 = new Review(0, 4.5, "", 0);
		Review review3 = new Review(0, 3, "", 0);
		
		reviews.add(review1);
		reviews.add(review2);
		reviews.add(review3);
		
		Hotel hotel = new Hotel(0,"Residence Inn", reviews);
		
		return hotel;
	}
	
	public HashMap<String, Integer> getSentiments()
	{
		Map<String, Integer> sentiments = new HashMap<String,Integer>();
		
		sentiments.put("amazing", 5);
		sentiments.put("clean", 3);
		sentiments.put("tidy", 2);
		sentiments.put("nice", 1);
		sentiments.put("dirty", -1);
		sentiments.put("horrible", -3);
		return (HashMap<String, Integer>) sentiments;
	}
	
	
	public Hotel getHotelWithReviewComments()
	{
		List<Review> reviews = new ArrayList<Review>();
		
		Review review1 = new Review(0, "i have never been to such a clean and tidy hotel", 0);
		Review review2 = new Review(0 , "amazing service", 0);
		Review review3 = new Review(0, "horrible staff", 0);
		
		reviews.add(review1);
		reviews.add(review2);
		reviews.add(review3);
		
		Hotel hotel = new Hotel(0,"Residence Inn", reviews);
		
		
		return hotel;
	}
	
	
	public List<Hotel> getHotels()
	{
		ArrayList<Review> reviews1 = new ArrayList<Review>();
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		
		Review review1 = new Review(0, "a Clean and Tidy hotel", 0);
//		Review review2 = new Review(0 , "amazing service", 0);
//		Review review3 = new Review(0, "horrible staff", 0);
		
		reviews1.add(review1);
//		reviews1.add(review2);
//		reviews1.add(review3);
		
		Hotel hotel1 = new Hotel(0,"Residence Inn", reviews1);
		
//		ArrayList<Review> reviews2 = new ArrayList<Review>();
//		
//		Review review4 = new Review(0, "clean and tidy", 1);
//		Review review5 = new Review(0 , "horrible service", 1);
//		Review review6 = new Review(0, "amazing staff", 1);
//		
//		reviews2.add(review4);
//		reviews2.add(review5);
//		reviews2.add(review6);
//		
//		Hotel hotel2 = new Hotel(1, "Shaeraton Grand", reviews2);
//		
		hotels.add(hotel1);
//		hotels.add(hotel2);
//		
		return hotels;
	}
	
	

}
