package com.codepath23.habitstracker.network

import android.app.Application
import com.codepath23.habitstracker.model.Habit
import com.parse.Parse
import com.parse.ParseObject

class HabitsTrackerApp : Application() {
    override fun onCreate() {
        super.onCreate()

        ParseObject.registerSubclass(Habit::class.java)

        Parse.initialize(
            Parse.Configuration.Builder(this)
                .applicationId("NGh8lwSUJozGeSbrONaYjWIaq9jcJPZDmEgY7DRI")
                .clientKey("vRXtocGXXtWqPgab4yMuV7xXy87YYTbbFgLaPgh3")
                .server("https://parseapi.back4app.com")
                .build()
        )
    }
}