package kg.geekteck.vp

import androidx.lifecycle.MutableLiveData
import kg.geekteck.vp.bases.BaseViewModel


class MainViewModel: BaseViewModel(){
    private var mCount = 0
    private var mList= arrayListOf<Int>()

    val counter = MutableLiveData<Int>()
    val list = MutableLiveData<List<Int>>()

    fun onIncrementClick(){
        mCount++
        counter.value=mCount
        mList.add(mCount)
        list.value=mList
    }
    fun onDecrementClick(){
        mCount--
        counter.value=mCount
        mList.add(mCount)
        list.value=mList
    }
}