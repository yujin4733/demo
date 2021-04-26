package com.miqulai.lib_base

import android.app.Application
import android.util.Log

//1.top-level
//private const val TAG = "BaseApplication"

open class BaseApplication:Application() {
 // 2   a companion object one of the two options you can apply:
    companion object{
          private const val TAG = "BaseApplication"
    }

    override fun onCreate() {
        super.onCreate()
        Log.e(TAG, "onCreate: ", )
    }
}