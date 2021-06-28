# Automation

1. To do the Selenium Automation Testing first, we need to install JAVA. Both Java Development Kit & Java Runtime Environment. After that, set up Java Environment using our System Properties - Advanced - Environment Variables. Set up Java Home & PATH. After that check, our environment is ready or not. Go to the cmd & type ( java -version ) & ( javac -version )  

2. Second, we need to install apache-maven. Set up Maven Home & PATH. Check our environment is ready or not. Go to the cmd & type ( mvn -version ) 

3. After That, we need to download Eclipse IDE for Java Developers.

4. Now Download TestNG using Help - Install New Software. Then verify TestNG Install using Windows - Show View - Other - Java - TestNG.

5. Create AutomationPractice Project using File - Other - Maven Project (org.apache.maven.archetypes) (maven-archetype-quickstart)

6. Update our Dependency into the pom.xml file.

7. Download our Driver. Example ChromeDriver.exe (must be equal into your browser)

8. Install SelectorsHub for easy & perfect Xpath.

9. Import AutomationPractice Project - > TestNg.xml -> Run As -> TestNG Suite

10. You Can Also See The Output Results & Report In The test-output Folder.


# Question

Use Selenium WebDriver with java to Automate the following scenarios:
1. Visit the given URL: http://automationpractice.com/index.php
2. Register with two unique users providing all the mandatory and optional fields.
3. Add to cart two different items and complete the checkout process.
4. Complete payment method for the above items (dresses).
5. Add at least 2 verifications and validations.
