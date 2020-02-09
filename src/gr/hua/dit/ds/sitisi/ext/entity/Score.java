package gr.hua.dit.ds.sitisi.ext.entity;

public class Score {
	private int points;
	private boolean approved;
	private int rank;
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Score(int points, boolean approved, int rank) {
		super();
		this.points = points;
		this.approved = approved;
		this.rank = rank;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Score [points=" + points + ", approved=" + approved + ", rank=" + rank + "]";
	}
	
	

}
