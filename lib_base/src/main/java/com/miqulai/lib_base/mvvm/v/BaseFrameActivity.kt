package com.miqulai.lib_base.mvvm.v

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import java.lang.reflect.ParameterizedType

/**
 * Activity基类
 */
abstract class BaseFrameActivity<VM : ViewModel, VB : ViewBinding> : AppCompatActivity(),
    FrameView<VB> {


    /**
     * 属性委托 by lazy 第一次使用时才初始化对象
     * 初始化将总是发生在与属性使用位于相同的线程，使用LazyThreadSafetyMode.NONE减少开销，
     * lazy 默认为线程安全模式LazyThreadSafetyMode.SYNCHRONIZED，
     */
    protected val mBinding: VB by lazy(mode = LazyThreadSafetyMode.NONE) {
        val vbClass: Class<VB> =
            (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<VB>
        val inflate = vbClass.getDeclaredMethod("inflate", LayoutInflater::class.java)
        inflate.invoke(null, layoutInflater) as VB
    }

    protected val mViewModel: VM by lazy(mode = LazyThreadSafetyMode.NONE) {
        val vmClass: Class<VM> =
            (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[1] as Class<VM>
        ViewModelProvider(this).get(vmClass)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)


    }

}