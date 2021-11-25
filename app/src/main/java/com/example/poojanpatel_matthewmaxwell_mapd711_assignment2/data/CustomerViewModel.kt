package com.example.poojanpatel_matthewmaxwell_mapd711_assignment2.data
/*Name: Poojan Patel
ID: 301228811
Name: Matthew Maxwell
ID: 301200258
Course: MAPD-711
Assignment: Assignment-4 */
import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.DisposableHandle
import kotlinx.coroutines.launch

class CustomerViewModel : ViewModel() {
    // calling repository tasks and
    // sending the results to the Activity
    var liveDataCustomer: LiveData<CustomerModel>? = null
    var liveDataCruise: LiveData<CruiseModel>? = null

    //
    fun insertCustomer(
        context: Context,
        username: String,
        firstname: String,
        lastname: String,
        password: String,
        email: String,
        address: String,
        city: String,
        postalcode: String,
        phone: String
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            CustomerRepository.insertCustomer(
                context,
                username,
                firstname,
                lastname,
                password,
                email,
                address,
                city,
                postalcode,
                phone
            )
        }


    }
    fun getCustomers(context: Context, username: String): LiveData<CustomerModel>? {
        //viewModelScope.launch  (Dispatchers.IO) {
            liveDataCustomer = CustomerRepository.getCustomers(context, username)
            return liveDataCustomer
        //}
    }
}