package com.codepath23.habitstracker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.codepath23.habitstracker.model.Habit

class HabitAdapter(val context: Context,
                   val habits: MutableList<Habit>,
                   private val onItemClicked: (position: Int) -> Unit) : RecyclerView.Adapter<HabitAdapter.ViewHolder>() {
    inner class ViewHolder(iView: View) : RecyclerView.ViewHolder(iView), View.OnLongClickListener {
        lateinit var ivHabitPicture: ImageView
        lateinit var tvHabitTitle: TextView
        lateinit var tvHabitDescription: TextView
        lateinit var tvHabitDuration: TextView

        init {
            ivHabitPicture = iView.findViewById(R.id.habitPicture)
            tvHabitTitle = iView.findViewById(R.id.habitTitle)
            tvHabitDescription = iView.findViewById(R.id.habitDescription)
            tvHabitDuration = iView.findViewById(R.id.habitDuration)
            iView.setOnLongClickListener(this)
        }

        fun bind(habit: Habit) {
            tvHabitTitle.text = habit.getName()
            tvHabitDescription.text = habit.getDescription()
            tvHabitDuration.text = habit.totalFrequency()
        }

        override fun onLongClick(v: View): Boolean {
            val position = adapterPosition
            onItemClicked(position)
            return true
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_habit, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: HabitAdapter.ViewHolder, position: Int) {
        val habit = habits[position]
        holder.bind(habit)
    }

    override fun getItemCount(): Int {
        return habits.size
    }

    fun clear() {
        habits.clear()
        notifyDataSetChanged()
    }

    fun addAll(newHabits: List<Habit>) {
        habits.addAll(newHabits)
        notifyDataSetChanged()
    }

}