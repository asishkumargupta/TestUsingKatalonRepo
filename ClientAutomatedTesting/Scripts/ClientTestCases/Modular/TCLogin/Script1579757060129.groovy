import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable


KeywordLogger logger = new KeywordLogger()

//PropertyConfigurator.configure("path of .properties file")

logger.logInfo("TESTING LOGGER IN KATALON using Keyword Logger")
KeywordUtil.logInfo("TESTING LOGGER IN KATALON")

WebUI.openBrowser('')


WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()
WebUI.click(findTestObject('NxtGenPRS_OR/HomePage/bookingTab'))
//WebUI.setText(findTestObject('null'),GlobalVariable.officePcIp)
WebUI.setText(findTestObject('Object Repository/NxtGenPRS_OR/BookingPage/LogInDtls/LogInDtls/input_Login_mat-input-0'), GlobalVariable.clientUserid)

WebUI.setText(findTestObject('Object Repository/NxtGenPRS_OR/BookingPage/LogInDtls/LogInDtls/input_User Name_mat-input-1'),
		GlobalVariable.clientPasswd)


//WebUI.setText(findTestObject('null'),GlobalVariable.officePcIp)
findTestObject('Object Repository/NxtGenPRS_OR/BookingPage/LogInDtls/LogInDtls/div_Office PC IP address')

WebUI.setText(findTestObject('Object Repository/NxtGenPRS_OR/BookingPage/LogInDtls/LogInDtls/div_Office PC IP address'),GlobalVariable.officePcIp)

WebUI.click(findTestObject('Object Repository/NxtGenPRS_OR/BookingPage/LogInDtls/LogInDtls/button_Login'))

if (WebUI.verifyElementPresent(findTestObject('NxtGenPRS_OR/BookingPage/LogInDtls/StockDtls/input_ticketNo'), GlobalVariable.waitForElementVisibleSec, FailureHandling.OPTIONAL) ==
	true) {
	
	WebUI.click(findTestObject('NxtGenPRS_OR/BookingPage/LogInDtls/StockDtls/input_ticketNo'))
	WebUI.setText(findTestObject('NxtGenPRS_OR/BookingPage/LogInDtls/StockDtls/input_ticketNo'),GlobalVariable.ticketNumber)
	

	}

	


WebUI.setText(findTestObject('NxtGenPRS_OR/BookingPage/LogInDtls/StockDtls/input_ReEnterTicketNo'),
	GlobalVariable.ticketNumber)

WebUI.click(findTestObject('NxtGenPRS_OR/BookingPage/LogInDtls/StockDtls/div_Ticket Roll Type'))
//WebUI.setText(findTestObject('NxtGenPRS_OR/BookingPage/LogInDtls/StockDtls/div_Ticket Roll Type'),
	//GlobalVariable.ticketRollType)

for (int ticketRollCount = GlobalVariable.ticketRollCount; ticketRollCount <= GlobalVariable.maxTicketRoll; ticketRollCount++) {
	
				testObject = 'Object Repository/NxtGenPRS_OR/BookingPage/LogInDtls/StockDtls/ticketRollType'+ ticketRollCount
				
				if (WebUI.verifyElementPresent(findTestObject(testObject), GlobalVariable.waitForElementPresentSec, FailureHandling.OPTIONAL) == true) {
					//if (WebUI.verifyElementPresent(findTestObject(testObject), 1, FailureHandling.CONTINUE_ON_FAILURE) == true) {
	
					ticketRollType = WebUI.getText(findTestObject(testObject))
					//	System.out.println('CLASS NAME IS=' + className)
					guiticketRollType = ticketRollType.split('-')[0].trim()
					System.out.println(' GUI CLass CLASS CODE IS=' + guiticketRollType)
					
					if (guiticketRollType.equals(GlobalVariable.ticketRollType)) {
						System.out.println('CLICKING CLASS CODE')
						WebUI.click(findTestObject(testObject))
				
						break;
					}
	
				}
			}

WebUI.setText(findTestObject('NxtGenPRS_OR/BookingPage/LogInDtls/StockDtls/imprestCash'),
	GlobalVariable.imprestCash)


WebUI.setText(findTestObject('NxtGenPRS_OR/BookingPage/LogInDtls/StockDtls/personalCash'),
	GlobalVariable.personalCash)






WebUI.setText(findTestObject('NxtGenPRS_OR/BookingPage/LogInDtls/StockDtls/stockEntryUserID'),GlobalVariable.clientSupervisorId)

WebUI.setText(findTestObject('NxtGenPRS_OR/BookingPage/LogInDtls/StockDtls/stockEntryUserPassword'),
		GlobalVariable.clientSupervisorPasswd)






System.out.println('\nSCROLLING TILL SUBMIT\n' )
String scrollingPosition = 'Object Repository/NxtGenPRS_OR/BookingPage/LogInDtls/StockDtls/button_Submit'

WebUI.scrollToElement(findTestObject(scrollingPosition), GlobalVariable.sleepTimeInSec)

WebUI.waitForElementClickable(findTestObject('Object Repository/NxtGenPRS_OR/BookingPage/LogInDtls/StockDtls/button_Submit'), GlobalVariable.waitForElementClickableSec)

WebUI.click(findTestObject('Object Repository/NxtGenPRS_OR/BookingPage/LogInDtls/StockDtls/button_Submit'))

