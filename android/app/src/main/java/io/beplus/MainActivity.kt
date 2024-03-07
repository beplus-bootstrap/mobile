package io.beplus

import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.fabricEnabled
import com.facebook.react.defaults.DefaultReactActivityDelegate

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log

class MainActivity : ReactActivity() {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  override fun getMainComponentName(): String = "beplus"

  /**
   * Returns the instance of the [ReactActivityDelegate]. We use [DefaultReactActivityDelegate]
   * which allows you to enable New Architecture with a single boolean flags [fabricEnabled]
   */
  override fun createReactActivityDelegate(): ReactActivityDelegate =
      DefaultReactActivityDelegate(this, mainComponentName, fabricEnabled)

  /**
   * react-native-config
   */
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    // val varInJava: String = BuildConfig.BE_VAR_IN_JAVA
    // Log.i("RNConfig_Java: ", varInJava)

    // try {
    //   val app = packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA)
    //   Log.i("RNConfig_Manifest: ", ""+app.metaData.getString("varInManifest"))
    // } catch (e: PackageManager.NameNotFoundException) {
    //   e.printStackTrace()
    // }
  }
}
