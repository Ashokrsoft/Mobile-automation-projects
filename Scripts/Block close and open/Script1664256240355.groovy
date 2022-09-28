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

Mobile.startApplication('C:\\Users\\USER\\Downloads\\SR-T-SEP20.apk', true)

FileInputStream fis = new FileInputStream('Property File/Credentials.properties')

Properties prop = new Properties()

prop.load(fis)

String org = prop.getProperty('Organisation')

String user = prop.getProperty('UserName')

String pass = prop.getProperty('Password')

String cmp = 'Object Repository/android.widget.EditText - Organisation Name'

String clo = 'Object Repository/android.view.View (4)'

Mobile.tap(findTestObject(cmp), 0)

Mobile.sendKeys(findTestObject(cmp), org)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - User Name (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - User Name (2)'), user)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Password (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Password (2)'), pass)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Menu'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View (3)'), 0)



try{
	Mobile.tap(findTestObject('Object Repository/Settings elemeents object/Settings element block close and open/android.view.View (9)'),0)
Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Dashboard block .png')
		
}
catch(Exception e){
	println('Dashboard block not present')
	Mobile.pressBack()
	
}


try{
	Mobile.tap(findTestObject('Object Repository/Settings elemeents object/Settings element block close and open/android.view.View (9)'),0)
Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Dashboard block .png')
		
}
catch(Exception e){
	println('Dashboard block open not present')
	Mobile.pressBack()
	
}



try{
Mobile.tap(findTestObject('Object Repository/Settings elemeents object/Settings element block close and open/android.view.View (1)'), 
    0)
Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\List view block .png')
		
}
catch(Exception e){
	println('List view close not present')
	Mobile.pressBack()
	
}


try{
	Mobile.tap(findTestObject('Object Repository/Settings elemeents object/Settings element block close and open/android.view.View (2)'), 
    0)
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\List view block .png')
			
	}
	catch(Exception e){
		println('List view block open not present')
		Mobile.pressBack()
		
	}


try{
	Mobile.tap(findTestObject('Object Repository/Settings elemeents object/Settings element block close and open/android.view.View (3)'), 
    0)
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\color option block .png')
			
	}
	catch(Exception e){
		println('List view block open not present')
		Mobile.pressBack()
		
	}




try{
Mobile.tap(findTestObject('Object Repository/Settings elemeents object/Settings element block close and open/android.view.View (4)'), 
    0)
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Color block .png')
			
	}
	catch(Exception e){
		println(' block open not present')
		Mobile.pressBack()
		
	}


try{
	
Mobile.tap(findTestObject('Object Repository/Settings elemeents object/Settings element block close and open/android.view.View (5)'), 
    0)
		Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Notificatinon block .png')
				
		}
		catch(Exception e){
			println(' block close not present')
			Mobile.pressBack()
			
		}


try{
	
Mobile.tap(findTestObject('Object Repository/Settings elemeents object/Settings element block close and open/android.view.View (6)'), 
    0)
		Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Notification block .png')
				
		}
		catch(Exception e){
			println(' block close not present')
			Mobile.pressBack()
			
		}


try{
Mobile.tap(findTestObject('Object Repository/Settings elemeents object/Settings element block close and open/android.view.View (7)'), 
    0)
		Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Quick button block .png')
				
		}
		catch(Exception e){
			println(' block close not present')
			Mobile.pressBack()
			
		}


try{
	
Mobile.tap(findTestObject('Object Repository/Settings elemeents object/Settings element block close and open/android.view.View (8)'), 
    0)
		Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Quick option block .png')
				
		}
		catch(Exception e){
			println(' block open not present')
			Mobile.pressBack()
			
		}





Mobile.closeApplication()

