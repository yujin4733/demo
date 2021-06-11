package com.yj.demo.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import java.lang.reflect.ParameterizedType

/**
 * @ClassName:      BaseViewBindingActivity
 * @Author:         yujin
 * @CreateDate:     2021/6/9,0009 16:48
 * @Description:     作用描述
 */
abstract class BaseViewBindingActivity<T: ViewBinding>: AppCompatActivity(){

    protected lateinit var binding:T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val type = javaClass.genericSuperclass
        if(type is ParameterizedType){
            val clazz = type.actualTypeArguments[0] as Class<T>
            val method = clazz.getMethod("inflate",LayoutInflater::class.java)
            binding = method.invoke(null,layoutInflater) as T
            setContentView( binding.root)
        }
        initView()
    }

    abstract fun initView()

}