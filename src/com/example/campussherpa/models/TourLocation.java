package com.example.campussherpa.models;

import java.util.List;

import android.location.Location;

public class TourLocation {
	private String mID;
	private String mName;
	private String mDescription;
	private byte[] mThumbnail;
	private Location mLocation;
	private List<String> mMediaIDs;
	private String mTourID;
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
	public byte[] getThumbnail() {
		return this.mThumbnail;
	}
	public void setThumbnail(byte[] thumbnail) {
		this.mThumbnail = thumbnail;
	}
	public Location getLocation() {
		return this.mLocation;
	}
	public void setLocation(Location location) {
		this.mLocation = location;
	}
	public List<String> getMediaIDs() {
		return this.mMediaIDs;
	}
	public void setMediaIDs(List<String> mediaIDs) {
		this.mMediaIDs = mediaIDs;
	}
	public String getTourID() {
		return this.mTourID;
	}
	public void setTourID(String tourID) {
		this.mTourID = tourID;
	}
	
	
}
