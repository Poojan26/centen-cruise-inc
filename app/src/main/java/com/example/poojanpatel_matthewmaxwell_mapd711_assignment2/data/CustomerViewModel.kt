package com.example.poojanpatel_matthewmaxwell_mapd711_assignment2.data

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class CustomerViewModel : ViewModel(){
    // calling repository tasks and
    // sending the results to the Activity
    var liveDataCustomer: LiveData<CustomerModel>? = null
    var liveDataCruise: LiveData<CruiseModel>?=null

    //
    fun insertCustomer(context: Context, username: String, firstname: String, lastname:String, password: String, email:String, address:String,city:String,postalcode:String,phone:String) {
        CustomerRepository.insertCustomer(context, username, firstname,lastname,password,email,address,city,postalcode,phone)
    }

    fun getCustomers(context: Context, username: String) : LiveData<CustomerModel>? {
        liveDataCustomer = CustomerRepository.getCustomers(context, username)
        return liveDataCustomer
    }
}