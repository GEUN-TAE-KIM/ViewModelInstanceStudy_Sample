package kr.rmsxo.viewmodelinstance.ui.other

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kr.rmsxo.viewmodelinstance.R
import kr.rmsxo.viewmodelinstance.databinding.FragmentHome3Binding
import kr.rmsxo.viewmodelinstance.ui.InViewModel
import kr.rmsxo.viewmodelinstance.util.BaseFragment

class HomeFragment3 : BaseFragment<FragmentHome3Binding>(R.layout.fragment_home3) {

    private lateinit var viewModel: InViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(InViewModel::class.java)

        binding.button.setOnClickListener {
           viewModel.function1(binding.editText.text.toString())
        }

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home3_to_nav_other)
        }
    }

}