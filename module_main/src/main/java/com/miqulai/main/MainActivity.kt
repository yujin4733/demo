package com.miqulai.main

import android.graphics.Color
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.miqulai.bottomnav.SpaceItem
import com.miqulai.bottomnav.SpaceOnClickListener
import com.miqulai.common.ext.loadFragments
import com.miqulai.common.route.RouterPath
import com.miqulai.main.databinding.ModuleMainActivityMainBinding
import com.miqulai.main.fragment.generateFragments
import com.yj.demo.base.BaseViewBindingActivity

@Route(path = RouterPath.Main.A_MAIN)
class MainActivity : BaseViewBindingActivity<ModuleMainActivityMainBinding>() {

    private lateinit var fragmentsMap: Map<Int, Fragment>


    override fun initView() {
        binding.navView.addSpaceItem(SpaceItem("首页", R.drawable.bottom_menu_home))
        binding.navView.addSpaceItem(SpaceItem("消息", R.drawable.bottom_menu_project))
        binding.navView.addSpaceItem(SpaceItem("探索", R.drawable.bottom_menu_system))
        binding.navView.addSpaceItem(SpaceItem("我的", R.drawable.bottom_menu_mine))
//        navView.setCentreButtonIconColorFilterEnabled(false)
        binding.navView.shouldShowFullBadgeText(true);
        binding.fcvContainer.setOnClickListener {
            binding.navView.showBadgeAtIndex(0, 2, Color.RED);
            binding.navView.showBadgeAtIndex(1, 3, Color.DKGRAY);
            binding.navView.showBadgeAtIndex(2, 4, Color.MAGENTA);
            binding.navView.showBadgeAtIndex(3, 23, Color.BLUE);
        }

        binding.navView.setSpaceOnClickListener(object : SpaceOnClickListener {
            override fun onCentreButtonClick() {
//                showToast("onCentreButtonClick")
            }

            override fun onItemClick(itemIndex: Int, itemName: String) {
//                showHideFragment(fragmentsMap.getValue(itemIndex))
            }

            override fun onItemReselected(itemIndex: Int, itemName: String) {}
        })

//        mBinding.navView.setSpaceOnLongClickListener(object : SpaceOnLongClickListener {
//            override fun onCentreButtonLongClick() {
//                ARouter.getInstance().build("/action/MainActivity2").navigation()
//            }
//
//            override fun onItemLongClick(itemIndex: Int, itemName: String?) {
////                showToast("onItemLongClick")
//            }
//
//        })
        fragmentsMap = generateFragments()
        loadFragments(R.id.fcvContainer,0,*fragmentsMap.values.toTypedArray())
    }

}