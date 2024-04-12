package kr.rmsxo.viewmodelinstance.ui.other

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import kr.rmsxo.viewmodelinstance.R
import kr.rmsxo.viewmodelinstance.databinding.FragmentOtherBinding
import kr.rmsxo.viewmodelinstance.ui.InViewModel
import kr.rmsxo.viewmodelinstance.util.BaseFragment

class OtherFragment : BaseFragment<FragmentOtherBinding>(R.layout.fragment_other) {

    private lateinit var viewModel: InViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(InViewModel::class.java)

        viewModel.data2.observe(viewLifecycleOwner) { text ->
            binding.textView.text = text
        }

        binding.button.setOnClickListener {
            val text = binding.textView.text.toString()
            viewModel.function2(text)
        }

    }

}