package enquiryIoStructures

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class SingleAdultFareDtls {
	
	public SingleAdultFareDtls(){
		
				baseFare = '';
				cateringCharge = '';
				dynamicCharge = '';
				reservationCharge = '';
				supCharge = '';
				tatkalVariableCharge = '';
				gst = '';
				others = '';
				totalFare = '';
	}
	
	public String getBaseFare() {
		return baseFare;
	}
	public void setBaseFare(String baseFare) {
		this.baseFare = baseFare;
	}
	public String getCateringCharge() {
		return cateringCharge;
	}
	public void setCateringCharge(String cateringCharge) {
		this.cateringCharge = cateringCharge;
	}
	public String getDynamicCharge() {
		return dynamicCharge;
	}
	public void setDynamicCharge(String dynamicCharge) {
		this.dynamicCharge = dynamicCharge;
	}
	public String getReservationCharge() {
		return reservationCharge;
	}
	public void setReservationCharge(String reservationCharge) {
		this.reservationCharge = reservationCharge;
	}
	public String getSupCharge() {
		return supCharge;
	}
	public void setSupCharge(String supCharge) {
		this.supCharge = supCharge;
	}
	public String getTatkalVariableCharge() {
		return tatkalVariableCharge;
	}
	public void setTatkalVariableCharge(String tatkalVariableCharge) {
		this.tatkalVariableCharge = tatkalVariableCharge;
	}
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	public String getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(String totalFare) {
		this.totalFare = totalFare;
	}
	
	
	private String baseFare;
	private String cateringCharge;
	private String dynamicCharge;
	private String reservationCharge;
	private String supCharge;
	private String tatkalVariableCharge;
	private String gst;
	private String others;
	private String totalFare;
}
