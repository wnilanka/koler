package com.chooloo.www.chooloolib.ui.callitems

import android.view.View
import com.chooloo.www.chooloolib.adapter.CallItemsAdapter
import com.chooloo.www.chooloolib.data.call.Call
import com.chooloo.www.chooloolib.ui.list.ListFragment
import javax.inject.Inject

class CallItemsFragment : ListFragment<Call, CallItemsAdapter>(), CallItemsContract.View {
    @Inject override lateinit var controller: CallItemsContract.Controller<CallItemsFragment>


    override fun showEmpty(isShow: Boolean) {
        binding.apply {
            empty.emptyIcon.visibility = View.GONE
            empty.emptyText.visibility = View.GONE
            itemsScrollView.visibility = if (isShow) View.GONE else View.VISIBLE
        }
    }


    companion object {
        fun newInstance() = CallItemsFragment()
    }
}