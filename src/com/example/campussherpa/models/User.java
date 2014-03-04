package com.example.campussherpa.models;

import java.util.List;

public class User {
	private String mID;
	private String mUserName;
	private String mBio;
	private List<String> mTourIDs;
	public String getID() {
		return this.mID;
	}
	public void setID(String iD) {
		this.mID = iD;
	}
	public String getUserName() {
		return this.mUserName;
	}
	public void setUserName(String userName) {
		this.mUserName = userName;
	}
	public String getBio() {
		return this.mBio;
	}
	public void setBio(String bio) {
		this.mBio = bio;
	}
	public List<String> getTourIDs() {
		return this.mTourIDs;
	}
	public void setTourIDs(List<String> tourIDs) {
		this.mTourIDs = tourIDs;
	}
	
	
}
