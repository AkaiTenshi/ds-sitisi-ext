package gr.hua.dit.ds.sitisi.ext.entity;

public class Application {
	private String id;
	private int income;
	private String homeCity;
	private int siblings;
	private boolean documents;
	private boolean approved;
	
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Application(String id, int income, String homeCity, int siblings, boolean documents, boolean approved) {
		super();
		this.id = id;
		this.income = income;
		this.homeCity = homeCity;
		this.siblings = siblings;
		this.documents = documents;
		this.approved = approved;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getHomeCity() {
		return homeCity;
	}

	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}

	public int getSiblings() {
		return siblings;
	}

	public void setSiblings(int siblings) {
		this.siblings = siblings;
	}

	public boolean isDocuments() {
		return documents;
	}

	public void setDocuments(boolean documents) {
		this.documents = documents;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	@Override
	public String toString() {
		return "Application [id=" + id + ", income=" + income + ", homeCity=" + homeCity + ", siblings=" + siblings
				+ ", documents=" + documents + ", approved=" + approved + "]";
	}
	
	

}
