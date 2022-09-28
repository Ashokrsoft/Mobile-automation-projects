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
import com.thoughtworks.selenium.webdriven.commands.GetText as GetText
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

FileInputStream fis = new FileInputStream('Property File/Credentials.properties')

Properties prop = new Properties()

prop.load(fis)

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



Mobile.tap(findTestObject(clo), 0)

try{
	Mobile.tap(findTestObject('Object Repository/android.widget.Button (8)'), 0)
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\button8.png')
}
catch(Exception e) {
	println('button 8 not present')
	Mobile.pressBack()
	
}


	


Mobile.tap(findTestObject(clo), 0)


try{
Mobile.tap(findTestObject('Object Repository/android.widget.Button (9)'), 0)
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\button9.png')
}
catch(Exception e) {
	println('button 9 not present')
	Mobile.pressBack()
	
}






Mobile.tap(findTestObject(clo), 0)
try {
Mobile.tap(findTestObject('Object Repository/android.widget.Button (10)'), 0)
Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\button10.png')
}
catch(Exception e) {
	println('button 10 not present')
	Mobile.pressBack()
	
}

Mobile.tap(findTestObject(clo), 0)
try {
Mobile.tap(findTestObject('Object Repository/android.widget.Button (11)'), 0)
Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\button11.png')

}
catch(Exception e) {
	println('button 8 not present')
	Mobile.pressBack()
	
}

Mobile.tap(findTestObject(clo), 0)


try {
Mobile.tap(findTestObject('Object Repository/android.widget.Button (12)'), 0)
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\button12.png')
	
	}
	catch(Exception e) {
		println('button 12 not present')
		Mobile.pressBack()	
	}
Mobile.tap(findTestObject(clo), 0)

try {
Mobile.tap(findTestObject('Object Repository/android.widget.Button (13)'), 0)
		Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\button13.png')
		
		}
		catch(Exception e) {
			println('button 13 not present')
			Mobile.pressBack()
		}


Mobile.tap(findTestObject(clo), 0)

try {
Mobile.tap(findTestObject('Object Repository/android.widget.Button (14)'), 0)
			Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\button14.png')
			
			}
			catch(Exception e) {
				println('button 14 not present')
				Mobile.pressBack()
			}


Mobile.tap(findTestObject(clo), 0)

try {
Mobile.tap(findTestObject('Object Repository/android.widget.Button (15)'), 0)
				Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\button15.png')
				
				}
				catch(Exception e) {
					println('button 15 not present')
					Mobile.pressBack()
				}
	
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)


try {
Mobile.tap (findTestObject('Object Repository/Purple _love'),0)
					Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Purple love.png')
					
					}
					catch(Exception e) {
						println('button 15 not present')
						Mobile.pressBack()
					}
		


Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/Piglet') ,0)
						Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Piglet.png')
						
						}
						catch(Exception e) {
							println('Piglet not present')
							Mobile.pressBack()
						}

Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)


try {
Mobile.tap(findTestObject('Object Repository/mauve'), 0)
							Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\mauve.png')
							
							}
							catch(Exception e) {
								println('Piglet not present')
								Mobile.pressBack()
							}
	
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)


try {
Mobile.tap(findTestObject('Object Repository/shade of grey'), 0)
Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\grey.png')
								
				}
	catch(Exception e) {
					println('Piglet not present')
					Mobile.pressBack()
								}
		
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)


try {
Mobile.tap(findTestObject('Object Repository/lost'), 0)
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\lost memory.png')
									
					}
		catch(Exception e) {
						println('Piglet not present')
						Mobile.pressBack()
									}
			
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)


try {
Mobile.tap(findTestObject('Object Repository/socialive'), 0)
		Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\social live.png')
										
						}
			catch(Exception e) {
							println('sociallivenot present')
							Mobile.pressBack()
										}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)



try {
Mobile.tap(findTestObject('Object Repository/ch'), 0)
			Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\cherry.png')
											
							}
				catch(Exception e) {
								println('cherrry not present')
								Mobile.pressBack()
											}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)


try {
Mobile.tap(findTestObject('Object Repository/pinky'), 0)
				Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Pinky.png')
												
								}
					catch(Exception e) {
									println('Pinky not present')
									Mobile.pressBack()
												}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)


try {
Mobile.tap(findTestObject('Object Repository/lu'), 0)
					Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\lush.png')
													
									}
						catch(Exception e) {
										println('Lush not present')
										Mobile.pressBack()
													}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 790)


try {
Mobile.tap(findTestObject('Object Repository/ka'), 0)
						 Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Kashmir.png')
														
										}
							catch(Exception e) {
											println('kashmir not present')
											Mobile.pressBack()
														}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/tra'), 0)
							Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Tranquil.png')
															
											}
								catch(Exception e) {
												println('Tranquil not present')
												Mobile.pressBack()
															}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/pa'), 0)
								Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\pale wood.png')
																
												}
									catch(Exception e) {
													println('Pale wood  not present')
													Mobile.pressBack()
																}


Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Thread.sleep(1000)


try {
Mobile.tap(findTestObject('Object Repository/green be'), 0)
									Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\greeen beach.png')
																	
													}
										catch(Exception e) {
														println('green beach not present')
														Mobile.pressBack()
																	}
	

Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Thread.sleep(1000)



try {
Mobile.tap(findTestObject('Object Repository/sga'), 0)
									Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Sha la la.png')
																	
													}
										catch(Exception e) {
														println('Sha la lanot present')
														Mobile.pressBack()
																	}
	

Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Thread.sleep(1000)




try {
Mobile.tap(findTestObject('Object Repository/a'), 0)
Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Sha la la.png')
														
}
catch(Exception e) {
	println('Sha la lanot present')
	Mobile.pressBack()														
	}
	
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/pin'), 0)
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Almost.png')
															
	}
	catch(Exception e) {
		println('Almost not present')
		Mobile.pressBack()
		}
Thread.sleep(1000)
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/en'), 0)
		Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\End.png')
																
		}
		catch(Exception e) {
			println('End not present')
			Mobile.pressBack()
			}
Thread.sleep(1000)

Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/pur'), 0)
			Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\purple white.png')
																	
			}
			catch(Exception e) {
				println('purple white not present')
				Mobile.pressBack()
				}

Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/blodddy'), 0)
				Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\bloody.png')
																		
				}
				catch(Exception e) {
					println('bloody not present')
					Mobile.pressBack()
					}

Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 789)
Mobile.swipe(360, 1200, 360, 789)
Mobile.swipe(360, 1200, 360, 789)

try {
Mobile.tap(findTestObject('Object Repository/blue pink'), 0)
Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\Pink.png')
																			
	}
	catch(Exception e) {
						println('Pink not present')
						Mobile.pressBack()
						}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/bourobn'), 0)
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\bourrobn.png')
																				
		}
		catch(Exception e) {
							println('bourrobn.not present')
							Mobile.pressBack()
							}

Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/dusk') ,0)
		Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\dusk.png')
																					
			}
			catch(Exception e) {
								println('dusk not present')
								Mobile.pressBack()
								}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/relay'), 0)
			Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\relay.png')
																						
				}
				catch(Exception e) {
									println('relay not present')
									Mobile.pressBack()
									}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
	Mobile.tap(findTestObject('Object Repository/decent'), 0)
				Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\decent.png')
																							
					}
					catch(Exception e) {
										println('decent not present')
										Mobile.pressBack()
										}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/sweet'), 0)
				Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\sweet.png')
																							
					}
					catch(Exception e) {
										println('sweet not present')
										Mobile.pressBack()
										}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)


try {
Mobile.tap(findTestObject('Object Repository/scooter'), 0)
					Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\scooter.png')
																								
						}
						catch(Exception e) {
											println('scooter not present')
											Mobile.pressBack()
											}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/celes'), 0)
						Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\celes.png')
																									
							}
							catch(Exception e) {
												println('celesr not present')
												Mobile.pressBack()
												}


Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/roya'),0)
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\royals.png')
																										
								}
								catch(Exception e) {
													println('ROYAL not present')
													Mobile.pressBack()
													}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/ed'), 0)
		Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\ED SUNSET GRADIENT.png')
																											
									}
									catch(Exception e) {
														println('ED SUNSET GRADIENT not present')
														Mobile.pressBack()
														}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/peach'), 0)
			Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\PEACH.png')
																												
										}
	catch(Exception e) {
			println('peach not present')
								Mobile.pressBack()
								}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/seablyue'), 0)
Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\sea blue.png')
																													
											}
		catch(Exception e) {
				println('Seablue not present')
									Mobile.pressBack()
									}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/orange'), 0)
	Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\orange.png')
																														
												}
			catch(Exception e) {
					println('Orange not present')
										Mobile.pressBack()
										}
Mobile.tap(findTestObject(clo), 0)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)
Mobile.swipe(360, 1200, 360, 788)

try {
Mobile.tap(findTestObject('Object Repository/aubergine'), 0)
		Mobile.takeScreenshot('C:\\Users\\USER\\Katalon Studio\\Mobile automation projects\\Screenshots\\aubergine.png')
																															
				}
				catch(Exception e) {
						println('Augerbine not present')
											Mobile.pressBack()
											}












Mobile.closeApplication()

