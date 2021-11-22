package com.example.poojanpatel_matthewmaxwell_mapd711_assignment2.data

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


interface CustomerDao {
    //defining an insert method using @Insert Annotation
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCustomer(customerModel: CustomerModel)

    //defining a query method using @Query Annotation
    @Query("SELECT * FROM customer WHERE UserName =:username")
    fun getCustomers(username: String?) : LiveData<CustomerModel>

    //defining an insert method using @Insert Annotation
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCruise(cruiseModel: CruiseModel)

    //defining a query method using @Query Annotation
    @Query("SELECT * FROM cruise WHERE CruiseName =:cruisename")
    fun getCruise(cruisename: String?) : LiveData<CruiseModel>
}