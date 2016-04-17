package entity;

import java.sql.Date;

public class Route {
  	private int routeID;
  	private int userID;
  	private String mytime;
  	private String destination;
  	private int cost;
  	private String coverPath;
  	private String tag;
  	private String title;
  	private float score;

	public Route(int routeID, int userID, String mytime, String destination,
			int cost, String coverPath, String tag, String title,
			float score) {
		super();
		this.routeID = routeID;
		this.userID = userID;
		this.mytime = mytime;
		this.destination = destination;
		this.cost = cost;
		this.coverPath = coverPath;
		this.tag = tag;
		this.title = title;
		this.score = score;
	}

	public int getRouteID() {
		return routeID;
	}

	public void setRouteID(int routeID) {
		this.routeID = routeID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getMytime() {
		return mytime;
	}

	public void setMytime(String mytime) {
		this.mytime = mytime;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getCoverPath() {
		return coverPath;
	}

	public void setCoverPath(String coverPath) {
		this.coverPath = coverPath;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String etag) {
		this.tag = tag;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
}
