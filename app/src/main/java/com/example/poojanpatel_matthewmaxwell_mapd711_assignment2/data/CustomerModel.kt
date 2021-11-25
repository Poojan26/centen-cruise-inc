package com.example.poojanpatel_matthewmaxwell_mapd711_assignment2.data
/*Name: Poojan Patel
ID: 301228811
Name: Matthew Maxwell
ID: 301200258
Course: MAPD-711
Assignment: Assignment-4 */
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//Room entity data class - model
//This class describes a database table
@Entity(tableName = "customer")
data class CustomerModel(
//defining a column FirstName
    @ColumnInfo(name = "firstname")
    var FirstName: String,
    //defining a column LastName
    @ColumnInfo(name = "lastname")
    var LastName: String,
    //defining a column UserName
    @ColumnInfo(name = "username")
    var UserName: String,
    //defining a column Password
    @ColumnInfo(name = "password")
    var Password: String,
    //defining a column Email
    @ColumnInfo(name = "email")
    var Email: String,
    //defining a column Address
    @ColumnInfo(name = "address")
    var address: String,
    //defining a column City
    @ColumnInfo(name = "city")
    var City: String,
    //defining a column PostalCode
    @ColumnInfo(name = "postcode")
    var PostalCode: String,
    //defining a column Phone
    @ColumnInfo(name = "phone")
    var Phone: String,

)
{
    //defining a primary key field Id
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "customerid")
    var customerId: Int? = null
}

