package com.example.poojanpatel_matthewmaxwell_mapd711_assignment2.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
/*Name: Poojan Patel
ID: 301228811
Name: Matthew Maxwell
ID: 301200258
Course: MAPD-711
Assignment: Assignment-4 */
@Database(
    entities = [
        CustomerModel::class,
        CruiseModel::class,
        //BookingModel::class,

    ],version = 1, exportSchema = false)
abstract class CustomerDatabase : RoomDatabase() {
    //instantiating Customer DAO object
    abstract fun customerDao() : CustomerDao

    //companion object means an object declaration inside a class
    companion object {

        //Volatile object or property is immediately made visible to other threads.
        @Volatile
        private var INSTANCE: CustomerDatabase? = null

        //create a database name "CustomerDB"
        fun getDatabaseClient(context: Context) : CustomerDatabase {

            if (INSTANCE != null) return INSTANCE!!

            synchronized(this) {

                INSTANCE = Room
                    .databaseBuilder(context, CustomerDatabase::class.java, "CUSTOMERDB")
                    .fallbackToDestructiveMigration()
                    .build()

                return INSTANCE!!

            }
        }
    }
}