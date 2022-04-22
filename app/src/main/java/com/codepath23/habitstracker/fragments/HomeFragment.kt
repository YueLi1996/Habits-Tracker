package com.codepath23.habitstracker.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codepath23.habitstracker.HabitAdapter
import com.codepath23.habitstracker.R
import com.codepath23.habitstracker.model.Habit
import com.parse.ParseQuery

class HomeFragment : Fragment() {
    lateinit var rvHabits: RecyclerView
    lateinit var adapter: HabitAdapter
    lateinit var habits: MutableList<Habit>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        habits = mutableListOf()
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().title = "HabitsTracker"

        rvHabits = view.findViewById(R.id.habitsRecyclerView)
        adapter = HabitAdapter(requireContext(), habits)
        rvHabits.adapter = adapter
        rvHabits.layoutManager = LinearLayoutManager(requireContext())

        queryHabits()
    }

    fun queryHabits() {
        val query: ParseQuery<Habit> = ParseQuery.getQuery(Habit::class.java)
        query.include(Habit.KEY_USER)
        query.addDescendingOrder("createdAt")
        query.limit = 5
        query.findInBackground { receivedHabits, e ->
            if (e != null) {
                Log.e(TAG, "Failed to query habits: $e")
            } else {
                if (receivedHabits != null) {
                    for (habit in receivedHabits) {
                        Log.i(TAG, "Habit: " + habit.getName())
                    }
                    habits.addAll(receivedHabits)
                    adapter.notifyDataSetChanged()
                }
            }
        }
    }

    companion object {
        const val TAG = "Home"
    }
}