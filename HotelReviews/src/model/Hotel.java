package model;
import java.util.List;

public class Hotel implements Comparable<Hotel>{
	
	private long id;
	
	private String name;
	private List<Review> reviews;
	private double totalScore;

	public double getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(double totalScore) {
		this.totalScore = totalScore;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	public Hotel(long id, String name, List<Review> reviews) {
		super();
		this.id = id;
		this.name = name;
		this.reviews = reviews;
	}
	public Hotel() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", reviews=" + reviews + "]";
	}
	
	@Override
	public int compareTo(Hotel o) {
		if(o.getTotalScore() > this.totalScore)
			return -1;
		else if(o.getTotalScore() == this.totalScore)
			return 0;
		else
			return 1;
	}
	
}
