package net.yuanmomo.searchrescue.web.bean;

import org.springframework.web.multipart.MultipartFile;

public class BeaconAndFile {
	private MultipartFile beaconFile;
	private String beaconNo;

	public String getBeaconNo() {
		return beaconNo;
	}

	public void setBeaconNo(String beaconNo) {
		this.beaconNo = beaconNo;
	}

	public MultipartFile getBeaconFile() {
		return beaconFile;
	}

	public void setBeaconFile(MultipartFile beaconFile) {
		this.beaconFile = beaconFile;
	}

}