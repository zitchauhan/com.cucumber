package snippet;

public class Snippet {
	<?xml version = "1.0" encoding = "UTF-8"?>
	<!DOCTYPE log4j:configuration SYSTEM "log4j.dtd">
	<log4j:configuration xmlns:log4j = "http://jakarta.apache.org/log4j/" debug = "false">
	
	   <appender name = "fileAppender" class = "org.apache.log4j.FileAppender">
	      <param name = "Threshold" value = "INFO" />
	      <param name = "File" value = "percent_calculator.log"/>
	      
	      <layout class = "org.apache.log4j.PatternLayout">
	         <param name = "ConversionPattern"
	            value = "%d{yyyy-MM-dd HH:mm:ss}  [%c] (%t:%x) %m%n" />
	      </layout>
	   </appender>
	
	   <root>
	      <level value = "INFO"/>
	      <appender-ref ref = "fileAppender"/>
	   </root>
	   
	</log4j:configuration>
}

