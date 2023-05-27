package com.landfathich.viewpagertest.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.landfathich.viewpagertest.databinding.ItemColorBinding
import com.landfathich.viewpagertest.models.PagerItem

class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    // в этом методе мы передаем данные из PagerItem в нашу верстку item.xml
    fun onBind(item: PagerItem, itemBinding: ItemColorBinding) {
        // корневой элемент item.xml
        itemBinding.container.setBackgroundColor(item.color)
        // текстовое поле
        itemBinding.textView.text = item.text
        itemBinding.textView.setTextColor(item.textColor)
    }
}