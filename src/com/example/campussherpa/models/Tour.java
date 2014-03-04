package com.example.campussherpa.models;

import java.util.List;

public class Tour {
	private String mID;
	private String mName;
	private String mDescription;
	private int mExpectedDuration;
	private byte[] mThumbnail;
	private List<String> mTourLocationIDs;
	private String mIDOfCreator;
	public String getID() {
		return this.mID;
	}
	public void setID(String iD) {
		this.mID = iD;
	}
	public String getName() {
		return this.mName;
	}
	public void setName(String name) {
		this.mName = name;
	}
	public String getDescription() {
		return this.mDescription;
	}
	public void setDescription(String description) {
		this.mDescription = description;
	}
	public int getExpectedDuration() {
		return this.mExpectedDuration;
	}
	public void setExpectedDuration(int expectedDuration) {
		this.mExpectedDuration = expectedDuration;
	}
	public byte[] getThumbnail() {
		return this.mThumbnail;
	}
	public void setThumbnail(byte[] thumbnail) {
		this.mThumbnail = thumbnail;
	}
	public List<String> getTourLocationIDs() {
		return this.mTourLocationIDs;
	}
	public void setTourLocationIDs(List<String> tourLocationIDs) {
		this.mTourLocationIDs = tourLocationIDs;
	}
	public String getIDOfCreator() {
		return this.mIDOfCreator;
	}
	public void setIDOfCreator(String iDOfCreator) {
		this.mIDOfCreator = iDOfCreator;
	}
	
	
}
