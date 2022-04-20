package com.codepath23.habitstracker.network

import android.app.Application
import com.codepath23.habitstracker.R
import com.codepath23.habitstracker.model.Habit
import com.parse.Parse
import com.parse.ParseObject

class HabitsTrackerApp : Application() {
    override fun onCreate() {
        super.onCreate()

        ParseObject.registerSubclass(Habit::class.java)

        Parse.initialize(
            Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.back4app_app_id))
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                .build()
        )
    }
}