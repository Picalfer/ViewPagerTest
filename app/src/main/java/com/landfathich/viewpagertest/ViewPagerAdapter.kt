package com.landfathich.viewpagertest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.landfathich.viewpagertest.databinding.ItemBinding

class ViewPagerAdapter : RecyclerView.Adapter<PagerViewHolder>() {
    // здесь хранится список наших объектов с цветом и текстом
    private val items = mutableListOf<PagerItem>()
    private lateinit var itemBinding: ItemBinding

    // В этом методе создается ViewHolder и к нему привязывается наш item.xml
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        itemBinding = ItemBinding.inflate(inflater, parent, false)
        val view = itemBinding.root
        return PagerViewHolder(view)
    }

    // Этот метод возвращает количество элементов в items, иногда полезно
    override fun getItemCount(): Int = items.size

    // в этом методе передаются данные из items в layout
    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.onBind(items[position], itemBinding)
    }

    // этот метод наполняет список items, нужен, чтобы делать это извне
    fun setItems(list: List<PagerItem>) {
        items.clear()
        items.addAll(list)
    }
}