package kr.rmsxo.viewmodelinstance.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InViewModel : ViewModel() {

    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    private val _data2 = MutableLiveData<String>()
    val data2: LiveData<String> = _data2

    fun updateData(newData: String) {
        _data.value = newData
    }

    fun function1(text: String) {
        _data2.value = text
        Log.d("sdsd", "function1: ${_data2.value}")
    }

    fun function2(text: String) {
        _data2.value = text
        Log.d("sdsd", "function2: ${_data2.value}")
    }
}