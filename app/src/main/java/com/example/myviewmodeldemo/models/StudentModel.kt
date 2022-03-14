package com.example.myviewmodeldemo.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//extends
class StudentModel : ViewModel(){
    var id = MutableLiveData<String>()
    var name = MutableLiveData<String>()
}