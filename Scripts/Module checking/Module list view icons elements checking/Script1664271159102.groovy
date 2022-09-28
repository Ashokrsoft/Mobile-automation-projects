import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\USER\\Downloads\\app-release (1).apk', true)

String cmp = 'Object Repository/android.widget.EditText - Organisation Name'

Mobile.tap(findTestObject(cmp), 0)

Mobile.sendKeys(findTestObject(cmp), 'THARUN')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - User Name (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - User Name (2)'), 'rsoft')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Password (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Password (2)'), 'RSoft!@345')

Mobile.tap(findTestObject('Object Repository/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Menu'), 0)

Mobile.swipe(360, 1200, 360, 788)

Mobile.tap(findTestObject('Object Repository/Leads module/Module Icons visibiles/Module sellect'), 0)

try {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Leads module/Module Icons visibiles/Search button'), 0)

    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Search button.png')
}
catch (Exception e) {
    println('Search button ot present')
} 

try {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Leads module/Module Icons visibiles/Module list view back button'), 
        0)

    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\list view back button.png')
}
catch (Exception e) {
    println('list view back button ot present')
} 

try {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Leads module/Module Icons visibiles/Filter coloumn'), 
        0)

    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Filter coloumn.png')
}
catch (Exception e) {
    println('Filter coloumn button ot present')
} 

try {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Leads module/Module Icons visibiles/Edit icon'), 0)

    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Edit icon .png')
}
catch (Exception e) {
    println('Edit icon  button ot present')
} 

try {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Leads module/Module Icons visibiles/Detail page icon'), 
        0)

    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Detail page  .png')
}
catch (Exception e) {
    println('Detail page  button ot present')
} 

try {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Leads module/Module Icons visibiles/Delete icon'), 0)

    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Delete  .png')
}
catch (Exception e) {
    println('Detail page  button ot present')
} 

try {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Leads module/Module Icons visibiles/Module name'), 0)

    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Module name .png')
}
catch (Exception e) {
    println('MOdule name  button ot present')
} 


try {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Leads module/Module Icons visibiles/Comments icon'), 0)

    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Comments icon .png')
}
catch (Exception e) {
    

    println('Comments button ot present')
} 

try {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Leads module/Module Icons visibiles/CheckIn icon'), 0)

    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\CheckIn icon .png')
}
catch (Exception e) {
    println('CheckIn icon button ot present')
} 

try {
    Mobile.verifyElementVisible(findTestObject('Object Repository/Leads module/Module Icons visibiles/Updates icon'), 0)

    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Updates icon .png')
}
catch (Exception e) {
	e.printStackTrace()
    println('Comments button ot present')
} 

Mobile.closeApplication()

