package com.miqulai.lib_base

import android.app.Application
import android.content.Context
import android.util.Log


open class BaseApplication : Application() {

    companion object {
        lateinit var context: Context
    }


    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        initialize()
    }

    protected  open fun initialize() {

    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
//        MultiDex.install(base)
    }
}