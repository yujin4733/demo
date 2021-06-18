package com.miqulai.mine.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.miqulai.common.route.RouterPath
import com.miqulai.mine.R


/**
 * A simple [Fragment] subclass.
 * Use the [MineFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@Route(path = RouterPath.Mine.F_MINE)
class MineFragment : Fragment() {
    companion object {
        fun newInstance() = MineFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.module_mine_fragment_mine, container, false)
    }


}