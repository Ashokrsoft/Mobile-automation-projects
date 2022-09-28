import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.builtin.CloseApplicationKeyword
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

Mobile.startApplication('C:\\Users\\USER\\Downloads\\app-release.apk', true)

FileInputStream  fis= new FileInputStream('Property File/Credentials.properties')

Properties prop= new Properties()

prop.load (fis)

String org = prop.getProperty('Organisation')

String user = prop.getProperty('UserName')

String pass = prop.getProperty('Password')

Mobile.startApplication('C:\\Users\\USER\\Downloads\\SR-T-SEP20.apk', true)

String cmp = 'Object Repository/android.widget.EditText - Organisation Name'

String clo = 'Object Repository/android.view.View (4)';
Mobile.tap(findTestObject(cmp), 0)

Mobile.sendKeys(findTestObject(cmp), org)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - User Name (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - User Name (2)'), user)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Password (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Password (2)'), pass)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Menu'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View (3)'), 0)

boolean dashboardoption=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/Dashboard option'), 0)
if (true==dashboardoption) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\profile elemets capture.png')	
}else {
	println('Dashborard option not present')
}


boolean dashboardtemp_def=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/Dashboard temp defa'), 0)
if (true==dashboardtemp_def) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\profile elemets capture.png')	
}else {
	println('dashboardtemp_def not present')
}


boolean dashmixed=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/Dashmixed'), 0)
if (true==dashmixed) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\dashmixed.png')
}else {
	println('dashmixedoption not present')
}


boolean listviewoption=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/listviewoption'), 0)
if (true==listviewoption) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\listviewoptio.png')
}else {
	println('listviewoptio not present')
}

boolean defaultlistview=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/defasrylelist'), 0)
if (true==defaultlistview) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\defaultlistview.png')
}else {
	println('defaultlistview not present')
}

boolean circlelistview=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/circstyelistview'), 0)
if (true==circlelistview) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\circlelistview.png')
}else {
	println('circlelistviewnot present')
}

boolean coloroption=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/coloroption'), 0)
if (true==coloroption) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\coloroption.png')
}else {
	println('coloroption not present')
}
boolean theme=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/theme'), 0)
if (true==theme) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\theme.png')
}else {
	println('themenot present')
}

boolean notification_option=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/Notificationoption'), 0)
if (true== notification_option) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\ notification_option.png')
}else {
	println(' notification_option not present')
}

boolean caller_notification=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/callerntoification'), 0)
if (true== caller_notification) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\ caller_notification.png')
}else {
	println(' caller_notification not present')
}

boolean push_notification=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/pushnotificaitn'), 0)
if (true== push_notification) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\ push_notificatio.png')
}else {
	println(' push_notification not present')
}

boolean notfic_button=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/notific button'), 0)
if (true==notfic_button) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\  notfic_button.png')
}else {
	println('  notfic_button not present')
}
boolean quick_action=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/quickaction'), 0)
if (true==quick_action) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\  quick_action.png')
}else {
	println('quick_actionnot present')
}
boolean notification_shortuct=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/notificationshortcut'), 0)
if (true==notification_shortuct) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\notification_shortuct.png')
}else {
	println('notification_shortuct not present')
}
boolean notificationshortcut_button=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/notificationshortcut button'), 0)
if (true== notificationshortcut_button) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\ notificationshortcut_button.png')
}else {
	println(' notificationshortcut_button not present')
}

boolean caller_notification_button=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/Caller_notification_button'), 0)
if (true== caller_notification_button) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\ caller_notification_button.png')
}else {
	println(' caller_notification_buttonnot present')
}


boolean attendance_back_button=Mobile.verifyElementVisible(findTestObject('Object Repository/Settings elemeents object/Attendance back button'), 0)
if (true==attendance_back_button) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\ attendance_back_button.png')
}else{
	println('attendance_back_button not present')
}

Mobile.closeApplication()











