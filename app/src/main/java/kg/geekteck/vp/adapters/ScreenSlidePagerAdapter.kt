package kg.geekteck.vp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kg.geekteck.vp.NUM_PAGES
import kg.geekteck.vp.ui.First
import kg.geekteck.vp.ui.Second
import kg.geekteck.vp.ui.Third

class ScreenSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = NUM_PAGES


    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                First()
            }
            1 -> {
                Second()
            }
            else -> {
                Third()
            }
        }
    }
}