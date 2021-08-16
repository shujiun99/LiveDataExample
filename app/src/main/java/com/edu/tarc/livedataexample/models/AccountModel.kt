package com.edu.tarc.livedataexample.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AccountModel(accNo:String, owner:String, balance:Double) : ViewModel(){
    var accNo : String = ""
    var owner : String = ""
    private val _balance = MutableLiveData<Double>()
    val balance : LiveData<Double>
                    get() = _balance

    init {
        this.accNo = accNo
        this.owner = owner
        this._balance.value = balance
    }

    fun deposit(amout: Double) {
        _balance.value = (_balance.value)?.plus(amout)
    }

    fun witdraw(amount:Double){
        _balance.value = (_balance.value)?.minus(amount)
    }

}