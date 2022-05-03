package kg.geekteck.vp.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import kg.geekteck.vp.MainViewModel
import kg.geekteck.vp.bases.BaseFragment
import kg.geekteck.vp.databinding.FragmentSecondBinding

class Second : BaseFragment<FragmentSecondBinding, MainViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel=ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(inflater)
    }

    override fun initViewModel() {
        super.initViewModel()
        viewModel.counter.observe(viewLifecycleOwner){
            binding.tvCounter.text=it.toString()
        }
    }
}