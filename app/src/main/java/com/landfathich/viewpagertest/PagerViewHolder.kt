package com.landfathich.viewpagertest

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class PagerViewHolder(private val binding: View) : RecyclerView.ViewHolder(binding.root) {
    // в этом методе мы передаем данные из PagerItem в нашу верстку item.xml
    fun onBind(item: PagerItem) {
        // корневой элемент item.xml
        binding.container.setBackgroundColor(item.color)
        // текстовое поле
        binding.textView.text = item.text
    }
}