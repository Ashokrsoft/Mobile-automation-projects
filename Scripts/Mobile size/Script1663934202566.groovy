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

Mobile.startApplication('C:\\Users\\USER\\Downloads\\app-release.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Organisation Name (3)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Organisation Name (4)'), 'THARUN')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - User Name (5)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - User Name (6)'), 'rsoft')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Password (5)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Password (6)'), 'RSoft!@345')

Mobile.tap(findTestObject('Object Repository/android.widget.Button (25)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (26)'), 0)



height = Mobile.getDeviceHeight()

manu = Mobile.getDeviceManufacturer()

os = Mobile.getDeviceOS()

osversion = Mobile.getDeviceOSVersion()

wid = Mobile.getDeviceWidth()

orien = Mobile.getCurrentOrientation()

Mobile.swipe(0, 0, 0, 0)

system.print(height + '**' + manu + '**' + os + '**' + osversion + '**' + wid + '**' + orien)

Mobile.closeApplication()

