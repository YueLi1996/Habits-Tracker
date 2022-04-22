package com.codepath23.habitstracker.model

import com.parse.ParseClassName
import com.parse.ParseObject
import com.parse.ParseUser

@ParseClassName("Habit")
class Habit : ParseObject() {

    fun getUser(): ParseUser? {
        return getParseUser("user")
    }

    fun setUser(user: ParseUser) {
        put(KEY_USER, user)
    }

    fun getName(): String? {
        return getString(KEY_NAME)
    }

    fun setName(name: String) {
        put(KEY_NAME, name)
    }

    fun getDescription(): String? {
        return getString(KEY_DESCRIPTION)
    }

    fun setDescription(description: String) {
        put(KEY_DESCRIPTION, description)
    }

    fun setFrequencyDay(day: Int) {
        put(KEY_FREQUENCY_DAYS, day)
    }

    fun getFrequencyDay(): Int? {
        return getInt(KEY_FREQUENCY_DAYS)
    }

    fun setFrequencyTime(time: Int) {
        put(KEY_FREQUENCY_N, time)
    }

    fun getFrequencyTime(): Int? {
        return getInt(KEY_FREQUENCY_N)
    }

    fun setStartTime(time: Int) {
        put(KEY_START_TIME, time)
    }

    fun getStartTime(): Int? {
        return getInt(KEY_START_TIME)
    }

    fun setEndTime(time: Int) {
        put(KEY_END_TIME, time)
    }

    fun getEndTime(): Int? {
        return getInt(KEY_END_TIME)
    }

    fun setProgress(progress: Int) {
        put(KEY_PROGRESS, progress)
    }

    fun getProgress(): Int? {
        return getInt(KEY_PROGRESS)
    }

    fun setCompleted(completed: Int) {
        put(KEY_COMPLETED, completed)
    }

    fun getCompleted(): Int? {
        return getInt(KEY_COMPLETED)
    }

    fun totalFrequency(): String? {
        return "Every ${getFrequencyDay().toString()} day(s) for ${getFrequencyTime()} " +
                "time(s) from ${getStartTime()} to ${getEndTime()}"
    }

    companion object {
        const val KEY_USER = "user"
        const val KEY_NAME = "name"
        const val KEY_DESCRIPTION = "description"
        const val KEY_FREQUENCY_DAYS = "repeatDays" // for every n number of days
        const val KEY_FREQUENCY_N = "repeatTime"    // for every n times per day
        const val KEY_START_TIME = "startTime"      // am - startTime < endTime (0 - 2400)
        const val KEY_END_TIME = "endTime"          // pm - endTime > startTime (0 - 2400)
        const val KEY_PROGRESS = "progressSoFar"    // number of times completed
        const val KEY_COMPLETED = "completed"       // number of times this habit completed
    }
}