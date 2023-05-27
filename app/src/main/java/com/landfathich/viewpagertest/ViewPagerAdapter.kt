package com.landfathich.viewpagertest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter : RecyclerView.Adapter<PagerViewHolder>() {
    // здесь хранится список наших объектов с цветом и текстом
    private val items = mutableListOf<PagerItem>()

    // В этом методе создается ViewHolder и к нему привязывается наш item.xml
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder =
        PagerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))

    // Этот метод возвращает количество элементов в items, иногда полезно
    override fun getItemCount(): Int = items.size

    // в этом методе передаются данные из items в layout
    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.onBind(items[position])
    }

    // этот метод наполняет список items, нужен, чтобы делать это извне
    fun setItems(list: List<PagerItem>) {
        items.clear()
        items.addAll(list)
    }
}