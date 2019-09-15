package com.sandoktek.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sandoktek.R
import com.sandoktek.data.model.Transaction

class HomeViewAdapter(private val items : List<Transaction>)
    : RecyclerView.Adapter<HomeItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeItemViewHolder {
        return HomeItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.home_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: HomeItemViewHolder, position: Int) {
        holder.update(items[position])
    }
}

class HomeItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun update(transaction: Transaction) {
        itemView.findViewById<ImageView>(R.id.image).setImageResource(transaction.imageId)
        itemView.findViewById<TextView>(R.id.name).text = transaction.name
        itemView.findViewById<TextView>(R.id.value).text = transaction.amount
    }


}