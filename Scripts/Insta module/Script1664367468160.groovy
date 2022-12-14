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

Mobile.startApplication('C:\\Users\\USER\\Downloads\\SR-T-SEP28.apk', true)

String cmp = 'Object Repository/android.widget.EditText - Organisation Name'

Mobile.tap(findTestObject(cmp), 0)

Mobile.sendKeys(findTestObject(cmp), 'THARUN')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - User Name (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - User Name (2)'), 'rsoft')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Password (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Password (2)'), 'RSoft!@345')

Mobile.tap(findTestObject('Object Repository/android.widget.Button (2)'), 0)
Mobile.tap(findTestObject('Object Repository/Menu'), 0)




Mobile.tap(findTestObject('Object Repository/Instrgram module/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Instrgram module/android.view.View (1)') , 0)

Mobile.tap( findTestObject('Object Repository/Instrgram module/android.view.View (2)'), 0)

Mobile.swipe(360, 1050, 360, 0)

Mobile.tap(findTestObject('Object Repository/Instrgram module/android.widget.Button (2)'), 0)


Mobile.tap(findTestObject('Object Repository/Instrgram module/android.view.View (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Instrgram module/android.widget.Button (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Instrgram module/android.view.View (3)') , 0)

Mobile.tap(findTestObject('Object Repository/Instrgram module/android.widget.EditText - 43574ghf.hg, Email'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Instrgram module/android.widget.EditText - 43574ghf.hg, Email (1)'), 'automation@gmail.com')


Mobile.tap(findTestObject('Object Repository/Instrgram module/android.widget.EditText - automationgmail.com, Email'), 0)

Mobile.closeApplication()

