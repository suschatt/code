'''
	This program will scrap the flight prices
	Author : Susmit Chatterjee
'''

from selenium import webdriver
import time

driver = webdriver.Chrome(r'C:\Users\susmi\Documents\Code\code\python\practice_sandbox\seleniumDriver\chromedriver.exe')
driver.get('https://www.google.com/flights?hl=en');
#Click on the passengers button
driver.find_element_by_xpath('//*[@id="flt-pax-button"]').click()
time.sleep(5)
driver.quit()