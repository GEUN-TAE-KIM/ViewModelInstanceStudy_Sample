package kr.rmsxo.viewmodelinstance.ui.sam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kr.rmsxo.viewmodelinstance.R
import kr.rmsxo.viewmodelinstance.databinding.FragmentHomeBinding
import kr.rmsxo.viewmodelinstance.databinding.FragmentSamBinding
import kr.rmsxo.viewmodelinstance.ui.InViewModel
import kr.rmsxo.viewmodelinstance.util.BaseFragment

class SamFragment : BaseFragment<FragmentSamBinding>(R.layout.fragment_sam) {

    private lateinit var viewModel: InViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(InViewModel::class.java)

        viewModel.data.observe(viewLifecycleOwner) { data ->
            binding.textView.text = data
        }
    }

}