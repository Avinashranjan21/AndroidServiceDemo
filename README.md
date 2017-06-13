# AndroidServiceDemo
Android Service Demo


##Started Service Demo

* Android component start the service
* Activity/Broadcast Receiver/Content Provide and Service can start the service by calling startService();
* When the service is started it will run in the background for indefinitely even when the component which has started the service is destroyed.
* Single operation at a time.
* It does not return any value to the caller 
* Call stopSelf() inside the service or stopService() if any component want to stop the service 


###Part 1:
1. Create a simple service <br/>
``` a simple java class that will extend Service```
2. Two button to start and stop a service.<br/>
``` Start Service and Stop service```
