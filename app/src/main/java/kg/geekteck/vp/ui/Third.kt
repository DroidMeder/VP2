package kg.geekteck.vp.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import kg.geekteck.vp.MainViewModel
import kg.geekteck.vp.adapters.HistoryAdapter
import kg.geekteck.vp.bases.BaseFragment
import kg.geekteck.vp.databinding.FragmentThirdBinding

class Third: BaseFragment<FragmentThirdBinding, MainViewModel>() {
    private var list= arrayListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel=ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentThirdBinding {
        return FragmentThirdBinding.inflate(inflater)
    }

    override fun initViewModel() = with(binding){
        super.initViewModel()
        viewModel.list.observe(viewLifecycleOwner){
            list= it as ArrayList<Int>
            rec.layoutManager = LinearLayoutManager(requireContext())
            rec.adapter = HistoryAdapter(list)
        }
    }
}