package com.miqulai.common.route

/**
 * @ClassName:      RouteConstants
 * @Author:         yujin
 * @CreateDate:     2021/6/16,0016 12:51
 * @Description:     作用描述
 */
class RouterPath {

    object Main {
        const val A_TEST = "/main/SplashActivity"
        const val A_MAIN = "/main/MainActivity"
        const val F_MESSAGE = "/main/HomeFragment"
        const val F_QR_SCAN = "/main/QRScanFragment"
    }

    object Home {
        const val F_HOME = "/home/HomeFragment"

    }
    object Message {
        const val F_MESSAGE = "/message/MessageFragment"

    }

    object Dynamic {
        const val F_DYNAMIC = "/dynamic/DynamicFragment"

    }

    object Mine {

        const val F_MINE = "/mine/MineFragment"
    }

    object Web {
        const val F_WEB = "/web/WebFragment"
    }

}