package com.macoscope.ketchuplunch.view.lunch

import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.macoscope.ketchuplunch.R
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.frameLayout
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.recyclerview.v7.recyclerView

class LunchMenuUI(val listAdapter: LunchMenuAdapter) : AnkoComponent<Fragment> {
    override fun createView(ui: AnkoContext<Fragment>): View {
        return with(ui) {
            frameLayout() {
                lparams(width = matchParent, height = matchParent)
                recyclerView {
                    id = R.id.lunch_menu_list
                    lparams(width = matchParent, height = matchParent)
                    layoutManager = LinearLayoutManager(ctx)
                    adapter = listAdapter
                    addItemDecoration(StickyRecyclerHeadersDecoration(listAdapter))
                }
            }
        }
    }
}

