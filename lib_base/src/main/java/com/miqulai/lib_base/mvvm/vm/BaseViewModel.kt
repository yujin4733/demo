package com.miqulai.lib_base.mvvm.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.miqulai.lib_base.mvvm.m.BaseRepository

/**
 * @ClassName:      BaseViewModel
 * @Author:         yujin
 * @CreateDate:     2021/5/10,0010 15:00
 * @Description:     ViewModel 基类
 */
abstract class BaseViewModel:ViewModel() {

    // Loading 状态
    val isLoading = MutableLiveData<Boolean>()

    // 请求异常
    val requestError = MutableLiveData<Throwable?>()

//    protected val mRepository: R by lazy { initRepository() }

//    protected abstract fun initRepository(): R

}