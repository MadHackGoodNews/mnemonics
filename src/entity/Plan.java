package entity;

import java.sql.Date;

public class Plan {
	private int planID;
	private Date mytime_start;
	private Date mytime_end;
	private int cost;
	private String content;
	private String coverPath;
	private String destination;
    private String title;
    private int maxPeople;
    private int havingPeople;
	private int mylike;
	
	public Plan(int planID, Date mytime_start, Date mytime_end, int cost, String content, String coverPath,
			String destination, String title, int maxPeople, int havingPeople, int mylike){
		super();
		this.planID = planID;
		this.mytime_start = mytime_start;
		this.mytime_end = mytime_end;
		this.cost = cost;
		this.content = content;
		this.coverPath = coverPath;
		this.destination = destination;
		this.title = title;
		this.maxPeople = maxPeople;
		this.havingPeople = havingPeople;
		this.mylike = mylike;
	}
	
	public int getPlanID() {
		return planID;
	}	

	public void setPlanID(int planID) {
		this.planID = planID;
	}

	public Date getMytime_start() {
		return mytime_start;
	}

	public void setMytime_start(Date mytime_start) {
		this.mytime_start = mytime_start;
	}

	public Date getMytime_end() {
		return mytime_end;
	}

	public void setMytime_end(Date mytime_end) {
		this.mytime_end = mytime_end;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCoverPath() {
		return coverPath;
	}

	public void setCoverPath(String coverPath) {
		this.coverPath= coverPath;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(int maxPeople) {
		this.maxPeople = maxPeople;
	}

	public int getHavingPeople() {
		return havingPeople;
	}

	public int getMylike(){
		return mylike;
	}
	
	public void setMylike(int mylike) {
		this.mylike = mylike;
	}
	
}
