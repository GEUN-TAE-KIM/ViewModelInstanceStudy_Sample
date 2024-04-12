package kr.rmsxo.viewmodelinstance.ui.another

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kr.rmsxo.viewmodelinstance.R
import kr.rmsxo.viewmodelinstance.databinding.FragmentAnotherBinding
import kr.rmsxo.viewmodelinstance.databinding.FragmentHome2Binding
import kr.rmsxo.viewmodelinstance.ui.InViewModel
import kr.rmsxo.viewmodelinstance.util.BaseFragment

class AnotherFragment : BaseFragment<FragmentAnotherBinding>(R.layout.fragment_another) {

    private lateinit var viewModel: InViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(InViewModel::class.java)

        viewModel.data.observe(viewLifecycleOwner) { data ->
            binding.textView.text = data
        }
    }

}