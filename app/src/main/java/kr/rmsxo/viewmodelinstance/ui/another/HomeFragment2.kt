package kr.rmsxo.viewmodelinstance.ui.another

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kr.rmsxo.viewmodelinstance.R
import kr.rmsxo.viewmodelinstance.databinding.FragmentHome2Binding
import kr.rmsxo.viewmodelinstance.databinding.FragmentHomeBinding
import kr.rmsxo.viewmodelinstance.ui.InViewModel
import kr.rmsxo.viewmodelinstance.util.BaseFragment

class HomeFragment2 : BaseFragment<FragmentHome2Binding>(R.layout.fragment_home2) {

    private lateinit var viewModel: InViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(InViewModel::class.java)

        binding.button.setOnClickListener {
            val data = binding.editText.text.toString()
            viewModel.updateData(data)
        }

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home2_to_nav_another)
        }
    }

}