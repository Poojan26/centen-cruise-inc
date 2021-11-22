package com.example.poojanpatel_matthewmaxwell_mapd711_assignment2.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cruise")
data class CruiseModel(
        //defining a column CruiseName
        @ColumnInfo(name = "cruisename")
        var CruiseName: String,
        //defining a column VisitingPlaces
        @ColumnInfo(name = "visitingplaces")
        var VisitingPlaces: String,
        //defining a column Price
        @ColumnInfo(name = "price")
        var Price: String,
        //defining a column Duration
        @ColumnInfo(name = "duration")
        var Duration: String,

        )
{
    //defining a primary key field Id
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "cruiseid")
    var cruiseId: Int? = null
}


