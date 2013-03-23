DOMLauncher
===========

Cordova Powered Android App Launcher Replacement. 

This is a Beta 0.9.8.  

Before going any further understand a couple key points:

1.  This is free for all to use as they please EXCEPT, make a competing Cordova/Phonegap Based launcher with this code that is not also open and free or for commerical profit gain.  Everything else, just credit me.  I retain all ownership of the project and code but happy to share!  If you really want, I'd love to see what others use this stuff for so drop me a line!

2.  I created this for myself.  I am namely a Front End Developer, not an app developer or native programmer.  My motto for UIs is:  No room with a handful of people in it can create the UI that is perfect for me.  Only I can do that. 

3.  This is a luxury launcher replacement.  I only offically support Android 4.0+ but the app CAN work down to version 2.3 if one compiles for themselves and removes the 'Missed Communications' plugin and remove come of the settings options from the 'Launch' plugin.

4. Average memory load is around 40 meg. 

5.  The 'DOMMod'-what a user loads for a custom UI, loads off your SDCARD. Many newer devices allow the internal memory to be the 'sdcard/sdcard0' and the physical card is sdcardext.  A device that doesn't not do this, the app instead references the external sdcard.  The key factor to remember when a device only has the external sdcard:  The App Will Not Load The DOMMod When The SDCARD IS MOUNTED AND UNREADABLE BY THE DEVICE.  This only matters if the app restarts or if a DOMMod uses live media from the storage space.  I have in place a 'dummy' DOMMod that is one page and can access the very basics and launch the installed apps. This is baked into the app as a last ditch backup so something always loads.

If one can handle these things, you have in your hands the ability to create ANY USER INTERFACE you want for your Launcher.  It is all HTML/CSS and some simple javascript if one want to dive into that.  Anything that you can imagine, you can create with the only real limitation is the hardware of the device and the webkit view.

Personally, I love LCARS.



Instructions:

Compile with Eclipse and intall on the device.

The DOMLauncher folder within the SD CARD folder, just copy to your sdcard. 



DEVELOPERS:

The app itself is not extensive.  The 'bulk' of the app comes from the custom DOMMods that I, you or others will create.  I have written a collection of additional Cordova API Plugins to make this app function, the rest is just HTML/CSS/JS.

These additional plugins include:

Airplane Toggle
App List-App Icon Generator-App Icon CSS File
Cellular Signal
FullScreen Toggle
App-Activity/Settings Launcher
Missed Communications (Missed calls/Unread sms)
Mobile Data Controls
Screenbrightness Controls
Volume Controls (Media & Ringer)
Wifi Controls - includes a Wifi Signal feature
Simple Save - save basic text based files to the file system.
Bluetooth Controls

Many of these plugins are commonly asked for things for the Cordova Library or use in a native application.  Since my background is not in Java, I am looking for people that would like to optimize and tweak the Cordova Plugins since they are not perfect and fully useable outside DOMLauncher!

Each comes with a nice javascript wrapper for easy use!

DOMLauncher is missing two main features of a native launcher:

Native Widgets - By research could be done via canvas to render and a way to pass back events to the right activity listener.

Add Shortcut to desktop from application - Have plugin code provided by an awesome person but needs to be finished.

If anyone wants to contribute!  Go right ahead!

-Aricwithana
