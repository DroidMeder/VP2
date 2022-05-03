package kg.geekteck.vp.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import kg.geekteck.vp.MainViewModel
import kg.geekteck.vp.bases.BaseFragment
import kg.geekteck.vp.databinding.FragmentFirstBinding

class First : BaseFragment<FragmentFirstBinding, MainViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel=ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(inflater)
    }

    override fun initListener() = with(binding){
        super.initListener()

        btnInc.setOnClickListener{
            viewModel.onIncrementClick()
        }

        btnDec.setOnClickListener{
            viewModel.onDecrementClick()
        }
    }
}