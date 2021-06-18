package com.miqulai.common

import com.alibaba.android.arouter.launcher.ARouter
import com.miqulai.lib_base.BaseApplication
import com.miqulai.lib_base.BuildConfig

/**
 * @ClassName:      commonApplication
 * @Author:         yujin
 * @CreateDate:     2021/6/17,0017 9:12
 * @Description:     作用描述
 */
open class CommonApplication :BaseApplication() {

    override fun initialize() {
        if(BuildConfig.DEBUG){
            ARouter.openDebug()
            ARouter.openLog()
        }
        ARouter.init(this)
    }

}