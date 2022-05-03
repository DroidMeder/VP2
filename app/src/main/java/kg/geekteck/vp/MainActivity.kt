package kg.geekteck.vp

import android.view.LayoutInflater
import kg.geekteck.vp.adapters.ScreenSlidePagerAdapter
import kg.geekteck.vp.bases.BaseActivity
import kg.geekteck.vp.databinding.ActivityMainBinding

const val NUM_PAGES = 3

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun initView() {
        super.initView()
        val pagerAdapter = ScreenSlidePagerAdapter(this)
        binding.pager.adapter = pagerAdapter
    }

    override fun inflateViewBinding(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun onBackPressed() = with(binding){
        if (pager.currentItem == 0) {
            super.onBackPressed()
        } else {
            pager.currentItem = pager.currentItem - 1
        }
    }
}