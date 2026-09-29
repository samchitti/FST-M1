from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Edge() as driver:
    driver.get("https://training-support.net")
    #driver.manage().window().maximize()  
    print(f"Title of page is: {driver.title}")
    
    #driver.quit()