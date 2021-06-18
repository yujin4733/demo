package com.miqulai.lib_base

import android.app.Application
import android.content.Context


abstract class BaseApplication : Application() {

    companion object {
        lateinit var context: Context
    }


    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        initialize()
    }

    abstract fun initialize()

}