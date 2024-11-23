# **ADs IMPLEMENTATION - ANDROID**  
This Android application demonstrates the implementation of various types of Google AdMob ads. The app consists of five buttons, each triggering a specific type of ad using AdMob's test ad IDs.

---
### **Note:**

This project uses test AdMob IDs. For production purposes, generate your own AdMob IDs by visiting the AdMob console.

## **Features**  
The app showcases the following types of ads:  

1. **Banner Ad**  
   - A rectangular ad displayed at the top or bottom of the screen.  
2. **Interstitial Ad**  
   - A full-screen ad displayed at natural transition points in the app.  
3. **Rewarded Ad**  
   - An ad that rewards users with in-app items for watching it completely.  
4. **Rewarded Interstitial Ad**  
   - Combines the interstitial ad's full-screen format with the rewarded ad's benefits.  
5. **Native Ad**  
   - An ad that matches the app's look and feel, blending seamlessly into the UI.  

---

## **Screenshots**  

### Main Screen  
<img src="https://github.com/Alenaak/Ads-Implementation-Android/blob/main/images/Main%20Screen.png" alt="Main Screen" width="400" />

### Banner Ad  
<img src="https://github.com/Alenaak/Ads-Implementation-Android/blob/main/images/banner2.png" alt="Banner Ad" width="400"/>

### Interstitial Ad  
<img src="https://github.com/Alenaak/Ads-Implementation-Android/blob/main/images/interstitialad.png" alt="Interstitial Ad" width="400"/>

### Rewarded Ad  
<img src="https://github.com/Alenaak/Ads-Implementation-Android/blob/main/images/rewardedad.png" alt="Rewarded Ad" width="400" />

### Rewarded Interstitial Ad  
<img src="https://github.com/Alenaak/Ads-Implementation-Android/blob/main/images/rewardedinterstitial.png" alt="Rewarded Interstitial Ad" width="400" />

### Native Ad  
<img src="https://github.com/Alenaak/Ads-Implementation-Android/blob/main/images/native%20ad.png" alt="Native Ad" width="400" />

---




## **Dependencies**  
Add the following dependency to your `build.gradle` file:

```groovy
dependencies {
    implementation 'com.google.android.gms:play-services-ads:22.0.0' // Update to the latest version
}
```

## **Setup Instructions**
1. Clone the repository:  
   ```bash
   git clone https://github.com/yourusername/Ads-Implementation-Android.git
   ```
2.Open the project in Android Studio.

3.Add your AdMob App ID to the AndroidManifest.xml:
 ```bash
<application>
    <meta-data
        android:name="com.google.android.gms.ads.APPLICATION_ID"
        android:value="ca-app-pub-3940256099942544~3347511713"/> <!-- Test App ID used here -->
</application>
   ```      
4.For each ad, provide the respective unit ID. You can replace the test unit IDs with your own production unit IDs when setting up the ads in the app.
5.Build and run the application on a physical device or emulator.


## **Contact** 
If you have any questions or suggestions, feel free to open an issue or contact me directly.







