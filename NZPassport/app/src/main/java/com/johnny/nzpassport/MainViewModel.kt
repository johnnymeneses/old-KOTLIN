package com.johnny.nzpassport

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    private var txtWelcome = MutableLiveData<String>()
    private var infoPerson = MutableLiveData<Boolean>()
    private val personRepository = PersonRepository()

    init{
        txtWelcome.value = "Passport, please"
    }

    fun welcome(): LiveData<String>{
        return txtWelcome
    }


    fun enterCountry(): LiveData<Boolean>{

        return infoPerson
    }

    fun getInfo(firstName: String, lastName: String){

        infoPerson.value = personRepository.infoPerson(firstName,lastName)
    }


}


