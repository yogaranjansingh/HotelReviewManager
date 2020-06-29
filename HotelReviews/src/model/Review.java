package model;

public class Review {
	
	long id;
	double score;
	String review;
	
	long hotelId;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Review(long id, double score, String review) {
		super();
		this.id = id;
		this.score = score;
		this.review = review;
	}
	
	public Review(long id, String review, long hotelId) {
		super();
		this.id = id;
		this.review = review;
		this.hotelId = hotelId;
	}
	
	public Review(long id, double score, String review, long hotelId) {
		super();
		this.id = id;
		this.score = score;
		this.review = review;
		this.hotelId = hotelId;
	}
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", score=" + score + ", review=" + review + ", hotelId=" + hotelId + "]";
	}
	
	

}
