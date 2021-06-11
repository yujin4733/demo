package com.miqulai.lib_base.mvvm.m

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

/**
 * @ClassName:      BaseRepository
 * @Author:         yujin
 * @CreateDate:     2021/5/10,0010 14:42
 * @Description:     仓库层 Repository 基类
 */
open class BaseRepository {

    /**
     * 发起请求封装
     * @param requestBlock 请求的整体逻辑
     * @return Flow<T>
     */
    protected fun <T> flowRequest(requestBlock: suspend FlowCollector<T>.() -> Unit) =
        flow(block = requestBlock).flowOn(Dispatchers.IO)     // 通过 flowOn 切换到 io 线程

}