# Smart Irrigation system
Soil Irrigation system provides information about the water moisture status of the soil.
   i.	It helps farmers to maintain soil moisture and health of plants.
   ii.	It helps farmers to understand the actual soil water condition. 
   iii.	It helps in taking decision on when to irrigate and how much water has to be supplied to avoid low quality production.

# Methodolgy
## Problem
In the absence of smart irrigation system, it leads to poor yield and unjustifiable irrigation to crop field. Excessive soil moisture can cause several diseases to the crop and  it also wastes the money and the precious water resources, whereas low watering results in  poor yield. Hence monitoring of soil moisture and irrigating the soil at required time interval is important. 
## Solution
  i.	Monitoring the soil moisture using soil moisture sensor.
  ii.	Deploying ml algorithm for taking decision when to irrigate or when to not.This result in better production of crop and water saving.
  iii.Deploying a mobile application which helps in continuously monitoring the soil mositure status and helps in predicting when to irrigate or when to not irrigate the field. Using this mobile application we can also control the pump to irriagte the system.


# Objectives
1.	To make an Arduino based prototype using NodeMCU ESP8266 board and soil moisture sensor.
2.	To collect data from the sensor for irrigation-based data analysis.
3.	To analyse the collected data and implementation of machine learning algorithms to develope an optimal model 
4.	Implementation of different supervised machine algorithms to develop an optimal data analysis model for taking decision when to irrigate or when to not.
5.  Deploying a mobile application which helps in continuously monitoring the soil mositure status and helps in predicting when to irrigate or when to not irrigate the field. Using this mobile application we can also control the pump to irriagte the system.

# Result
MridaMitra is a mobile Application that takes takes the continuous data from a soil moisture monitoring system. This soil mositure monitoring system uses soil moisture sensors, DHT11 Temperature and Humidity sensor to measure the soil moisture status, surrounding temperature and humidity.
After that this data is sent to the a Server named as "ThingsPeak". The MridaMitra fetches the data from the Thingspeak server and uses inbuilt machine learning model in MridaMitra app to predict whether to irrigate the field or not.
Uisng this mobile application we can control the pump- status for the irrigation of the system. when we ON the pump then it will send data to the soil mositure monitoring system which will start irrigating the field .
