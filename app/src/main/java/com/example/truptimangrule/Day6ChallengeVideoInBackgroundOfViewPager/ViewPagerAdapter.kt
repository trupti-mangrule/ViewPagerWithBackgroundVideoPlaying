package com.example.truptimangrule.day6challenge



/**
 * Created by trupti.mangrule on 08/02/18.
 */

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Created by trupti.mangrule on 08/02/18.
 */


class ViewPagerAdapter(fm: FragmentManager, internal var context: Context) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

       return BlankFragment.newInstance((position%5)+1)
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        /*if(position==5){
            return BlankFragment.newInstance(5-position)
        }else{
            return BlankFragment.newInstance(position + 1)
        }*/

    }

    override fun getCount(): Int {
        // Show 3 total pages.
       // return 6
       return Int.MAX_VALUE
    }


}