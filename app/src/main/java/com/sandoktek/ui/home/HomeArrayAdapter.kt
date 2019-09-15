package com.sandoktek.ui.home

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.sandoktek.data.model.Transaction
import android.widget.TextView
import android.view.LayoutInflater
import android.widget.ImageView
import com.sandoktek.R


class HomeArrayAdapter(private val values: List<Transaction>, context: Context)
    : ArrayAdapter<Transaction>(context, -1, values) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView = inflater.inflate(R.layout.home_item, parent, false)
        rowView.findViewById<TextView>(R.id.name).apply {
            text = values[position].name
        }
        rowView.findViewById<ImageView>(R.id.image).apply {
            setImageResource(values[position].imageId)
        }
        rowView.findViewById<TextView>(R.id.value).apply {
            text = values[position].amount
        }
        return rowView
    }
}