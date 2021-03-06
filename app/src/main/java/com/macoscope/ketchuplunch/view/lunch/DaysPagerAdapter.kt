package com.macoscope.ketchuplunch.view.lunch

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class DaysPagerAdapter(fm: FragmentManager, val weekIndex: Long) : FragmentStatePagerAdapter(fm) {

    companion object {
        val UNDEFINED_WEEK_INDEX: Long = Long.MIN_VALUE
    }

    override fun getItem(position: Int): Fragment {
        return when (weekIndex) {
            UNDEFINED_WEEK_INDEX -> LunchMenuEmptyFragment.newInstance()
            else -> LunchMenuFragment.newInstance(weekIndex, position)
        }
    }

    override fun getCount(): Int {
        return 5
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Mon"
            1 -> return "Tue"
            2 -> return "Wed"
            3 -> return "Thu"
            4 -> return "Fri"
            else -> return ""
        }
    }
}