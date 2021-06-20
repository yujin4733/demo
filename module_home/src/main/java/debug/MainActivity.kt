package debug

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import com.miqulai.module_home.R
import com.miqulai.module_home.fragment.HomeFragment


class MainActivity : AppCompatActivity() {

    //    lateinit var navView: SpaceNavigationView
    lateinit var fcvContainer: FragmentContainerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.module_home_activity_main)
        fcvContainer = findViewById(R.id.fcvContainer)
        initView()
    }

    fun initView() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fcvContainer, HomeFragment.newInstance())
            //添加到返回栈中
            addToBackStack(null)
            commit()
        }

    }

}