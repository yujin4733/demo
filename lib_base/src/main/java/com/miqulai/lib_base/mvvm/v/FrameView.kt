package com.miqulai.lib_base.mvvm.v

import androidx.viewbinding.ViewBinding

/**
 * @ClassName:      FrameView
 * @Author:         yujin
 * @CreateDate:     2021/5/7,0007 11:15
 * @Description:     作用描述
 */
interface FrameView<VB : ViewBinding> {

    /**
     * 初始化View
     */
    fun VB.initView()

    /**
     * 初始化LiveData的订阅关系
     */
//    fun initLiveDataObserve()

    /**
     * 初始化界面创建时的数据请求
     */
    fun initData()
}