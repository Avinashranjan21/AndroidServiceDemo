# Android Service Demo
Android Service Demo


##Started Service Demo

* Android component start the service
* Activity/Broadcast Receiver/Content Provide and Service can start the service by calling startService();
* When the service is started it will run in the background for indefinitely even when the component which has started the service is destroyed.
* Single operation at a time.
* It does not return any value to the caller 
* Call stopSelf() inside the service or stopService() if any component want to stop the service 
* Service run in the main thread
* Life cycle of service
    *  onCreate() --- 
    *  onStartCommand() --- 
    *  onDestroy() ---     

* OnStartCommand return Flag (When android OS kill the service then how to restart service automatically)
    *  START_STICKY --- Service restart automatically but intent is lost<br/>
    ```return super.onStartCommand(intent, flags, startId);``` to ``` return START_STICKY; ```
    *  START_REDELIVER_INTENT --- Service restart automatically and intent is also redelivered<br/>
    ```return super.onStartCommand(intent, flags, startId);``` to ``` return START_REDELIVER_INTENT; ```
    *  START_NOT_STICKY --- Service not restarted automatically and intent is also lost<br/>
    ```return super.onStartCommand(intent, flags, startId);``` to ``` return START_NOT_STICKY; ```

###Part 1:
1. Create a simple service <br/>
``` a simple java class that will extend Service```
2. Two button to start and stop a service.<br/>
``` Start Service and Stop service```
