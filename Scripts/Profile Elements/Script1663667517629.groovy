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

String cmp = 'Object Repository/android.widget.EditText - Organisation Name'


if (Mobile.verifyElementVisible(findTestObject('Object Repository/android.view.View'), 0)) {
	
	    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Loginpageelements.png')
	
}else {
    println('login your account text not verified')
}


if ( Mobile.verifyElementVisible(findTestObject(cmp), 0)) {
		
	    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Loginpageelements.png')
		
    }else {
        println('Company Name not verified')
    }


if (Mobile.verifyElementVisible(findTestObject('Object Repository/android.widget.EditText - User Name'),  0)) {
		
	    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Loginpageelements.png')
		
        }else {
            println('User Name field not verified')
        }
            
		
if (Mobile.verifyElementVisible(findTestObject('Object Repository/android.widget.EditText - Password'),  0)) {
			
	    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Loginpageelements.png')
			
		}else {
                println('Password field not verified')
            }

           
if (Mobile.verifyElementVisible(findTestObject('Object Repository/android.widget.Button'), 0)) {
	
        Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Loginpageelements.png')
           
		 } else {
                    println('Login Button not verified')
                }
            
Mobile.tap(findTestObject(cmp), 0)

Mobile.sendKeys(findTestObject(cmp), 'RSOFT')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - User Name (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - User Name (2)'), 'Satheesh')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Password (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Password (2)'), 'Satheesh@1234')

Mobile.tap(findTestObject('Object Repository/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Menu'), 0)

Mobile.tap(findTestObject('Object Repository/Profile'), 0)



if (Mobile.verifyElementVisible(findTestObject('Object Repository/first_last'), 0)) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\profile elemets capture.png')
	
} else {
    println('first_last name not present')
}



if ( Mobile.verifyElementVisible(findTestObject('Object Repository/rsoft'), 0)) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\profile top usernamecapture.png')
	
} else {
    println('topusername not present')
}




if (Mobile.verifyElementVisible(findTestObject('Object Repository/top_role'), 0)) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\profile top role.png')
	
} else {
    println('top role not present')
}


if (Mobile.verifyElementVisible(findTestObject('Object Repository/Username'), 0)) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\username role.png')
	
} else {
    println('usernamet not present')
}


if ( Mobile.verifyElementVisible(findTestObject('Object Repository/Role'), 0)) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\role.png')
	
} else {
    println('role not present')
}


if (Mobile.verifyElementVisible(findTestObject('Object Repository/Phone'), 0)) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\phone.png')
	
} else {
    println('role not present')
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/Email'), 0)) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\email.png')
	
} else {
    println('Email not present')
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/Time'), 0)) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Time format.png')
} else {
    println('time not present')
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/date_format'), 0)) {
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Date format.png')
} else {
    println('date format not present')
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/android.widget.Button (3)'), 0)) {
    Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\back button.png')
} else {
    println('back button are not present')
}

Mobile.verifyElementVisible(findTestObject('Object Repository/Username value'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Role value'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Phone value'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Email value'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Time value'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Date format'), 0)

Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\profile field values.png')

Mobile.tap(findTestObject('Object Repository/android.widget.Button (3)'), 0)

Mobile.closeApplication()