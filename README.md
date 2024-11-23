# **ADs IMPLEMENTATION - ANDROID**  
This Android application demonstrates the implementation of various types of Google AdMob ads. The app consists of five buttons, each triggering a specific type of ad using AdMob's test ad IDs.

---

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
![Main Screen](https://github.com/Alenaak/Ads-Implementation-Android/blob/main/images/Main%20Screen.png)

### Banner Ad  
![Banner Ad](https://github.com/Alenaak/Ads-Implementation-Android/blob/main/images/banner2.png)

### Interstitial Ad  
![Interstitial Ad](https://github.com/Alenaak/Ads-Implementation-Android/blob/main/images/interstitialad.png)

### Rewarded Ad  
![Rewarded Ad](https://github.com/Alenaak/Ads-Implementation-Android/blob/main/images/rewardedad.png)

### Rewarded Interstitial Ad  
![Rewarded Interstitial Ad](https://github.com/Alenaak/Ads-Implementation-Android/blob/main/images/rewardedinterstitial.png)

### Native Ad  
![Native Ad](https://github.com/Alenaak/Ads-Implementation-Android/blob/main/images/native%20ad.png)

---

## **How It Works**  
Each button on the main screen triggers an ad. Here's the breakdown:  

- **Button 1: Banner Ad**  
  On clicking, the app displays a test banner ad at the bottom of the screen.  

- **Button 2: Interstitial Ad**  
  On clicking, the app loads and shows an interstitial ad at an appropriate point.  

- **Button 3: Rewarded Ad**  
  On clicking, the app displays a rewarded ad and grants a reward after successful completion.  

- **Button 4: Rewarded Interstitial Ad**  
  On clicking, the app shows a rewarded interstitial ad, offering rewards while maintaining the interstitial experience.  

- **Button 5: Native Ad**  
  On clicking, the app displays a native ad that blends into the app’s UI.  

---

## **Dependencies**  
Add the following dependency to your `build.gradle` file:

```groovy
dependencies {
    implementation 'com.google.android.gms:play-services-ads:22.0.0' // Update to the latest version
}
