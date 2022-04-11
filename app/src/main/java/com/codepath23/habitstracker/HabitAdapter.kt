package com.codepath23.habitstracker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HabitAdapter(val context: Context) : RecyclerView.Adapter<HabitAdapter.ViewHolder>() {
    class ViewHolder(iView: View) : RecyclerView.ViewHolder(iView) {
        lateinit var ivHabitPicture: ImageView
        lateinit var tvHabitDescription: TextView
        lateinit var tvHabitDuration: TextView


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_habit, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: HabitAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    fun clear() {
        TODO("not implemented yet")
    }

    fun addAll(newHabits: List<Int>) {
        TODO("not implemented yet")
    }
}