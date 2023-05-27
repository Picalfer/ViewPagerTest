package com.landfathich.viewpagertest.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.landfathich.viewpagertest.databinding.ItemCityBinding
import com.landfathich.viewpagertest.holders.PagerViewCityHolder
import com.landfathich.viewpagertest.models.PagerCityItem

class ViewPagerCityAdapter : RecyclerView.Adapter<PagerViewCityHolder>() {
    private val items = mutableListOf<PagerCityItem>()
    private lateinit var itemBinding: ItemCityBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewCityHolder {
        val inflater = LayoutInflater.from(parent.context)
        itemBinding = ItemCityBinding.inflate(inflater, parent, false)
        val view = itemBinding.root
        return PagerViewCityHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: PagerViewCityHolder, position: Int) {
        holder.onBind(items[position], itemBinding)
    }

    fun setItems(list: List<PagerCityItem>) {
        items.clear()
        items.addAll(list)
    }
}