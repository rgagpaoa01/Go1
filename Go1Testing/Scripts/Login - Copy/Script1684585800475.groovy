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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://clouddevelopmentresources.mygo1.com/login?redirect_url')

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Log in/span_Email'))

WebUI.setText(findTestObject('Object Repository/Go1Changes/Page_Log in/input_Log in with your email_email'), 'rodel.agpaoa@emids.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Go1Changes/Page_Log in/input_Email_password'), 'jxqMmeXTJsPBYkL9vIO9Rw==')

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Log in/button_Log in'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Dashboard  Cloud Development Resources/img_Groups_css-1ve3oum'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Dashboard  Cloud Development Resources/span_Explore'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Explore/span_Personal Development'))

WebUI.doubleClick(findTestObject('Object Repository/Go1Changes/Page_Personal Development/svg_R_css-1cqkmyx'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Personal Development/svg_R_css-1cqkmyx'))

WebUI.doubleClick(findTestObject('Object Repository/Go1Changes/Page_Personal Development/svg_R_css-1cqkmyx'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Personal Development/span_General Personal Development'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Search/span_Groups'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_My groups/h1_Groups'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_My groups/a_Explore groups'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Explore groups/span_My playlists'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_My playlists/h2_My playlists'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_My playlists/span_My learning'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_My Learning  Cloud Development Resources/span_My Learning'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_My Learning  Cloud Development Resources/span_My Learning'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_My Learning  Cloud Development Resources/span_My Learning'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_My Learning  Cloud Development Resources/span_In progress'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_My Learning  Cloud Development Resources/span_Assigned'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Assigned  Cloud Development Resources/span_Scheduled'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Scheduled  Cloud Development Resources/span_Completed'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_My Learning  Cloud Development Resources/span_Saved'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_My Learning/span_My team'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Overview  Cloud Development Resources/span_Overview'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Overview  Cloud Development Resources/span_Users'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/h3_Users'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/span_Enrollments'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Enrollments  Cloud Development Resources/h3_Enrollments'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Enrollments  Cloud Development Resources/span_RA'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Enrollments  Cloud Development Resources/span_Administer'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Enrollments  Cloud Development Resources/span_Administer'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Enrollments  Cloud Development Resources/span_Users'))

WebUI.setText(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_User management_form-control ng-prist_51bffd'), 
    'Rodel Agpaoa')

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_User management_form-control ng-prist_51bffd'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_User management_form-control ng-prist_51bffd'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/i_Filter_fa fa-filter'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/button_Filter'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_User management_form-control ng-prist_51bffd'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_User management_form-control ng-prist_51bffd'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_User management_form-control ng-prist_51bffd'))

WebUI.doubleClick(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_User management_form-control ng-prist_51bffd'))

WebUI.setText(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_User management_form-control ng-prist_51bffd'), 
    'Rode')

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_User management_form-control ng-prist_51bffd'))

WebUI.setText(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_Groups_topSearchDesktop'), 
    '')

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_Groups_topSearchDesktop_1'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_User management_form-control ng-prist_51bffd'))

WebUI.setText(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_User management_form-control ng-prist_51bffd'), 
    '')

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/button_Create'))

WebUI.setText(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input__email'), 'mavic.aquino@emids.com')

WebUI.setText(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input__firstName'), 'Mavic')

WebUI.setText(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input__lastName'), 'Aquino')

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_Content Administrator_manager'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/span_Add'))

WebUI.setText(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_User management_form-control ng-prist_51bffd'), 
    'mavic')

WebUI.sendKeys(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_User management_form-control ng-prist_51bffd'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/div_AdministerOverviewUsersEnrollmentsCours_e30863'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/div_mavic.aquinoemids.com'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/div_mavic.aquinoemids.com'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/div_mavic.aquinoemids.com'))

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/strong_Mavic Aquino'))

WebUI.setText(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/input_User management_form-control ng-prist_51bffd'), 
    '  ')

WebUI.click(findTestObject('Object Repository/Go1Changes/Page_Users  Cloud Development Resources/button_Create'))

