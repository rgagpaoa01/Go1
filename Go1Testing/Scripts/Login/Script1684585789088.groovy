import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://clouddevelopmentresources.mygo1.com/login?redirect_url')

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Log in/span_Email'))

WebUI.setText(findTestObject('Object Repository/Go1Changes/Page_Log in/input_Log in with your email_email'), 'rodel.agpaoa@emids.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Go1Changes/Page_Log in/input_Email_password'), 'jxqMmeXTJsPBYkL9vIO9Rw==')

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Log in/button_Log in'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Go1Changes/Page_Dashboard  Cloud Development Resources/img_Groups_css-1ve3oum'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Go1Changes/Page_Dashboard  Cloud Development Resources/img_Groups_css-1ve3oum'), 
    FailureHandling.STOP_ON_FAILURE)

