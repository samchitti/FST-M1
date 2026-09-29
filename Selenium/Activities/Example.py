from selenium import webdriver  # Import webdriver from selenium
from selenium.webdriver.common.by import By  # Import By class from selenium.webdriver.common.by


with webdriver.Firefox() as driver:
    driver.get("https://training-support.net")  # Navigate to the URL
    print("Title of the page",driver.title)  # Print the title of the page #1
    driver.find_element(By.LINK_TEXT, "About Us").click()  # Find the "About Us" button on the page using ID and click it
    print("Title of the new page",driver.title)  # Print the title of the new page #2
    driver.close()  # Close the browser

