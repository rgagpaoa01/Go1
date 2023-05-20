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

WebUI.waitForElementVisible(findTestObject('Go1Changes/Page_Dashboard  Cloud Development Resources/span_Learning'), 0)

WebUI.verifyElementVisible(findTestObject('Go1Changes/Page_Dashboard  Cloud Development Resources/span_Learning'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Go1Changes/Page_Dashboard  Cloud Development Resources/span_Learning'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Go1Changes/Page_My Learning  Cloud Development Resources/span_My Learning'), 
    0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Go1Changes/Page_My Learning  Cloud Development Resources/span_In progress'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Go1Changes/Page_My Learning  Cloud Development Resources/span_My Learning'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Go1Changes/Page_My Learning  Cloud Development Resources/span_In progress'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Go1Changes/Page_My Learning  Cloud Development Resources/span_Assigned'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Go1Changes/Page_Assigned  Cloud Development Resources/span_Scheduled'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Go1Changes/Page_Scheduled  Cloud Development Resources/span_Completed'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Go1Changes/Page_My Learning  Cloud Development Resources/span_Saved'))

