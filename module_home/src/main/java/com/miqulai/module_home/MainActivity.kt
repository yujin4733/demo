package com.miqulai.module_home

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.miqulai.bottomnav.SpaceItem
import com.miqulai.bottomnav.SpaceNavigationView
import com.miqulai.bottomnav.SpaceOnClickListener
import com.miqulai.bottomnav.SpaceOnLongClickListener


class MainActivity : AppCompatActivity() {

    lateinit var navView: SpaceNavigationView
    lateinit var fcvContainer: FragmentContainerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module_home_activity_main)
        navView = findViewById(R.id.navView)
        fcvContainer = findViewById(R.id.fcvContainer)
        initView()
    }

    fun initView() {
        navView.addSpaceItem(SpaceItem("首页", R.mipmap.bottom_menu_home))
        navView.addSpaceItem(SpaceItem("消息", R.mipmap.bottom_menu_project))
        navView.addSpaceItem(SpaceItem("探索", R.mipmap.bottom_menu_system))
        navView.addSpaceItem(SpaceItem("我的", R.mipmap.bottom_menu_mine))
//        navView.setCentreButtonIconColorFilterEnabled(false)
        navView.shouldShowFullBadgeText(true);
        fcvContainer.setOnClickListener {
            navView.showBadgeAtIndex(0, 2, Color.RED);
            navView.showBadgeAtIndex(1, 3, Color.DKGRAY);
            navView.showBadgeAtIndex(2, 4, Color.MAGENTA);
            navView.showBadgeAtIndex(3, 23, Color.BLUE);
        }

        navView.setSpaceOnClickListener(object : SpaceOnClickListener {
            override fun onCentreButtonClick() {
//                showToast("onCentreButtonClick")
            }


            override fun onItemClick(itemIndex: Int, itemName: String) {
//                showHideFragment(fragmentsMap.getValue(itemIndex))
            }

            override fun onItemReselected(itemIndex: Int, itemName: String) {}
        })

        navView.setSpaceOnLongClickListener(object : SpaceOnLongClickListener {
            override fun onCentreButtonLongClick() {
//                ARouter.getInstance().build("/action/MainActivity2").navigation()
            }

            override fun onItemLongClick(itemIndex: Int, itemName: String?) {
//                showToast("onItemLongClick")
            }

        })
//        fragmentsMap = generateFragments()
//        loadFragments(R.id.fcvContainer,0,*fragmentsMap.values.toTypedArray())


    }

}