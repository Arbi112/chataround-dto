package com.service.chataround.dto.chat;

import java.io.Serializable;

import com.service.chataround.dto.UserWebEntity;

public class UserDto implements UserWebEntity,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	private String nickName;
	private Double longitude;
	private Double lattitude;
	private String statusMessage;
	private String deviceId;
	private String userId;
	private String gender;
	private String smallImageUrl;
	private String mediumImageUrl;
	private String largeImageUrl;

	public UserDto(){
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLattitude() {
		return lattitude;
	}
	public void setLattitude(Double lattitude) {
		this.lattitude = lattitude;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		Gender gendreEnum = Gender.parse(gender);
		if(gendreEnum == null){
			throw new RuntimeException(gender + " is not a correct value for Gender");
		}
		this.gender = gender;
	}
	public String getSmallImageUrl() {
		return smallImageUrl;
	}
	public void setSmallImageUrl(String smallImageUrl) {
		this.smallImageUrl = smallImageUrl;
	}
	public String getMediumImageUrl() {
		return mediumImageUrl;
	}
	public void setMediumImageUrl(String mediumImageUrl) {
		this.mediumImageUrl = mediumImageUrl;
	}
	public String getLargeImageUrl() {
		return largeImageUrl;
	}
	public void setLargeImageUrl(String largeImageUrl) {
		this.largeImageUrl = largeImageUrl;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDto [email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", nickName=");
		builder.append(nickName);
		builder.append(", longitude=");
		builder.append(longitude);
		builder.append(", lattitude=");
		builder.append(lattitude);
		builder.append(", statusMessage=");
		builder.append(statusMessage);
		builder.append(", deviceId=");
		builder.append(deviceId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", smallImageUrl=");
		builder.append(smallImageUrl);
		builder.append(", mediumImageUrl=");
		builder.append(mediumImageUrl);
		builder.append(", largeImageUrl=");
		builder.append(largeImageUrl);
		builder.append("]");
		return builder.toString();
	}
	
}
