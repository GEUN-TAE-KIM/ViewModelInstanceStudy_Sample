package kr.rmsxo.viewmodelinstance.ui.other_sam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kr.rmsxo.viewmodelinstance.R
import kr.rmsxo.viewmodelinstance.databinding.FragmentOther2Binding
import kr.rmsxo.viewmodelinstance.databinding.FragmentOtherBinding
import kr.rmsxo.viewmodelinstance.ui.InViewModel
import kr.rmsxo.viewmodelinstance.util.BaseFragment


class OtherFragment2  : BaseFragment<FragmentOther2Binding>(R.layout.fragment_other2) {

    private lateinit var viewModel: InViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(InViewModel::class.java)

        viewModel.data2.observe(viewLifecycleOwner) { text ->
            binding.textView.text = text
        }

        binding.button.setOnClickListener {
            val text = binding.textView.text.toString()
            viewModel.function2(text)
        }

    }

}