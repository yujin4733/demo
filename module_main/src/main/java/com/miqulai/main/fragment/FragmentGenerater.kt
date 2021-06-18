package com.miqulai.main.fragment

import androidx.fragment.app.Fragment
import com.miqulai.common.route.Router
import com.miqulai.common.route.RouterPath

/**
 * @ClassName:      FragmentGenerater
 * @Author:         yujin
 * @CreateDate:     2021/6/16,0016 15:20
 * @Description:     作用描述
 */
const val HOME_FRAGMENT = 0
const val MESSAGE_FRAGMENT = 1
const val DYNAMIC_FRAGMENT = 2
const val MINE_FRAGMENT = 3

/**
 * 获取AFragment、BFragment、CFragment
 */
fun generateFragments() = mapOf<Int, Fragment>(
    HOME_FRAGMENT to Router.navigate(RouterPath.Home.F_HOME) as Fragment,
    MINE_FRAGMENT to Router.navigate(RouterPath.Mine.F_MINE) as Fragment

//    MESSAGE_FRAGMENT to Router.navigate(RouterPath.Mine.F_MINE) as Fragment,
//    DYNAMIC_FRAGMENT to Router.navigate(RouterPath.Home.F_HOME) as Fragment,
//    HOME_FRAGMENT to  Router.navigate(RouterPath.Home.F_HOME) as Fragment,
//    MESSAGE_FRAGMENT to  Router.navigate(RouterPath.Message.F_MESSAGE) as Fragment,
//    DYNAMIC_FRAGMENT to  Router.navigate(RouterPath.Dynamic.F_DYNAMIC) as Fragment,
//    MAIN_FRAGMENT to  Router.navigate(RouterPath.Mine.F_MINE) as Fragment,
)
