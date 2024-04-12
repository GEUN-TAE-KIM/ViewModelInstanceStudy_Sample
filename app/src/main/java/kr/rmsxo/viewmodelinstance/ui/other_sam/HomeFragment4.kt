package kr.rmsxo.viewmodelinstance.ui.other_sam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kr.rmsxo.viewmodelinstance.R
import kr.rmsxo.viewmodelinstance.databinding.FragmentHome3Binding
import kr.rmsxo.viewmodelinstance.databinding.FragmentHome4Binding
import kr.rmsxo.viewmodelinstance.ui.InViewModel
import kr.rmsxo.viewmodelinstance.util.BaseFragment


class HomeFragment4  : BaseFragment<FragmentHome4Binding>(R.layout.fragment_home4) {

    private lateinit var viewModel: InViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(InViewModel::class.java)

        // 데이터 바인딩 객체와 뷰 모델 연결
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.button.setOnClickListener {
            viewModel.function1(binding.editText.text.toString())
        }

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home4_to_nav_other2)
        }
    }

}