package service;
import java.util.HashMap;
import java.util.List;

import model.Hotel;
import model.Review;

public class ReviewServiceImpl implements ReviewService{

	@Override
	public double averageReviewScore(Hotel hotel) {
		
		List<Review> reviews = null;
		if(hotel!=null)
		{
			reviews =  hotel.getReviews();
		}
		
		double score = 0;
		double totalScore = 0;
		
		int totalNumberOfReviews = reviews.size();
		
		
		for(Review review : reviews)
		{
			score = review.getScore();
			totalScore = totalScore + score;
		}
		
		double averageScore = totalScore/totalNumberOfReviews;
		
		return averageScore;
		
	}

	//a Clean and Tidy hotel
	
	@Override
	public List<Hotel> hotelsWithScore(List<Hotel> hotels, HashMap<String, Integer> sentiments) {
		for(Hotel hotel : hotels)
		{
			List<Review> reviews = null;
			if(hotel!=null)
			{
				reviews =  hotel.getReviews();
			}
			
			String reviewComment = "";
			
			double totalScore = 0;
			
			int totalNumberOfReviews = reviews.size();
			
			
			for(Review review : reviews)
			{
				reviewComment = review.getReview();
				String words[] = reviewComment.split("");
				double score = 0;
				for(String word : words)
				{
					if(sentiments.containsKey(word))
					{
						score = score + sentiments.get(word);
					}
				}
				totalScore = totalScore + score;
			}
			
			hotel.setTotalScore(totalScore);
		}
		
		return hotels;
	}
	
	

}
