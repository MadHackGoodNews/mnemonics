package entity;

import java.sql.Date;

/**
 * Created by m on 2015/6/6.
 */
public class User {
	private int userID;
	private String email;
	private String phoneNum;
	private String username;
	private String password;
	private String profileURL;
	private String intro;
	private Date birthday;
	private int followerCount;
	private int followingCount;


	public User(int userID, String email, String phoneNum, String username,
			String password, String profileURL, String intro, Date birthday,
			int followerCount, int followingCount) {
		super();
		this.userID = userID;
		this.email = email;
		this.phoneNum = phoneNum;
		this.username = username;
		this.password = password;
		this.profileURL = profileURL;
		this.intro = intro;
		this.birthday = birthday;
		this.followerCount = followerCount;
		this.followingCount = followingCount;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getProfileURL() {
		return profileURL;
	}

	public void setProfileURL(String profileURL) {
		this.profileURL = profileURL;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getFollowerCount() {
		return followerCount;
	}

	public void setFollowerCount(int followerCount) {
		this.followerCount = followerCount;
	}

	public int getFollowingCount() {
		return followingCount;
	}

	public void setFollowingCount(int followingCount) {
		this.followingCount = followingCount;
	}

	
}
