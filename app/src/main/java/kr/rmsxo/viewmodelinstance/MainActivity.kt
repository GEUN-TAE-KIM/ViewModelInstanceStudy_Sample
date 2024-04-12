package kr.rmsxo.viewmodelinstance

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import kr.rmsxo.viewmodelinstance.databinding.ActivityMainBinding
import kr.rmsxo.viewmodelinstance.util.BindingActivity

class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navController =
            supportFragmentManager.findFragmentById(R.id.container_main)?.findNavController()
        navController?.let {
            binding.navigationMain.setupWithNavController(it)
        }

    }

}