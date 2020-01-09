# Steps to install ChromeDriver to interface Java Program in an IDE with Web Browser using Selenium

## Pre-Requisites

1. Java JDK 1.8 or above
2. Eclipse IDE
3. Selenium Java [3.14](1_ChromeDriverInstallation/Software/Selenium%20Java%203.14) or above
4. Google Chrome Web Browser
5. Google [ChromeDriver](1_ChromeDriverInstallation/Software/chromedriver.exe)

## Steps

1. Open Eclipse for Java
2. File -> New -> Java Project

* Set any name.
* Use Java 1.8 or above version
* Do not create module-java.info file

3. Create a Java Class in package name same as project name

4. Right click on project name -> Build Path -> Configure Build Path

5. Go to libraries tab -> Click on Classpath -> Add External Jar

6. Add all 7 jar files present in Selenium Java package

7. Apply and Close

8. Copy the Code for [Chrome Driver](1_ChromeDriverInstallation/ChromeTC.java)

9. Run the Code
