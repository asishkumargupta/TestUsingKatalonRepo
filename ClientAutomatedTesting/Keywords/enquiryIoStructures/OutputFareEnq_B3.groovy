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
import ioStructures.BookedTktFareDtls

public class OutputFareEnq_B3 {

	public  OutputFareEnq_B3() {
		testCaseId = '';
		siteCode = '';
		siteName = '';
		functionalityName = '';
		status = '';
		errorMsg ='';
		recNo = '';
		concession= '';
		voucherAmount= '';
	     cashAmount= '';
	}

	public String getRecNo() {
		return recNo;
	}
	public void setRecNo(String recNo) {
		this.recNo = recNo;
	}

	public String getTestCaseId() {
		return testCaseId;
	}
	public void setTestCaseId(String testCaseId) {
		this.testCaseId = testCaseId;
	}
	public String getFunctionalityName() {
		return functionalityName;
	}
	public void setFunctionalityName(String functionalityName) {
		this.functionalityName = functionalityName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getSiteCode() {
		return siteCode;
	}
	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public SingleAdultFareDtls getsingleAdultFareDtls() {
		return singleAdultFareDtls;
	}

	public void setSingleAdultFareDtls(SingleAdultFareDtls singleAdultFareDtls) {
		this.singleAdultFareDtls = singleAdultFareDtls;
	}
	
	public TxnFareDtls gettxnFareDtls() {
		return txnFareDtls;
	}

	public void setTxnFareDtls(TxnFareDtls txnFareDtls) {
		this.txnFareDtls = txnFareDtls;
	}
	public String getConcession() {
		return concession;
	}
	public void setConcession(String concession) {
		this.concession = concession;
	}
	public String getVoucherAmount() {
		return voucherAmount;
	}
	public void setVoucherAmount(String voucherAmount) {
		this.voucherAmount = voucherAmount;
	}
	public String getCashAmount() {
		return cashAmount;
	}
	public void setCashAmount(String cashAmount) {
		this.cashAmount = cashAmount;
	}

	private String testCaseId;
	private String functionalityName;
	private String  status;
	private String errorMsg;
	private String siteCode;
	private String siteName;
	private String recNo;
	
	
	private SingleAdultFareDtls singleAdultFareDtls;
	private TxnFareDtls txnFareDtls;

	private String concession;
	private String voucherAmount;
	private String cashAmount;
}

