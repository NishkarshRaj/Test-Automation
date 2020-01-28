# Internet Explorer Driver Server

Since Internet Explorer has no inbuilt support for Web Driver interface of Selenium Web Driver or calling via Java API, Selenium created a specialized server called IEDriverServer which is used for communication between Internet Explorer and Selenium Java.

## Download IEDriverServer

Download the Internet Explorer Driver from this [link](8_IEDriverServer/Softwares/IEDriverServer.exe).

## Download compatible Selenium Standalone Server

Download the Selenium Standalone Server from this [link]().

## Launch the Internet Driver Server on a certain port

```
$ IEDriverServer.exe /port=<<port number>> /log-level=DEBUG
```

## Write your Java code in Selenium Java project

Refer the following [code](8_IEDriverServer/IEConnection.java).
