package kr.rmsxo.viewmodelinstance.ui.sam

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kr.rmsxo.viewmodelinstance.R
import kr.rmsxo.viewmodelinstance.databinding.FragmentHomeBinding
import kr.rmsxo.viewmodelinstance.ui.InViewModel
import kr.rmsxo.viewmodelinstance.util.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    private lateinit var viewModel: InViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(InViewModel::class.java)

        binding.button.setOnClickListener {
            val data = binding.editText.text.toString()
            viewModel.updateData(data)
        }

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_nav_sam)
        }
    }

}